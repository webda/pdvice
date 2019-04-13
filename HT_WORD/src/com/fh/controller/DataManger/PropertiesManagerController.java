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
import com.fh.entity.app.Menu;
import com.fh.entity.app.Role;
import com.fh.entity.app.Users;
import com.fh.entity.app.Properties;
import com.fh.service.app.RoleService;
import com.fh.service.app.PropertiesService;
import com.fh.util.Const;
import com.fh.util.Jurisdiction;
import com.fh.util.PageData;

@Controller
@RequestMapping(value="/properties")
public class PropertiesManagerController  extends BaseController {
	@Resource(name="PropertiesServiceImpl")
	private PropertiesService PropertiesService; 
	@RequestMapping(value="/propertieslist")
	public ModelAndView propertieslist()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		Session session = Jurisdiction.getSession();
		Users Users = (Users)session.getAttribute(Const.SESSION_USER);
		pd = this.getPageData();
		pd.put("owner", Users.getId());
		List<Properties> propertiesList =PropertiesService.SelectPropertiess(pd); 
		mv.setViewName("properties/properties_list");
		mv.addObject("propertiesList", propertiesList);
		mv.addObject("Users", Users);
		return mv;
	}
	
	@RequestMapping(value="/toAdd")
	public ModelAndView toAdd(int pid)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		
 
		pd.put("creator", pid);
		pd.put("owner", pid); 
		mv.addObject("msg", "add"); 
		 
		 
		mv.addObject("pd", pd);
		mv.setViewName("properties/properties_edit"); 
		return mv;
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView add()throws Exception{
		 
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData(); 
			 
		  PropertiesService.saveProperties(pd); 
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
			pd = PropertiesService.findByUiId(pd); 
			mv.addObject("msg", "edit"); 
			PageData rsd= new PageData();
			rsd.put("uid", id);
		 
			
			 
			mv.addObject("pd", pd);
			
			mv.setViewName("properties/properties_edit");
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
			
			PageData oldpd = PropertiesService.findByUiId(pd);
			oldpd.put("name", pd.get("name"));
			oldpd.put("unit", pd.get("unit"));
			oldpd.put("icon", pd.get("icon"));
			oldpd.put("calc", pd.get("calc")); 
			oldpd.put("tellflag", pd.get("tellflag"));
			PropertiesService.editProperties(oldpd); 
			PageData depd = new PageData();
			depd.put("uid", oldpd.get("id"));
		 
			
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
		PropertiesService.deleteProperties(pd); 
		out.write("success");
		out.close();
	}
}
