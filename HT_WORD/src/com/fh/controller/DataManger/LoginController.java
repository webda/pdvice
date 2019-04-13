package com.fh.controller.DataManger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.service.app.MenuService;
import com.fh.service.app.UsersService;
import com.fh.service.system.appuser.AppuserManager; 
import com.fh.service.system.fhbutton.FhbuttonManager;
import com.fh.service.system.fhlog.FHlogManager;  
import com.fh.entity.Page;
import com.fh.entity.app.Menu;
import com.fh.entity.app.Users; 
import com.fh.util.AppUtil;
import com.fh.util.Const;
import com.fh.util.DateUtil;
import com.fh.util.Jurisdiction;
import com.fh.util.MD5;
import com.fh.util.PageData;
import com.fh.util.RightsHelper;
import com.fh.util.Tools; 
/**
 * 总入口
 * HFTC]
 * 修改日期：2018/11/16
 */
/**
 * @author Administrator
 *
 */
@Controller
public class LoginController extends BaseController {

	@Resource(name="UsersServiceImpl")
	private UsersService UsersService;
	@Resource(name="MenuServiceImpl")
	private MenuService MenuService;
	@Resource(name="fhbuttonService")
	private FhbuttonManager fhbuttonService; 
	@Resource(name="fhlogService")
	private FHlogManager FHLOG; 
	
	/**访问登录页
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/login")
	public ModelAndView toLogin()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
	 
		mv.setViewName("system/index/login");
		
		mv.addObject("pd",pd);
		return mv;
	}
	
	/**请求登录，验证用户
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/login" ,produces="application/json;charset=UTF-8")
	@ResponseBody
	public Object login()throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String errInfo = "";
		String KEYDATA[] = pd.getString("KEYDATA").split(",fh,");
		if(null != KEYDATA && KEYDATA.length == 3){
			Session session = Jurisdiction.getSession();
			String sessionCode = (String)session.getAttribute(Const.SESSION_SECURITY_CODE);		//获取session中的验证码
		 
				String USERNAME = KEYDATA[0];	//登录过来的用户名
				String PASSWORD  = KEYDATA[1];	//登录过来的密码
				pd.put("name", USERNAME);
 
					String passwd =  MD5.md5(PASSWORD);	//密码加密
					pd.put("pwd", passwd);
					pd = UsersService.getUserByNameAndPwd(pd);	//根据用户名和密码去读取用户信息
					if(pd != null){
						this.removeSession(USERNAME);//请缓存
						pd.put("LAST_LOGIN",DateUtil.getTime().toString());
						map.put("list", pd);
						Users user = new Users();
						user.setId((int) pd.get("id") );
						user.setName(pd.getString("name"));
				 
						session.setAttribute(Const.SESSION_USER, user);			//把用户信息放session中
						session.setAttribute("SESSION_USER_id", user.getId());
						session.removeAttribute(Const.SESSION_SECURITY_CODE);	//清除登录验证码的session
						//shiro加入身份验证
						Subject subject = SecurityUtils.getSubject(); 
					    UsernamePasswordToken token = new UsernamePasswordToken(USERNAME, PASSWORD); 
					    try { 
					        subject.login(token); 
					    } catch (AuthenticationException e) { 
					    	errInfo = "身份验证失败！";
					    }
					  
					    errInfo = "success";					//验证成功
				 
					}else{
						errInfo = "usererror"; 				//用户名或密码有误
						logBefore(logger, USERNAME+"登录系统密码或用户名错误");
						FHLOG.save(USERNAME, "登录系统密码或用户名错误");
					}
			 
			 
			 
		}else{
			errInfo = "error";	//缺少参数
		}
		map.put("result", errInfo);
		return AppUtil.returnObject(new PageData(), map);
	}
	/**
	 * 清理session
	 */
	public void removeSession(String USERNAME){
		Session session = Jurisdiction.getSession();	//以下清除session缓存
		session.removeAttribute(Const.SESSION_USER);
		session.removeAttribute(USERNAME + Const.SESSION_ROLE_RIGHTS);
		session.removeAttribute(USERNAME + Const.SESSION_allmenuList);
		session.removeAttribute(USERNAME + Const.SESSION_menuList);
		session.removeAttribute(USERNAME + Const.SESSION_QX);
		session.removeAttribute(USERNAME + Const.SESSION_QX2);
		session.removeAttribute(Const.SESSION_userpds);
		session.removeAttribute(Const.SESSION_USERNAME);
		session.removeAttribute(Const.SESSION_U_NAME);
		session.removeAttribute(Const.SESSION_USERID);
		session.removeAttribute(Const.SESSION_USERROL);
		session.removeAttribute("changeMenu");
		session.removeAttribute("DEPARTMENT_IDS");
		session.removeAttribute("DEPARTMENT_ID");
		session.removeAttribute("USER_ID_NEW");//alter hftc 2018 10 15 增加登录用户ID
	}
	

	/**访问系统首页
	 * @param changeMenu：切换菜单参数
	 * @return
	 */
	@RequestMapping(value="/main")
	public ModelAndView login_index(){
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		try{
			Session session = Jurisdiction.getSession();
			Users user = (Users)session.getAttribute(Const.SESSION_USER);						//读取session中的用户信息(单独用户信息)
			if (user != null) {
				Users userr = (Users)session.getAttribute(Const.SESSION_USERROL);				//读取session中的用户信息(含角色信息)
				if(null != userr){
					 			//通过用户ID读取用户信息和角色信息
			 
					user = userr;
				}
				
			 											//获取用户角色
				 				//放入用户姓名到session
				//this.setAttributeToAllDEPARTMENT_ID(session, USERNAME);	
				//把用户的组织机构权限放到session里面
			 
				List<Menu> menuList =MenuService.listAllMenuQx(0); 
					 
				//this.getRemortIP(USERNAME);	//更新登录IP
				mv.setViewName("system/index/main");
				mv.addObject("user", user);
				mv.addObject("menuList", menuList);
				mv.addObject("SKIN",session.getAttribute(Const.SKIN)); 	//用户皮肤
			 
			}else {
				mv.setViewName("system/index/login");	//session失效后跳转登录页面
			}
		} catch(Exception e){
			mv.setViewName("system/index/login");
			logger.error(e.getMessage(), e);
		}
		pd.put("SYSNAME", Tools.readTxtFile(Const.SYSNAME)); //读取系统名称
		mv.addObject("pd",pd);
		return mv;
	}
	
	@RequestMapping(value="/tab")
	public String tab(){
		return "system/index/tab";
	}
}
