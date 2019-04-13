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
import com.fh.service.app.UserApplyDeviceService; 
import com.fh.entity.app.UserApplyDevice;
import com.fh.util.PageData;


/**类名称：UserApplyDeviceServiceImplServiceImpl
 * @author HFTC
 */
@Service("UserApplyDeviceServiceImpl")
public class UserApplyDeviceServiceImpl implements UserApplyDeviceService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllUserApplyDevice(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UserApplyDeviceMapper.listAllUserApplyDevice", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryUserApplyDevice(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UserApplyDeviceMapper.queryUserApplyDevice", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<UserApplyDevice> SelectUserApplyDevices(PageData pd) throws Exception {
		return (List<UserApplyDevice>) dao.findForList("UserApplyDeviceMapper.SelectUserApplyDevices", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveUserApplyDevice(PageData pd)throws Exception{
		dao.save("UserApplyDeviceMapper.saveUserApplyDevice", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteUserApplyDevice(PageData pd)throws Exception{
		dao.delete("UserApplyDeviceMapper.deleteUserApplyDevice", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editUserApplyDevice(PageData pd)throws Exception{
		dao.update("UserApplyDeviceMapper.editUserApplyDevice", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("UserApplyDeviceMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("UserApplyDeviceMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getUserApplyDeviceCount(String value)throws Exception{
		return (PageData)dao.findForObject("UserApplyDeviceMapper.getUserApplyDeviceCount", value);
	}
	
}