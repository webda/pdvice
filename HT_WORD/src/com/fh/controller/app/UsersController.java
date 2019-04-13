package com.fh.controller.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.entity.app.Users;
import com.fh.service.app.UsersService;  
import com.fh.util.AppUtil;
import com.fh.util.Const;
import com.fh.util.Jurisdiction;
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
@RequestMapping(value="/appUsers")
public class UsersController extends BaseController {
    
	@Resource(name="UsersServiceImpl")
	private UsersService UsersService;
	 
	
	/**获取所有Users数据
	 * @return 
	 */
	@RequestMapping(value="/listAllUsers")
	@ResponseBody
	public Object listAllUsers(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = UsersService.listAllUsers(pd);
			map.put("pd", result); 
		} catch (Exception e) {
			
			map.put("result", "false");
		}		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	
	@RequestMapping(value="/PageUsers")
	@ResponseBody
	public Object PageUsers(Page page){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		page.setPd(pd);
		try {
			 
			List<PageData> result = UsersService.PageUsers(page);
			map.put("pd", result); 
			map.put("result", "sucess");
		
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}

	/**获取所有Users数据
	 * @return 
	 */
	@RequestMapping(value="/queryUsers")
	@ResponseBody
	public Object queryUsers(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			List<PageData>result = UsersService.queryUsers(pd);
			map.put("pd", result); 
			map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**保存Users信息
	 * @return 
	 */
	@RequestMapping(value="/saveU")
	@ResponseBody
	public Object saveUsers(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  UsersService.saveUsers(pd); 
				map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	@RequestMapping(value="/myinfo")
	@ResponseBody
	public Object GetMyInfo(String Mobile){
		Map<String,Object> map = new HashMap<String,Object>();
		Session session = Jurisdiction.getSession();
		
		try {
			PageData User= (PageData) session.getAttribute(Const.SESSION_APPUSER_Pd);
			 if(User!=null){ 
			 map.put("pd", User);
			 map.put("result", "sucess");
			 }
			 else{
				 map.put("pd", "NULL");
				 map.put("result", "false");	 
			 }
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
			
		 
	     
		 return  AppUtil.returnObject(new PageData(), map);
	}
	
	
	@RequestMapping(value="/upmymobile")
	@ResponseBody
	public Object UpdateMyMobile(String Mobile){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  UsersService.saveUsers(pd); 
				map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**删除Users信息
	 * @return 
	 */
	@RequestMapping(value="/deleteU")
	@ResponseBody
	public Object deleteUsers(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  UsersService.deleteUsers(pd); 
				map.put("result", "sucess");
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	/**编辑Users信息
	 * @return 
	 */
	@RequestMapping(value="/editU")
	@ResponseBody
	public Object editUsers(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		 
		try {
			  UsersService.editUsers(pd); 
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
			PageData	result = UsersService.findByUiId(pd);
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
		   UsersService.deleteAll(ids);
			map.put("result", "sucess");
			 
		} catch (Exception e) {
			
			map.put("result", "false");
			map.put("error", e.getMessage());
		}		
		
			logAfter(logger);
		 
		return AppUtil.returnObject(new PageData(), map);
	}
	@RequestMapping(value="/getUsersCount")
	@ResponseBody
	public Object getUsersCount(){
		logBefore(logger, "根据用户名获取会员信息");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = this.getPageData(); 
		try {
			PageData	result = UsersService.getUsersCount("");
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
	
