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
import com.fh.service.app.RoleService; 
import com.fh.entity.app.Role;
import com.fh.util.PageData;


/**类名称：RoleServiceImplServiceImpl
 * @author HFTC
 */
@Service("RoleServiceImpl")
public class RoleServiceImpl implements RoleService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllRole(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("RoleMapper.listAllRole", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryRole(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("RoleMapper.queryRole", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<Role> SelectRoles(PageData pd) throws Exception {
		return (List<Role>) dao.findForList("RoleMapper.SelectRoles", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveRole(PageData pd)throws Exception{
		dao.save("RoleMapper.saveRole", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteRole(PageData pd)throws Exception{
		dao.delete("RoleMapper.deleteRole", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editRole(PageData pd)throws Exception{
		dao.update("RoleMapper.editRole", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("RoleMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("RoleMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getRoleCount(String value)throws Exception{
		return (PageData)dao.findForObject("RoleMapper.getRoleCount", value);
	}
	
}