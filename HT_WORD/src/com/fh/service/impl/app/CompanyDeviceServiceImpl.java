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
import com.fh.service.app.CompanyDeviceService; 
import com.fh.entity.app.CompanyDevice;
import com.fh.util.PageData;


/**类名称：CompanyDeviceServiceImplServiceImpl
 * @author HFTC
 */
@Service("CompanyDeviceServiceImpl")
public class CompanyDeviceServiceImpl implements CompanyDeviceService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllCompanyDevice(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("CompanyDeviceMapper.listAllCompanyDevice", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryCompanyDevice(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("CompanyDeviceMapper.queryCompanyDevice", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<CompanyDevice> SelectCompanyDevices(PageData pd) throws Exception {
		return (List<CompanyDevice>) dao.findForList("CompanyDeviceMapper.SelectCompanyDevices", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveCompanyDevice(PageData pd)throws Exception{
		dao.save("CompanyDeviceMapper.saveCompanyDevice", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteCompanyDevice(PageData pd)throws Exception{
		dao.delete("CompanyDeviceMapper.deleteCompanyDevice", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editCompanyDevice(PageData pd)throws Exception{
		dao.update("CompanyDeviceMapper.editCompanyDevice", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("CompanyDeviceMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("CompanyDeviceMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getCompanyDeviceCount(String value)throws Exception{
		return (PageData)dao.findForObject("CompanyDeviceMapper.getCompanyDeviceCount", value);
	}
	
}