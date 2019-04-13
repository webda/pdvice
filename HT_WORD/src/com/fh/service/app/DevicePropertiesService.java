/**
 * 
 */
/**
 * @author xyh
 *
 */
package com.fh.service.app;

import java.util.List;

import com.fh.entity.Page;
import com.fh.util.PageData;
import com.fh.entity.app.DeviceProperties;


/** 会员接口类
 * @author  HFTC
 */
public interface DevicePropertiesService {
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllDeviceProperties(PageData pd) throws Exception;
 	public List<PageData> queryDeviceProperties(PageData pd) throws Exception ;
 	public List<DeviceProperties> SelectDevicePropertiess(PageData pd) throws Exception ;
 

	/**
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void saveDeviceProperties(PageData pd)throws Exception ;
	
	
	/**
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void deleteDeviceProperties(PageData pd)throws Exception;
	
	
	
	/**修改用户
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public void editDeviceProperties(PageData pd)throws Exception;
	
	/**通过用户ID获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception;
	/**批量删除用户
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception;
	
	
	
	/**获取用户数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getDevicePropertiesCount(String pd)throws Exception;
	
	
	 
}

