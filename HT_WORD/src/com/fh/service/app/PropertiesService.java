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
import com.fh.entity.app.Properties;


/** 会员接口类
 * @author  HFTC
 */
public interface PropertiesService {
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllProperties(PageData pd) throws Exception;
 	public List<PageData> queryProperties(PageData pd) throws Exception ;
 	public List<Properties> SelectPropertiess(PageData pd) throws Exception ;
 

	/**
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void saveProperties(PageData pd)throws Exception ;
	
	
	/**
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void deleteProperties(PageData pd)throws Exception;
	
	
	
	/**修改用户
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public void editProperties(PageData pd)throws Exception;
	
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
	public PageData getPropertiesCount(String pd)throws Exception;
	
	
	 
}

