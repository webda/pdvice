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
import com.fh.service.app.ExperimentPropertiesService;  
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
@RequestMapping(value="/appExperimentProperties")
public class ExperimentPropertiesController extends BaseController {
    
	@Resource(name="ExperimentPropertiesServiceImpl")
	private ExperimentPropertiesService ExperimentPropertiesService;
	 
	
	/**获取所有ExperimentProperties数据
	 * @return 
	 */
	@RequestMapping(value="/listAllExperimentProperties")
	@ResponseBody
	public Object listAllExperimentProperties(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = ExperimentPropertiesService.listAllExperimentProperties(pd);
			map.put("pd", result); 
		                             map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
                                      map.put("error", e.getMessage());
		}		
			
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	

	/**获取所有ExperimentProperties数据
	 * @return 
	 */
	@RequestMapping(value="/queryExperimentProperties")
	@ResponseBody
	public Object queryExperimentProperties(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = ExperimentPropertiesService.queryExperimentProperties(pd);
			map.put("pd", result); 
		                             map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
                                      map.put("error", e.getMessage());
		}		
			
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**保存ExperimentProperties信息
	 * @return 
	 */
	@RequestMapping(value="/saveU")
	@ResponseBody
	public Object saveExperimentProperties(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  ExperimentPropertiesService.saveExperimentProperties(pd); 
		                             map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
                                      map.put("error", e.getMessage());
		}		
			
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}

	/**删除ExperimentProperties信息
	 * @return 
	 */
	@RequestMapping(value="/deleteU")
	@ResponseBody
	public Object deleteExperimentProperties(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  ExperimentPropertiesService.deleteExperimentProperties(pd); 
		                             map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
                                      map.put("error", e.getMessage());
		}		
			
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**编辑ExperimentProperties信息
	 * @return 
	 */
	@RequestMapping(value="/editU")
	@ResponseBody
	public Object editExperimentProperties(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  ExperimentPropertiesService.editExperimentProperties(pd); 
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
			PageData	result = ExperimentPropertiesService.findByUiId(pd);
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
		   ExperimentPropertiesService.deleteAll(ids);
			 
		                             map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
                                      map.put("error", e.getMessage());
		}		
			
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	@RequestMapping(value="/getExperimentPropertiesCount")
	@ResponseBody
	public Object getExperimentPropertiesCount(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = this.getPageData(); 
		try {
			PageData	result = ExperimentPropertiesService.getExperimentPropertiesCount("");
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
	
