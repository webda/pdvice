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
import com.fh.service.app.UserDeviceService; 
import com.fh.entity.app.UserDevice;
import com.fh.util.PageData;


/**类名称：UserDeviceServiceImplServiceImpl
 * @author HFTC
 */
@Service("UserDeviceServiceImpl")
public class UserDeviceServiceImpl implements UserDeviceService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllUserDevice(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UserDeviceMapper.listAllUserDevice", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryUserDevice(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UserDeviceMapper.queryUserDevice", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<UserDevice> SelectUserDevices(PageData pd) throws Exception {
		return (List<UserDevice>) dao.findForList("UserDeviceMapper.SelectUserDevices", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveUserDevice(PageData pd)throws Exception{
		dao.save("UserDeviceMapper.saveUserDevice", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteUserDevice(PageData pd)throws Exception{
		dao.delete("UserDeviceMapper.deleteUserDevice", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editUserDevice(PageData pd)throws Exception{
		dao.update("UserDeviceMapper.editUserDevice", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("UserDeviceMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("UserDeviceMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getUserDeviceCount(String value)throws Exception{
		return (PageData)dao.findForObject("UserDeviceMapper.getUserDeviceCount", value);
	}
	
}