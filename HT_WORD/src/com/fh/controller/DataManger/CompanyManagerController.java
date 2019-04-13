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
import com.fh.entity.app.Company;
import com.fh.service.app.RoleService;
import com.fh.service.app.CompanyService;
import com.fh.util.Const;
import com.fh.util.Jurisdiction;
import com.fh.util.PageData;

@Controller
@RequestMapping(value="/company")
public class CompanyManagerController  extends BaseController {
	@Resource(name="CompanyServiceImpl")
	private CompanyService CompanyService;
	
 
	

	 
 
	
	@RequestMapping(value="/companylist")
	public ModelAndView companylist()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		Session session = Jurisdiction.getSession();
		Users Users = (Users)session.getAttribute(Const.SESSION_USER);
		pd = this.getPageData();
		pd.put("owner", Users.getId());
		List<Company> companyList =CompanyService.SelectCompanys(pd); 
		mv.setViewName("company/company_list");
		mv.addObject("companyList", companyList);
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
		mv.setViewName("company/company_edit"); 
		return mv;
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView add()throws Exception{
		 
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData(); 
			 
		  CompanyService.saveCompany(pd); 
 
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
			pd = CompanyService.findByUiId(pd); 
			mv.addObject("msg", "edit"); 
			PageData rsd= new PageData();
			rsd.put("uid", id);
		 
			
			 
			mv.addObject("pd", pd);
			
			mv.setViewName("company/company_edit");
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
			
			PageData oldpd = CompanyService.findByUiId(pd);
			oldpd.put("company", pd.get("company"));
			oldpd.put("address", pd.get("address"));
			oldpd.put("phone", pd.get("phone"));
			oldpd.put("mobile", pd.get("mobile")); 
			oldpd.put("getawaysn", pd.get("getawaysn"));
			CompanyService.editCompany(oldpd); 
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
		CompanyService.deleteCompany(pd); 
		out.write("success");
		out.close();
	}
}
