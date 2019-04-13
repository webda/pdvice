/**
 * 
 */
/**
 * @author xyh
 *
 */
package com.fh.controller.DataManger;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.entity.system.Role;
import com.fh.service.system.appuser.AppuserManager; 
import com.fh.util.AppUtil;
import com.fh.util.Const;
import com.fh.util.Jurisdiction;
import com.fh.util.MD5;
import com.fh.util.ObjectExcelView;
import com.fh.util.PageData;
import com.fh.util.Tools;

/** 
 * 类名称：会员管理
 * 创建人：HFTC
 * 修改时间：2018年1月17日
 * @version
 */
@Controller
@RequestMapping(value="/data")
public class DataOptionController extends BaseController {
 

	
	/**显示用户列表
	 * @param page
	 * @return
	 */
	
	@RequestMapping(value="/list")
	@ResponseBody
	public ModelAndView list(){
		ModelAndView mv = this.getModelAndView();
		 
		return mv;
	}
	  
	
}