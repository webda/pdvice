package com.fh.controller.DataManger;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.entity.app.Menu;
import com.fh.entity.app.Role;
import com.fh.entity.app.UserRole;
import com.fh.entity.app.Users;
import com.fh.service.app.RoleService;
import com.fh.service.app.UsersService;
import com.fh.util.Const;
import com.fh.util.Jurisdiction;
import com.fh.util.PageData;

@Controller
@RequestMapping(value="/user")
public class UserManagerController  extends BaseController {
	@Resource(name="UsersServiceImpl")
	private UsersService UsersService;
	
	@Resource(name="RoleServiceImpl")
	private RoleService RoleService;
	

	@Resource(name="UserRoleServiceImpl")
	private com.fh.service.app.UserRoleService UserRoleService;
 
	
	@RequestMapping(value="/userlist")
	public ModelAndView userlist()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		Session session = Jurisdiction.getSession();
		Users users = (Users)session.getAttribute(Const.SESSION_USER);
		pd = this.getPageData();
		List<Users> userList =UsersService.SelectUserss(pd); 
		mv.setViewName("user/user_list");
		mv.addObject("userList", userList);
		mv.addObject("users", users);
		return mv;
	}
	
	@RequestMapping(value="/toAdd")
	public ModelAndView toAdd(int pid)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		
		List<Role> rolist=RoleService.SelectRoles(pd);
		pd.put("pid", pid);
		mv.addObject("msg", "add");
		mv.addObject("rolist", rolist);
		List<UserRole> roleids=new ArrayList<UserRole>();
		
		mv.addObject("roleids", roleids);
		mv.addObject("pd", pd);
		mv.setViewName("user/user_edit"); 
		return mv;
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView add()throws Exception{
		 
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData(); 
			 
		 int id= UsersService.saveUsers(pd); 
		 String rids[]=((String)pd.get("rid")).split(",");
		 for(String rid:rids)
		 {
			 PageData urpd = new PageData();
			 urpd.put("rid", rid);
			 urpd.put("uid", id);
			 UserRoleService.saveUserRole(urpd);
			 
		 }
		 mv.addObject("msg","success");
		} catch(Exception e){
			logger.error(e.toString(), e);
			mv.addObject("msg","failed");
		}
		mv.setViewName("save_result");
		return mv;
	}
	@RequestMapping(value="/toEdit")
	public ModelAndView toEdit( int id )throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			pd.put("id", id);
			pd = UsersService.findByUiId(pd);
			List<Role> rolist=RoleService.SelectRoles(new PageData());
			mv.addObject("msg", "edit");
			mv.addObject("rolist", rolist);
			PageData rsd= new PageData();
			rsd.put("uid", id);
			List<UserRole> roleids=UserRoleService.SelectUserRoles(rsd);
			
			mv.addObject("roleids", roleids);
			mv.addObject("pd", pd);
			
			mv.setViewName("user/user_edit");
		} catch(Exception e){
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
	@RequestMapping(value="/edit")
	public ModelAndView edit()throws Exception{
		 
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			
			PageData oldpd = UsersService.findByUiId(pd);
			oldpd.put("name", pd.get("name"));
			oldpd.put("mobile", pd.get("mobile"));
			oldpd.put("email", pd.get("email"));
			oldpd.put("realname", pd.get("realname"));
			UsersService.editUsers(oldpd); 
			PageData depd = new PageData();
			depd.put("uid", oldpd.get("id"));
			UserRoleService.deleteUserRole(depd);
			 String rids[]=((String)pd.get("rid")).split(",");
			 for(String rid:rids)
			 {
				 PageData urpd = new PageData();
				 urpd.put("rid", rid);
				 urpd.put("uid", oldpd.get("id"));
				 UserRoleService.saveUserRole(urpd);
				 
			 }
			
			mv.addObject("msg","success");
		} catch(Exception e){
			logger.error(e.toString(), e);
			mv.addObject("msg","failed");
		}
		mv.setViewName("save_result");
		return mv;
	}
	
	@RequestMapping(value="/delete")
	public void deleteU(PrintWriter out) throws Exception{
		 
		PageData pd = new PageData();
		pd = this.getPageData();
		UsersService.deleteUsers(pd); 
		out.write("success");
		out.close();
	}
}
