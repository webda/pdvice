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
import com.fh.service.app.DevicePropertiesMobileService;  
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
@RequestMapping(value="/appDevicePropertiesMobile")
public class DevicePropertiesMobileController extends BaseController {
    
	@Resource(name="DevicePropertiesMobileServiceImpl")
	private DevicePropertiesMobileService DevicePropertiesMobileService;
	 
	
	/**获取所有DevicePropertiesMobile数据
	 * @return 
	 */
	@RequestMapping(value="/listAllDevicePropertiesMobile")
	@ResponseBody
	public Object listAllDevicePropertiesMobile(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = DevicePropertiesMobileService.listAllDevicePropertiesMobile(pd);
			map.put("pd", result); 
		                             map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
                                      map.put("error", e.getMessage());
		}		
			
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	

	/**获取所有DevicePropertiesMobile数据
	 * @return 
	 */
	@RequestMapping(value="/queryDevicePropertiesMobile")
	@ResponseBody
	public Object queryDevicePropertiesMobile(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = DevicePropertiesMobileService.queryDevicePropertiesMobile(pd);
			map.put("pd", result); 
		                             map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
                                      map.put("error", e.getMessage());
		}		
			
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**保存DevicePropertiesMobile信息
	 * @return 
	 */
	@RequestMapping(value="/saveU")
	@ResponseBody
	public Object saveDevicePropertiesMobile(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  DevicePropertiesMobileService.saveDevicePropertiesMobile(pd); 
		                             map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
                                      map.put("error", e.getMessage());
		}		
			
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}

	/**删除DevicePropertiesMobile信息
	 * @return 
	 */
	@RequestMapping(value="/deleteU")
	@ResponseBody
	public Object deleteDevicePropertiesMobile(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  DevicePropertiesMobileService.deleteDevicePropertiesMobile(pd); 
		                             map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
                                      map.put("error", e.getMessage());
		}		
			
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**编辑DevicePropertiesMobile信息
	 * @return 
	 */
	@RequestMapping(value="/editU")
	@ResponseBody
	public Object editDevicePropertiesMobile(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  DevicePropertiesMobileService.editDevicePropertiesMobile(pd); 
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
			PageData	result = DevicePropertiesMobileService.findByUiId(pd);
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
		   DevicePropertiesMobileService.deleteAll(ids);
			 
		                             map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
                                      map.put("error", e.getMessage());
		}		
			
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	@RequestMapping(value="/getDevicePropertiesMobileCount")
	@ResponseBody
	public Object getDevicePropertiesMobileCount(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = this.getPageData(); 
		try {
			PageData	result = DevicePropertiesMobileService.getDevicePropertiesMobileCount("");
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
	
