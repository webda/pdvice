package com.fh.controller.DataManger;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.entity.app.UserRegList;
import com.fh.entity.app.UserRegListAndUser;
import com.fh.entity.app.Users;
import com.fh.service.app.UserRegListService;
 
import com.fh.util.Const;
import com.fh.util.Jurisdiction;
import com.fh.util.PageData;

@Controller
@RequestMapping(value="/UserRegList")
public class UserRegListManagerController  extends BaseController {

	@Resource(name="UserRegListServiceImpl")
	private UserRegListService UserRegListService;
	
 
	
	@RequestMapping(value="/UserRegListlist")
	public ModelAndView UserRegListlist()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		Session session = Jurisdiction.getSession();
		Users users = (Users)session.getAttribute(Const.SESSION_USER);
		pd = this.getPageData();
		List<UserRegListAndUser> UserRegListList =UserRegListService.SelectUserRegListAndUser(pd); 
		mv.setViewName("UserRegList/UserRegList_list");
		mv.addObject("UserRegListList", UserRegListList);
		mv.addObject("users", users);
		return mv;
	}
	
	 
	@RequestMapping(value="/delete")
	public void deleteU(PrintWriter out) throws Exception{
		 
		PageData pd = new PageData();
		pd = this.getPageData();
		UserRegListService.deleteUserRegList(pd); 
		out.write("success");
		out.close();
	}
}
