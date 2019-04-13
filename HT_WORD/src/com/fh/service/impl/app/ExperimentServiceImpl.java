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
import com.fh.service.app.ExperimentService; 
import com.fh.entity.app.Experiment;
import com.fh.util.PageData;


/**类名称：ExperimentServiceImplServiceImpl
 * @author HFTC
 */
@Service("ExperimentServiceImpl")
public class ExperimentServiceImpl implements ExperimentService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllExperiment(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ExperimentMapper.listAllExperiment", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryExperiment(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ExperimentMapper.queryExperiment", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<Experiment> SelectExperiments(PageData pd) throws Exception {
		return (List<Experiment>) dao.findForList("ExperimentMapper.SelectExperiments", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveExperiment(PageData pd)throws Exception{
		dao.save("ExperimentMapper.saveExperiment", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteExperiment(PageData pd)throws Exception{
		dao.delete("ExperimentMapper.deleteExperiment", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editExperiment(PageData pd)throws Exception{
		dao.update("ExperimentMapper.editExperiment", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ExperimentMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("ExperimentMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getExperimentCount(String value)throws Exception{
		return (PageData)dao.findForObject("ExperimentMapper.getExperimentCount", value);
	}
	
}