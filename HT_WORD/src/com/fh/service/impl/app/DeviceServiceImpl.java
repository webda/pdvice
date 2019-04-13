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
import com.fh.service.app.DeviceService; 
import com.fh.entity.app.Device;
import com.fh.util.PageData;


/**类名称：DeviceServiceImplServiceImpl
 * @author HFTC
 */
@Service("DeviceServiceImpl")
public class DeviceServiceImpl implements DeviceService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllDevice(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("DeviceMapper.listAllDevice", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryDevice(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("DeviceMapper.queryDevice", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<Device> SelectDevices(PageData pd) throws Exception {
		return (List<Device>) dao.findForList("DeviceMapper.SelectDevices", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public int saveDevice(PageData pd)throws Exception{
		int re= (int)(dao.save("DeviceMapper.saveDevice", pd));
		if(re==0)  return -1;
		
		return Integer.parseInt(pd.getString("id"));
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteDevice(PageData pd)throws Exception{
		dao.delete("DeviceMapper.deleteDevice", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editDevice(PageData pd)throws Exception{
		dao.update("DeviceMapper.editDevice", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("DeviceMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("DeviceMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getDeviceCount(String value)throws Exception{
		return (PageData)dao.findForObject("DeviceMapper.getDeviceCount", value);
	}
	
}