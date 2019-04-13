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
import com.fh.service.app.CompanyDeviceMobileService; 
import com.fh.entity.app.CompanyDeviceMobile;
import com.fh.util.PageData;


/**类名称：CompanyDeviceMobileServiceImplServiceImpl
 * @author HFTC
 */
@Service("CompanyDeviceMobileServiceImpl")
public class CompanyDeviceMobileServiceImpl implements CompanyDeviceMobileService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllCompanyDeviceMobile(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("CompanyDeviceMobileMapper.listAllCompanyDeviceMobile", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryCompanyDeviceMobile(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("CompanyDeviceMobileMapper.queryCompanyDeviceMobile", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<CompanyDeviceMobile> SelectCompanyDeviceMobiles(PageData pd) throws Exception {
		return (List<CompanyDeviceMobile>) dao.findForList("CompanyDeviceMobileMapper.SelectCompanyDeviceMobiles", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveCompanyDeviceMobile(PageData pd)throws Exception{
		dao.save("CompanyDeviceMobileMapper.saveCompanyDeviceMobile", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteCompanyDeviceMobile(PageData pd)throws Exception{
		dao.delete("CompanyDeviceMobileMapper.deleteCompanyDeviceMobile", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editCompanyDeviceMobile(PageData pd)throws Exception{
		dao.update("CompanyDeviceMobileMapper.editCompanyDeviceMobile", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("CompanyDeviceMobileMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("CompanyDeviceMobileMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getCompanyDeviceMobileCount(String value)throws Exception{
		return (PageData)dao.findForObject("CompanyDeviceMobileMapper.getCompanyDeviceMobileCount", value);
	}
	
}