/**
 * 
 */
/**
 * @author xyh
 *
 */
package com.fh.service.system.users.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.service.system.users.usersManager;
import com.fh.util.PageData;


/**类名称：usersService
 * @author HFTC
 */
@Service("usersService")
public class usersService implements usersManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllusersByRorlid(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("usersMapper.listAllusersByRorlid", pd);
	}
	
	/**通过id获取校长数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData getUserInfo(PageData pd)throws Exception{
		return (PageData)dao.findForObject("usersMapper.getUserInfo", pd);
	} 
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveU(PageData pd)throws Exception{
		dao.save("usersMapper.saveU", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteU(PageData pd)throws Exception{
		dao.delete("usersMapper.deleteU", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editU(PageData pd)throws Exception{
		dao.update("usersMapper.editU", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("usersMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAllU(String[] USER_IDS)throws Exception{
		dao.delete("usersMapper.deleteAllU", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getusersCount(String value)throws Exception{
		return (PageData)dao.findForObject("usersMapper.getusersCount", value);
	}
	
}