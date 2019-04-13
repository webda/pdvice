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
import com.fh.service.app.CompanyService; 
import com.fh.entity.app.Company;
import com.fh.util.PageData;


/**类名称：CompanyServiceImplServiceImpl
 * @author HFTC
 */
@Service("CompanyServiceImpl")
public class CompanyServiceImpl implements CompanyService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllCompany(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("CompanyMapper.listAllCompany", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryCompany(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("CompanyMapper.queryCompany", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<Company> SelectCompanys(PageData pd) throws Exception {
		return (List<Company>) dao.findForList("CompanyMapper.SelectCompanys", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveCompany(PageData pd)throws Exception{
		dao.save("CompanyMapper.saveCompany", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteCompany(PageData pd)throws Exception{
		dao.delete("CompanyMapper.deleteCompany", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editCompany(PageData pd)throws Exception{
		dao.update("CompanyMapper.editCompany", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("CompanyMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("CompanyMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getCompanyCount(String value)throws Exception{
		return (PageData)dao.findForObject("CompanyMapper.getCompanyCount", value);
	}
	
}