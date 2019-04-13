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
import com.fh.service.app.ExperimentPropertiesService; 
import com.fh.entity.app.ExperimentProperties;
import com.fh.util.PageData;


/**类名称：ExperimentPropertiesServiceImplServiceImpl
 * @author HFTC
 */
@Service("ExperimentPropertiesServiceImpl")
public class ExperimentPropertiesServiceImpl implements ExperimentPropertiesService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllExperimentProperties(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ExperimentPropertiesMapper.listAllExperimentProperties", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryExperimentProperties(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ExperimentPropertiesMapper.queryExperimentProperties", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<ExperimentProperties> SelectExperimentPropertiess(PageData pd) throws Exception {
		return (List<ExperimentProperties>) dao.findForList("ExperimentPropertiesMapper.SelectExperimentPropertiess", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveExperimentProperties(PageData pd)throws Exception{
		dao.save("ExperimentPropertiesMapper.saveExperimentProperties", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteExperimentProperties(PageData pd)throws Exception{
		dao.delete("ExperimentPropertiesMapper.deleteExperimentProperties", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editExperimentProperties(PageData pd)throws Exception{
		dao.update("ExperimentPropertiesMapper.editExperimentProperties", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ExperimentPropertiesMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("ExperimentPropertiesMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getExperimentPropertiesCount(String value)throws Exception{
		return (PageData)dao.findForObject("ExperimentPropertiesMapper.getExperimentPropertiesCount", value);
	}
	
}