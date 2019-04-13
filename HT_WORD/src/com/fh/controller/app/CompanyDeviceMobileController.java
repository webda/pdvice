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
import com.fh.service.app.CompanyDeviceMobileService;  
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
@RequestMapping(value="/appCompanyDeviceMobile")
public class CompanyDeviceMobileController extends BaseController {
    
	@Resource(name="CompanyDeviceMobileServiceImpl")
	private CompanyDeviceMobileService CompanyDeviceMobileService;
	 
	
	/**获取所有CompanyDeviceMobile数据
	 * @return 
	 */
	@RequestMapping(value="/listAllCompanyDeviceMobile")
	@ResponseBody
	public Object listAllCompanyDeviceMobile(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = CompanyDeviceMobileService.listAllCompanyDeviceMobile(pd);
			map.put("pd", result); 
		} catch (Exception e) {
			
			map.put("result", "false");
		}		
			map.put("result", "sucess");
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	

	/**获取所有CompanyDeviceMobile数据
	 * @return 
	 */
	@RequestMapping(value="/queryCompanyDeviceMobile")
	@ResponseBody
	public Object queryCompanyDeviceMobile(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = CompanyDeviceMobileService.queryCompanyDeviceMobile(pd);
			map.put("pd", result); 
		} catch (Exception e) {
			
			map.put("result", "false");
		}		
			map.put("result", "sucess");
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**保存CompanyDeviceMobile信息
	 * @return 
	 */
	@RequestMapping(value="/saveU")
	@ResponseBody
	public Object saveCompanyDeviceMobile(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  CompanyDeviceMobileService.saveCompanyDeviceMobile(pd); 
		} catch (Exception e) {
			
			map.put("result", "false");
		}		
			map.put("result", "sucess");
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}

	/**删除CompanyDeviceMobile信息
	 * @return 
	 */
	@RequestMapping(value="/deleteU")
	@ResponseBody
	public Object deleteCompanyDeviceMobile(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  CompanyDeviceMobileService.deleteCompanyDeviceMobile(pd); 
		} catch (Exception e) {
			
			map.put("result", "false");
		}		
			map.put("result", "sucess");
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**编辑CompanyDeviceMobile信息
	 * @return 
	 */
	@RequestMapping(value="/editU")
	@ResponseBody
	public Object editCompanyDeviceMobile(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  CompanyDeviceMobileService.editCompanyDeviceMobile(pd); 
		} catch (Exception e) {
			
			map.put("result", "false");
		}		
			map.put("result", "sucess");
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
			PageData	result = CompanyDeviceMobileService.findByUiId(pd);
			map.put("pd", result); 
		} catch (Exception e) {
			
			map.put("result", "false");
		}		
			map.put("result", "sucess");
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
		   CompanyDeviceMobileService.deleteAll(ids);
			 
		} catch (Exception e) {
			
			map.put("result", "false");
		}		
			map.put("result", "sucess");
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	@RequestMapping(value="/getCompanyDeviceMobileCount")
	@ResponseBody
	public Object getCompanyDeviceMobileCount(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = this.getPageData(); 
		try {
			PageData	result = CompanyDeviceMobileService.getCompanyDeviceMobileCount("");
			map.put("pd", result); 
			 
		} catch (Exception e) {
			
			map.put("result", "false");
		}		
			map.put("result", "sucess");
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
}
	
