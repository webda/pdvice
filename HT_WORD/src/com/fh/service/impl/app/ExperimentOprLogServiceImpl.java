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
import com.fh.service.app.ExperimentOprLogService; 
import com.fh.entity.app.ExperimentOprLog;
import com.fh.util.PageData;


/**类名称：ExperimentOprLogServiceImplServiceImpl
 * @author HFTC
 */
@Service("ExperimentOprLogServiceImpl")
public class ExperimentOprLogServiceImpl implements ExperimentOprLogService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllExperimentOprLog(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ExperimentOprLogMapper.listAllExperimentOprLog", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryExperimentOprLog(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ExperimentOprLogMapper.queryExperimentOprLog", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<ExperimentOprLog> SelectExperimentOprLogs(PageData pd) throws Exception {
		return (List<ExperimentOprLog>) dao.findForList("ExperimentOprLogMapper.SelectExperimentOprLogs", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveExperimentOprLog(PageData pd)throws Exception{
		dao.save("ExperimentOprLogMapper.saveExperimentOprLog", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteExperimentOprLog(PageData pd)throws Exception{
		dao.delete("ExperimentOprLogMapper.deleteExperimentOprLog", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editExperimentOprLog(PageData pd)throws Exception{
		dao.update("ExperimentOprLogMapper.editExperimentOprLog", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ExperimentOprLogMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("ExperimentOprLogMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getExperimentOprLogCount(String value)throws Exception{
		return (PageData)dao.findForObject("ExperimentOprLogMapper.getExperimentOprLogCount", value);
	}
	
}