package com.fh.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.fh.entity.system.User;
import com.fh.entity.app.Users;
import com.fh.entity.system.AppUser;
import com.fh.util.Const;
import com.fh.util.Jurisdiction;
/**
 * 
* 类名称：登录过滤，权限验证
* 类描述： 
* @author HFTC
* 作者单位： 
* 联系方式：
* 创建时间：2018年09月15日
* @version 1.6
 */
public class LoginHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		String appname2="";
		appname2=(String)Jurisdiction.getSession().getAttribute(Const.SESSION_APPUSERNAME);	//获取登录学生用户名
		if(appname2==null) 
		{
			
			String paths = request.getServletContext().getContextPath();
			int endIndex = paths.lastIndexOf("/");
			String path2 = paths.substring(0, endIndex);
			//((HttpServletRequest)request).getRequestDispatcher(path2 + "/QT_WORD");
			
		//	request.getRequestDispatcher("http://localhost:8080/QT_WORD/").forward(request, response);

        }*/
		
		
		String path = request.getServletPath();
		System.out.println("********1"+path);
	if((path.matches(Const.NO_INTERCEPTOR_PATH) && !path.contains("appuser"))||
			(path.contains("appuser") && (path.contains("login"))) 
			||path.contains("appusers") ){  //对不匹配的URL 不进行拦截
			System.out.println("********4"+path);
			return true;
		}else{
			Users user = (Users)Jurisdiction.getSession().getAttribute(Const.SESSION_USER);
			//AppUser APPuser = (AppUser)Jurisdiction.getSession().getAttribute(Const.SESSION_APPUSER);
			String appname="";
			
			appname=(String)Jurisdiction.getSession().getAttribute(Const.SESSION_APPUSERNAME);	//获取登录学生用户名
			
        if(appname!=null) return true;
			else //登陆过滤
				{  
				
				
			if( user==null && appname==null)//系统用户没有登录
					{
						
						if (LoginHandlerInterceptor.isAjaxRequest(request)){
			                response.setHeader("sessionstatus", "timeout"); 
			                return false;
			               
						}
					}
			}
			
				
			if(user!=null ){
				path = path.substring(1, path.length());
				System.out.println("********5"+path);
				boolean b =true;// Jurisdiction.hasJurisdiction(path); //访问权限校验
				if(!b){
					response.sendRedirect(request.getContextPath() + Const.LOGIN);
					System.out.println( "********2"+request.getContextPath()  );
				}
				return b;
					
			}else{
				//登陆过滤
				response.sendRedirect(request.getContextPath() + Const.LOGIN);
				System.out.println( "********3"+request.getContextPath()  );
				return false;		
			}
			
	
			
			
		}
	}
	
	public static boolean isAjaxRequest(HttpServletRequest request){
            // boolean result = false;
        	String headerX = request.getHeader("X-Requested-With");           
            return headerX != null  && headerX.equalsIgnoreCase("XMLHttpRequest");         
         
    }
	
}
