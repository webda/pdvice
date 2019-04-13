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
import com.fh.service.app.ExperimentPpValService; 
import com.fh.entity.app.ExperimentPpVal;
import com.fh.util.PageData;


/**类名称：ExperimentPpValServiceImplServiceImpl
 * @author HFTC
 */
@Service("ExperimentPpValServiceImpl")
public class ExperimentPpValServiceImpl implements ExperimentPpValService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllExperimentPpVal(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ExperimentPpValMapper.listAllExperimentPpVal", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryExperimentPpVal(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ExperimentPpValMapper.queryExperimentPpVal", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<ExperimentPpVal> SelectExperimentPpVals(PageData pd) throws Exception {
		return (List<ExperimentPpVal>) dao.findForList("ExperimentPpValMapper.SelectExperimentPpVals", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveExperimentPpVal(PageData pd)throws Exception{
		dao.save("ExperimentPpValMapper.saveExperimentPpVal", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteExperimentPpVal(PageData pd)throws Exception{
		dao.delete("ExperimentPpValMapper.deleteExperimentPpVal", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editExperimentPpVal(PageData pd)throws Exception{
		dao.update("ExperimentPpValMapper.editExperimentPpVal", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ExperimentPpValMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("ExperimentPpValMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getExperimentPpValCount(String value)throws Exception{
		return (PageData)dao.findForObject("ExperimentPpValMapper.getExperimentPpValCount", value);
	}
	
}