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
import com.fh.service.app.DevicePropertiesMobileService; 
import com.fh.entity.app.DevicePropertiesMobile;
import com.fh.util.PageData;


/**类名称：DevicePropertiesMobileServiceImplServiceImpl
 * @author HFTC
 */
@Service("DevicePropertiesMobileServiceImpl")
public class DevicePropertiesMobileServiceImpl implements DevicePropertiesMobileService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllDevicePropertiesMobile(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("DevicePropertiesMobileMapper.listAllDevicePropertiesMobile", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryDevicePropertiesMobile(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("DevicePropertiesMobileMapper.queryDevicePropertiesMobile", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<DevicePropertiesMobile> SelectDevicePropertiesMobiles(PageData pd) throws Exception {
		return (List<DevicePropertiesMobile>) dao.findForList("DevicePropertiesMobileMapper.SelectDevicePropertiesMobiles", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveDevicePropertiesMobile(PageData pd)throws Exception{
		dao.save("DevicePropertiesMobileMapper.saveDevicePropertiesMobile", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteDevicePropertiesMobile(PageData pd)throws Exception{
		dao.delete("DevicePropertiesMobileMapper.deleteDevicePropertiesMobile", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editDevicePropertiesMobile(PageData pd)throws Exception{
		dao.update("DevicePropertiesMobileMapper.editDevicePropertiesMobile", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("DevicePropertiesMobileMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("DevicePropertiesMobileMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getDevicePropertiesMobileCount(String value)throws Exception{
		return (PageData)dao.findForObject("DevicePropertiesMobileMapper.getDevicePropertiesMobileCount", value);
	}
	
}