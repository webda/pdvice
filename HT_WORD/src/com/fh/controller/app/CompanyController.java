package com.fh.controller.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.controller.base.BaseController; 
import com.fh.service.app.CompanyService;  
import com.fh.util.AppUtil; 
import com.fh.util.PageData; 
import com.fh.util.Tools;
 


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
@RequestMapping(value="/appCompany")
public class CompanyController extends BaseController {
    
	@Resource(name="CompanyServiceImpl")
	private CompanyService CompanyService;
	 
	
	/**获取所有Company数据
	 * @return 
	 */
	@RequestMapping(value="/listAllCompany")
	@ResponseBody
	public Object listAllCompany(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = CompanyService.listAllCompany(pd);
			map.put("pd", result); 
			map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	

	/**获取所有Company数据
	 * @return 
	 */
	@RequestMapping(value="/queryCompany")
	@ResponseBody
	public Object queryCompany(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = CompanyService.queryCompany(pd);
			map.put("pd", result); 
			map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**保存Company信息
	 * @return 
	 */
	@RequestMapping(value="/saveU")
	@ResponseBody
	public Object saveCompany(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  CompanyService.saveCompany(pd); 
				map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}

	/**删除Company信息
	 * @return 
	 */
	@RequestMapping(value="/deleteU")
	@ResponseBody
	public Object deleteCompany(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  CompanyService.deleteCompany(pd); 
				map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**编辑Company信息
	 * @return 
	 */
	@RequestMapping(value="/editU")
	@ResponseBody
	public Object editCompany(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  CompanyService.editCompany(pd); 
				map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	 
	/**根据userid获取用户信息
	 * @return 
	 */
	@RequestMapping(value="/findByUiId")
	@ResponseBody
	public Object findByUiId(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			PageData	result = CompanyService.findByUiId(pd);
			map.put("pd", result); 
			map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**根据userid获取用户信息
	 * @return 
	 */
	@RequestMapping(value="/deleteAll")
	@ResponseBody
	public Object deleteAll(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = this.getPageData();
		 String ids[]=pd.getString("KEYDATA").split(",fh,");
		try {
		   CompanyService.deleteAll(ids);
			map.put("result", "sucess");
			 
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	@RequestMapping(value="/getCompanyCount")
	@ResponseBody
	public Object getCompanyCount(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = this.getPageData(); 
		try {
			PageData	result = CompanyService.getCompanyCount("");
			map.put("pd", result); 
			map.put("result", "sucess");
			 
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
}
	
