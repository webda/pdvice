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
import com.fh.service.app.PropertiesService; 
import com.fh.entity.app.Properties;
import com.fh.util.PageData;


/**类名称：PropertiesServiceImplServiceImpl
 * @author HFTC
 */
@Service("PropertiesServiceImpl")
public class PropertiesServiceImpl implements PropertiesService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllProperties(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("PropertiesMapper.listAllProperties", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryProperties(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("PropertiesMapper.queryProperties", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<Properties> SelectPropertiess(PageData pd) throws Exception {
		return (List<Properties>) dao.findForList("PropertiesMapper.SelectPropertiess", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveProperties(PageData pd)throws Exception{
		dao.save("PropertiesMapper.saveProperties", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteProperties(PageData pd)throws Exception{
		dao.delete("PropertiesMapper.deleteProperties", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editProperties(PageData pd)throws Exception{
		dao.update("PropertiesMapper.editProperties", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("PropertiesMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("PropertiesMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getPropertiesCount(String value)throws Exception{
		return (PageData)dao.findForObject("PropertiesMapper.getPropertiesCount", value);
	}
	
}