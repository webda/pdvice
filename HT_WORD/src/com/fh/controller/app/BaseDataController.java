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
import com.fh.service.app.BaseDataService;
import com.fh.service.impl.app.BaseDataServiceImpl;
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
@RequestMapping(value="/appBaseData")
public class BaseDataController extends BaseController {
    
	@Resource(name="BaseDataServiceImpl")
	private BaseDataService BaseDataService;
	 
	
	/**获取所有BaseData数据
	 * @return 
	 */
	@RequestMapping(value="/listAllBaseData")
	@ResponseBody
	public Object listAllBaseData(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = BaseDataService.listAllBaseData(pd);
			map.put("pd", result); 
			map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	

	/**获取所有BaseData数据
	 * @return 
	 */
	@RequestMapping(value="/queryBaseData")
	@ResponseBody
	public Object queryBaseData(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = BaseDataService.queryBaseData(pd);
			map.put("pd", result); 
			map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**保存BaseData信息
	 * @return 
	 */
	@RequestMapping(value="/saveU")
	@ResponseBody
	public Object saveBaseData(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  BaseDataService.saveBaseData(pd); 
				map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}

	/**删除BaseData信息
	 * @return 
	 */
	@RequestMapping(value="/deleteU")
	@ResponseBody
	public Object deleteBaseData(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  BaseDataService.deleteBaseData(pd);
				map.put("result", "sucess"); 
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**编辑BaseData信息
	 * @return 
	 */
	@RequestMapping(value="/editU")
	@ResponseBody
	public Object editBaseData(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  BaseDataService.editBaseData(pd); 
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
			PageData	result = BaseDataService.findByUiId(pd);
			map.put("pd", result); 
			map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
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
		   BaseDataService.deleteAll(ids);
			map.put("result", "sucess");
			 
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	@RequestMapping(value="/getBaseDataCount")
	@ResponseBody
	public Object getBaseDataCount(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = this.getPageData(); 
		try {
			PageData	result = BaseDataService.getBaseDataCount("");
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
	
