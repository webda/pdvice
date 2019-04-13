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
import com.fh.service.app.ExperimentAbnormalService; 
import com.fh.entity.app.ExperimentAbnormal;
import com.fh.util.PageData;


/**类名称：ExperimentAbnormalServiceImplServiceImpl
 * @author HFTC
 */
@Service("ExperimentAbnormalServiceImpl")
public class ExperimentAbnormalServiceImpl implements ExperimentAbnormalService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllExperimentAbnormal(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ExperimentAbnormalMapper.listAllExperimentAbnormal", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryExperimentAbnormal(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ExperimentAbnormalMapper.queryExperimentAbnormal", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<ExperimentAbnormal> SelectExperimentAbnormals(PageData pd) throws Exception {
		return (List<ExperimentAbnormal>) dao.findForList("ExperimentAbnormalMapper.SelectExperimentAbnormals", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveExperimentAbnormal(PageData pd)throws Exception{
		dao.save("ExperimentAbnormalMapper.saveExperimentAbnormal", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteExperimentAbnormal(PageData pd)throws Exception{
		dao.delete("ExperimentAbnormalMapper.deleteExperimentAbnormal", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editExperimentAbnormal(PageData pd)throws Exception{
		dao.update("ExperimentAbnormalMapper.editExperimentAbnormal", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ExperimentAbnormalMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("ExperimentAbnormalMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getExperimentAbnormalCount(String value)throws Exception{
		return (PageData)dao.findForObject("ExperimentAbnormalMapper.getExperimentAbnormalCount", value);
	}
	
}