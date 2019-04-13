/**
 * 
 */
/**
 * @author xyh
 *
 */
package com.fh.service.impl.app;
 


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.service.app.DevicePropertiesService; 
import com.fh.entity.app.DeviceProperties;
import com.fh.util.PageData;


/**类名称：DevicePropertiesServiceImplServiceImpl
 * @author HFTC
 */
@Service("DevicePropertiesServiceImpl")
public class DevicePropertiesServiceImpl implements DevicePropertiesService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllDeviceProperties(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("DevicePropertiesMapper.listAllDeviceProperties", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryDeviceProperties(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("DevicePropertiesMapper.queryDeviceProperties", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<DeviceProperties> SelectDevicePropertiess(PageData pd) throws Exception {
		return (List<DeviceProperties>) dao.findForList("DevicePropertiesMapper.SelectDevicePropertiess", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveDeviceProperties(PageData pd)throws Exception{
		dao.save("DevicePropertiesMapper.saveDeviceProperties", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteDeviceProperties(PageData pd)throws Exception{
		dao.delete("DevicePropertiesMapper.deleteDeviceProperties", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editDeviceProperties(PageData pd)throws Exception{
		dao.update("DevicePropertiesMapper.editDeviceProperties", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("DevicePropertiesMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("DevicePropertiesMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getDevicePropertiesCount(String value)throws Exception{
		return (PageData)dao.findForObject("DevicePropertiesMapper.getDevicePropertiesCount", value);
	}
	
}