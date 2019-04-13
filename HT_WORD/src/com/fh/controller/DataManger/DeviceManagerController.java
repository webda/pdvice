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
import com.fh.entity.app.Properties;
import com.fh.entity.app.Users;
import com.fh.entity.app.Company;
import com.fh.entity.app.CompanyDevice;
import com.fh.entity.app.CompanyDeviceMobile;
import com.fh.entity.app.Device;
import com.fh.entity.app.DevicePropertiesMobile;
import com.fh.service.app.CompanyService;
import com.fh.service.app.PropertiesService;
import com.fh.service.app.DeviceService;
import com.fh.util.Const;
import com.fh.util.Jurisdiction;
import com.fh.util.PageData;

@Controller
@RequestMapping(value="/device")
public class DeviceManagerController  extends BaseController {
	@Resource(name="DeviceServiceImpl")
	private DeviceService DeviceService;
	
	@Resource(name="CompanyServiceImpl")
	private CompanyService CompanyService;
	
	@Resource(name="PropertiesServiceImpl")
	private PropertiesService PropertiesService;

	@Resource(name="CompanyDeviceServiceImpl")
	private com.fh.service.app.CompanyDeviceService CompanyDeviceService;
	@Resource(name="CompanyDeviceMobileServiceImpl")
	private com.fh.service.app.CompanyDeviceMobileService CompanyDeviceMobileService;

	@Resource(name="DevicePropertiesMobileServiceImpl")
	private com.fh.service.app.DevicePropertiesMobileService DevicePropertiesMobileService;
 
	
	@RequestMapping(value="/devicelist")
	public ModelAndView Devicelist()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		Session session = Jurisdiction.getSession();
		Users Users = (Users)session.getAttribute(Const.SESSION_USER);
		pd = this.getPageData();
		List<Device> DeviceList =DeviceService.SelectDevices(pd); 
		mv.setViewName("device/device_list");
		mv.addObject("DeviceList", DeviceList);
		mv.addObject("Users", Users);
		return mv;
	}
	
	@RequestMapping(value="/toAdd")
	public ModelAndView toAdd(int pid)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		
		List<Company> rolist=CompanyService.SelectCompanys(pd);
		mv.addObject("rolist", rolist);
		List<Properties> plist=PropertiesService.SelectPropertiess(pd);
		mv.addObject("plist", plist);
		pd.put("pid", pid);
		mv.addObject("msg", "add");
		mv.addObject("rolist", rolist);
		 CompanyDevice company= new CompanyDevice();
		List<DevicePropertiesMobile> Propertiesids= new ArrayList<DevicePropertiesMobile>();
		
		mv.addObject("company", company);
		mv.addObject("Propertiesids", Propertiesids);
		mv.addObject("pd", pd);
		mv.setViewName("device/device_edit"); 
		return mv;
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView add()throws Exception{
		 
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData(); 
			 
		 int id= DeviceService.saveDevice(pd); 
	 
	 

			 String ip=(String)pd.get("ip");
			 String slaveid=(String)pd.get("slaveid");
			 PageData urpd = new PageData();
			 urpd.put("cid", (String)pd.get("company"));
			 urpd.put("did", id);
			 urpd.put("ip", ip);
			 urpd.put("slaveid", slaveid);
			 CompanyDeviceService.saveCompanyDevice(urpd);
			 
		 
		 
		 
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
			pd = DeviceService.findByUiId(pd);
			List<Company> rolist=CompanyService.SelectCompanys(new PageData());
			mv.addObject("rolist", rolist);
			
			List<Properties> plist=PropertiesService.SelectPropertiess(new PageData());
			mv.addObject("plist", plist);
			mv.addObject("msg", "edit");
			PageData rsd= new PageData();
			rsd.put("did", id);
			List<CompanyDevice> Companyids=CompanyDeviceService.SelectCompanyDevices(rsd);
			List<DevicePropertiesMobile> Propertiesids= DevicePropertiesMobileService.SelectDevicePropertiesMobiles(rsd);
			if(Companyids.size()>0)
			{
				 CompanyDevice company=Companyids.get(0);
				 mv.addObject("company", company);
			}
			
			mv.addObject("Propertiesids", Propertiesids);
			mv.addObject("pd", pd);
			
			mv.setViewName("device/device_edit");
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
			
			PageData oldpd = DeviceService.findByUiId(pd);
			oldpd.put("name", pd.get("name"));
			oldpd.put("producer", pd.get("producer"));
			oldpd.put("buydate", pd.get("buydate"));
			oldpd.put("duedate", pd.get("duedate"));
			oldpd.put("Origin", pd.get("Origin")); 
			DeviceService.editDevice(oldpd); 
			PageData depd = new PageData();
			depd.put("did", oldpd.get("id"));
			CompanyDeviceService.deleteCompanyDevice(depd);
			 
				 String ip=(String)pd.get("ip");
				 String slaveid=(String)pd.get("slaveid");
				 PageData urpd = new PageData();
				 urpd.put("cid", (String)pd.get("company"));
				 urpd.put("did", oldpd.get("id"));
				 urpd.put("ip", ip);
				 urpd.put("slaveid", slaveid);
				 CompanyDeviceService.saveCompanyDevice(urpd);
				 
			 
			 
			mv.addObject("msg","success");
		} catch(Exception e){
			logger.error(e.toString(), e);
			mv.addObject("msg","failed");
		}
		mv.setViewName("save_result");
		return mv;
	}
	
	
	@RequestMapping(value="/toParm")
	public ModelAndView toParm( int id )throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			pd.put("id", id);
			pd = DeviceService.findByUiId(pd); 
			List<Properties> plist=PropertiesService.SelectPropertiess(new PageData());
			mv.addObject("plist", plist);
			mv.addObject("msg", "parm");
			PageData rsd= new PageData();
			rsd.put("did", id);
			List<CompanyDeviceMobile> CompanyDeviceMobiles=CompanyDeviceMobileService.SelectCompanyDeviceMobiles(rsd);
			CompanyDeviceMobile CDM;
			if(CompanyDeviceMobiles.size()>0)CDM=CompanyDeviceMobiles.get(0);
			else CDM=new CompanyDeviceMobile();
			List<DevicePropertiesMobile> Propertiesids= DevicePropertiesMobileService.SelectDevicePropertiesMobiles(rsd);
			if(Propertiesids.size()<=0) 
			  Propertiesids=new ArrayList<DevicePropertiesMobile>();
			mv.addObject("CDM", CDM);
			mv.addObject("Propertiesids", Propertiesids);
			mv.addObject("pd", pd);
			
			mv.setViewName("device/pram_edit");
		} catch(Exception e){
			logger.error(e.toString(), e);
		}
		return mv;
	}
	
	@RequestMapping(value="/parm")
	public ModelAndView parm()throws Exception{
		 
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			
		 
	  
			PageData depd = new PageData();
			depd.put("did", pd.get("id")); 
			CompanyDeviceMobileService.deleteCompanyDeviceMobile(depd);
			 DevicePropertiesMobileService.deleteDevicePropertiesMobile(depd);
			depd.put("did", pd.get("id"));
			depd.put("remind", pd.get("remind"));
			depd.put("interval", pd.get("interval"));
			depd.put("handle", pd.get("handle"));
			depd.put("remindadmin", pd.get("remindadmin"));
			depd.put("state", pd.get("state")); 
			CompanyDeviceMobileService.saveCompanyDeviceMobile(depd);
			
			 String pids[]=((String)pd.get("properties")).split(",");
			 for(String pid:pids)
			 {

				 String maxval=(String)pd.get("maxval"+pid);
				 String minval=(String)pd.get("minval"+pid);
				 PageData urpd = new PageData();
				 urpd.put("pid", pid);
				 urpd.put("did",  pd.get("id"));
				 urpd.put("maxval", maxval);
				 urpd.put("minval", minval);
				 DevicePropertiesMobileService.saveDevicePropertiesMobile(urpd);
				 
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
		DeviceService.deleteDevice(pd); 
		out.write("success");
		out.close();
	}
}
