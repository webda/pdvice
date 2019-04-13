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
import com.fh.service.app.BaseDataService; 
import com.fh.entity.app.BaseData;
import com.fh.util.PageData;


/**类名称：BaseDataServiceImplServiceImpl
 * @author HFTC
 */
@Service("BaseDataServiceImpl")
public class BaseDataServiceImpl implements BaseDataService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllBaseData(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("BaseDataMapper.listAllBaseData", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryBaseData(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("BaseDataMapper.queryBaseData", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<BaseData> SelectBaseDatas(PageData pd) throws Exception {
		return (List<BaseData>) dao.findForList("BaseDataMapper.SelectBaseDatas", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveBaseData(PageData pd)throws Exception{
		dao.save("BaseDataMapper.saveBaseData", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteBaseData(PageData pd)throws Exception{
		dao.delete("BaseDataMapper.deleteBaseData", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editBaseData(PageData pd)throws Exception{
		dao.update("BaseDataMapper.editBaseData", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("BaseDataMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("BaseDataMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getBaseDataCount(String value)throws Exception{
		return (PageData)dao.findForObject("BaseDataMapper.getBaseDataCount", value);
	}
	
}