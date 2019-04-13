package com.fh.util;

import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

 

/**
 * 权限处理
 * @author:  HFTC
 * 修改日期：2018/11/15
*/
public class Jurisdiction {

	/**
	 * 访问权限及初始化按钮权限(控制按钮的显示 增删改查)
	 * @param menuUrl  菜单路径
	 * @return
	 */
 
	/**
	 * 按钮权限(方法中校验)
	 * @param menuUrl  菜单路径
	 * @param type  类型(add、del、edit、cha)
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static boolean buttonJurisdiction(String menuUrl, String type){
		//判断是否拥有当前点击菜单的权限（内部过滤,防止通过url进入跳过菜单权限）
		/**
		 * 根据点击的菜单的xxx.do去菜单中的URL去匹配，当匹配到了此菜单，判断是否有此菜单的权限，没有的话跳转到404页面
		 * 根据按钮权限，授权按钮(当前点的菜单和角色中各按钮的权限匹对)
		 
		String USERNAME = getUsername();	//获取当前登录者loginname
		Session session = getSession();
		List<Menu> menuList = (List<Menu>)session.getAttribute(USERNAME + Const.SESSION_allmenuList); //获取菜单列表
		return readMenuButton(menuList,menuUrl,session,USERNAME,type);*/
		return true;
	}
	
	/**校验按钮权限(递归处理)
	 * @param menuList:传入的总菜单(设置菜单时，.do前面的不要重复)
	 * @param menuUrl:访问地址
	 * @return
	 */
	@SuppressWarnings("unchecked")
 
	
	/**获取当前登录的用户名
	 * @return
	 */
	public static String getUsername(){
		String a="";
		if( getSession().getAttribute(Const.SESSION_USERNAME)!=null )
			 a=getSession().getAttribute(Const.SESSION_USERNAME).toString();
		
		return a;
	}
	
	/**获取当前登录的用户ID
	 * @return
	 */
	public static String getUserID(){
		String a="";
		if( getSession().getAttribute(Const.SESSION_USERID)!=null )
			 a=getSession().getAttribute(Const.SESSION_USERID).toString();
		
		return a;
	}
	
	/**获取当前登录的用户名
	 * @return
	 */
	public static String getAppUsername(){
		String a="";
		if( getSession().getAttribute(Const.SESSION_APPUSERNAME)!=null )
			 a=getSession().getAttribute(Const.SESSION_APPUSERNAME).toString();
		
		return a;
	}
	
	
	/**获取当前登录的用户名
	 * @return
	 */
	public static String getAppUserID(){
		String a="";
		if( getSession().getAttribute(Const.SESSION_APPUSERID)!=null )
			 a=getSession().getAttribute(Const.SESSION_APPUSERID).toString();
		
		return a;
	}
	
	
	/**获取当前登录的用户姓名
	 * @return
	 */
	public static String getU_name(){
		return getSession().getAttribute(Const.SESSION_U_NAME).toString();
	}
	
	/**获取用户的最高组织机构权限集合
	 * @return
	 */
	public static String getDEPARTMENT_IDS(){
		return getSession().getAttribute(Const.DEPARTMENT_IDS).toString();
	}
	
	/**获取用户的最高组织机构权限
	 * @return
	 */
	public static String getDEPARTMENT_ID(){
		return getSession().getAttribute(Const.DEPARTMENT_ID).toString();
	}
	
	/**获取当前按钮权限(增删改查)
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> getHC(){
		return (Map<String, String>)getSession().getAttribute(getUsername() + Const.SESSION_QX);
	}
	
	/**shiro管理的session
	 * @return
	 */
	public static Session getSession(){
		//Subject currentUser = SecurityUtils.getSubject();  
		return SecurityUtils.getSubject().getSession();
	}
}
