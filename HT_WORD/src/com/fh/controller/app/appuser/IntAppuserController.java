package com.fh.controller.app.appuser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletResponse;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.controller.base.BaseController;
import com.fh.entity.app.Users;
import com.fh.entity.system.AppUser;
import com.fh.service.app.UsersService;
import com.fh.service.system.appuser.AppuserManager;
import com.fh.service.system.fhlog.FHlogManager;
import com.fh.service.system.fhlog.impl.FHlogService;
import com.fh.util.AppUtil;
import com.fh.util.Const;
import com.fh.util.DateUtil;
import com.fh.util.Jurisdiction;
import com.fh.util.MD5;
import com.fh.util.PageData;
import com.fh.util.RequestUtil;
import com.fh.util.Tools;
import com.sun.glass.ui.Application;


/**@author HFTC
  * 会员-接口类 
  * 相关参数协议：
  * 00	请求失败
  * 01	请求成功
  * 02	返回空值
  * 03	请求协议参数不完整    
  * 04  用户名或密码错误
  * 05  FKEY验证失败
 */
@Controller
@RequestMapping(value="/appuser")
public class IntAppuserController extends BaseController {
    
	@Resource(name="UsersServiceImpl")
	private UsersService UsersService;
	@Resource(name="fhlogService")
	private FHlogManager FHLOG;
	
	/**根据用户名获取会员信息
	 * @return 
	 */
	 
 
	
	/**请求登录，验证会员用户，用于用户前台登录
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/applogin_login" ,produces="application/json;charset=UTF-8")
	@ResponseBody
	public Object login(HttpServletRequest request)throws Exception{
		logBefore(logger, "根据用户名，密码进行会员验证");
		//Map<String,String> map = new HashMap<String,String>();
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
	     String errInfo = "";
	    String KEYDATA[] = pd.getString("KEYDATA").replaceAll("qq362218918hf", "").replaceAll("QQ1898765469tc", "").split(",fh,");
		if(null != KEYDATA && KEYDATA.length ==3){
			Session session = Jurisdiction.getSession();
			String sessionCode = (String)session.getAttribute(Const.SESSION_SECURITY_CODE);		//获取session中的验证码
	 
			
				String USERNAME = KEYDATA[0];	//登录过来的用户名
				String PASSWORD  = KEYDATA[1];	//登录过来的密码
				pd.put("name", USERNAME);
				 
				String passwd= MD5.md5(PASSWORD);
					pd.put("pwd", passwd);
					pd = UsersService.getUserByNameAndPwd(pd);	//根据用户名和密码去读取用户信息
					if(pd != null){
						Session agr0= Jurisdiction.getSession();
						Object Oappstarttime=agr0.getAttribute( Const.SESSION_APPUSERbetime+USERNAME);
						String appstarttime="";
						if(Oappstarttime!=null)appstarttime=Oappstarttime.toString();
						if(appstarttime.isEmpty()==false)
						sessionDestroyedDB(pd.getString("name"),appstarttime ); 
						this.removeSession(USERNAME);//请缓存
					 
						 
						// pd.put("USER_ID", value)
						//userService.updateLastLogin(pd);
				 
					 
						 
						 
						session.setAttribute(Const.SESSION_APPUSER_Pd, pd);			//把用户信息放session中
						session.setAttribute(Const.SESSION_APPUSERNAME, USERNAME);	//放入用户名到session,便于打印log
						session.setAttribute(Const.SESSION_APPUSERID, pd.get("id"));	//放入用户名到session,便于打印log
						String CREATETIME=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
						System.out.println("start time"+CREATETIME);
						session.setAttribute(Const.SESSION_APPUSERbetime+USERNAME,CREATETIME);	//放入用户名到session,便于打印log 
						Subject subject = SecurityUtils.getSubject(); 
					    UsernamePasswordToken token = new UsernamePasswordToken(USERNAME, PASSWORD); 
					    try { 
					       subject.login(token); 
					    } catch (AuthenticationException e) { 
					    	
					    	String paths = request.getServletContext().getContextPath();
							int endIndex = paths.lastIndexOf("/");
							String path = paths.substring(0, endIndex);
							((HttpServletRequest)request).getRequestDispatcher(path + "/QT_WORD"); //跳转前台
					    	
					    	errInfo = "身份验证失败！";
					    }
					}else{
						errInfo = "usererror"; 				//用户名或密码有误
						
						String paths = request.getServletContext().getContextPath();
						int endIndex = paths.lastIndexOf("/");
						String path = paths.substring(0, endIndex);
						((HttpServletRequest)request).getRequestDispatcher(path + "/QT_WORD"); //跳转前台
						
						logBefore(logger, USERNAME+"登录系统密码或用户名错误");
						FHLOG.save(USERNAME, "登录系统密码或用户名错误");
					}
			 
				if(Tools.isEmpty(errInfo)){
					
					HttpSession sessionshare =  request.getSession();
					sessionshare.setAttribute("name", pd.getString("name"));
	                double a=Math.random();
					String.valueOf(a);
					sessionshare.setAttribute("random", a);
					ServletContext ContextA =sessionshare.getServletContext();
					ContextA.setAttribute("sessionshare", sessionshare );
					errInfo = "sucess";					//验证成功
					map.put("random",a);
					logBefore(logger, USERNAME+"登录系统");
					FHLOG.save(USERNAME, "登录系统");
				}
			
		}
		map.put("result", errInfo);
		return AppUtil.returnObject(new PageData(), map);
	}
	
	
	public void sessionDestroyedDB(String userid,String appstarttime) {
		

		if(appstarttime!=null&&userid!=null)
		{
			
		PageData pd = new PageData();
		PageData pd2 = new PageData();
		String USERID=userid;
		//String a=arg0.getAttribute(Const.SESSION_APPUSERNAME).toString();
		String EndTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		//String EndTime="2018-11-18 00:28:55";
		//String CREATETIME=arg0.getAttribute(Const.SESSION_APPUSERbetime+a).toString(); 
		String CREATETIME=appstarttime;
	    String CREATETIME1=CREATETIME.substring(0, 10);
	    String EndTime1=EndTime.substring(0, 10);
	     
        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if( EndTime1.equals(CREATETIME1) )
        {
		try {
			long from = simpleFormat.parse(CREATETIME).getTime();  
			long to = simpleFormat.parse(EndTime).getTime();  
			float minutes = (float) ((to - from)/(1000 * 60));  
			//if(minutes>30)minutes=minutes-30;
			pd.put("USERID", USERID);
			pd.put("CZTIME", CREATETIME);
			pd.put("TOTALTIME", minutes );
			} catch(ParseException px) { px.printStackTrace();} 
		
		try {
			FHLOG.savelogtime(pd);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
        }else
		{ 
        	try
		{
			long from = simpleFormat.parse(CREATETIME).getTime();  
			String time=CREATETIME1+" 23:59:59";
			long to = simpleFormat.parse(time).getTime();  
			float minutes = (float) ((to - from)/(1000 * 60));  
			
			
			pd.put("USERID", USERID);
			pd.put("CZTIME", CREATETIME);
			//pd.put("TOTALTIME", minutes );
			
			String time2=EndTime1+" 00:00:00";
			long from2 = simpleFormat.parse(time2).getTime();  
			long to2 = simpleFormat.parse(EndTime).getTime();  
			float minutes2 = (float) ((to2 - from2)/(1000 * 60));  
			/*if(minutes2>=30)
				minutes2=minutes2-30;
			else
			{
				minutes=minutes-(30-minutes2);
				minutes2=0;
			}*/
			pd.put("TOTALTIME", minutes );
			pd2.put("USERID", USERID);
			pd2.put("CZTIME", time2);
			pd2.put("TOTALTIME", minutes2 );
			
			
			
			try {
				FHLOG.savelogtime(pd);
				FHLOG.savelogtime(pd2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}catch(ParseException px) {
            px.printStackTrace();
            } 
		}
		}
		
		}

	
		/**
		 * 清理session
		 */
		public void removeSession(String USERNAME){
			Session session = Jurisdiction.getSession();	//以下清除session缓存
			//session.removeAttribute(Const.SESSION_APPUSER);
			session.removeAttribute(Const.SESSION_APPUSERNAME);
			session.removeAttribute(Const.SESSION_APPUSERbetime+USERNAME);
			session.removeAttribute(Const.SESSION_APPUSERID);
			session.removeAttribute(Const.SESSION_appuserpds);
			
		}
 
	
 
	
	
	
	
	
	
	 

}
	
 