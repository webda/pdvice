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
import com.fh.service.app.UserRoleService; 
import com.fh.entity.app.UserRole;
import com.fh.util.PageData;


/**类名称：UserRoleServiceImplServiceImpl
 * @author HFTC
 */
@Service("UserRoleServiceImpl")
public class UserRoleServiceImpl implements UserRoleService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllUserRole(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UserRoleMapper.listAllUserRole", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryUserRole(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UserRoleMapper.queryUserRole", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<UserRole> SelectUserRoles(PageData pd) throws Exception {
		return (List<UserRole>) dao.findForList("UserRoleMapper.SelectUserRoles", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveUserRole(PageData pd)throws Exception{
		dao.save("UserRoleMapper.saveUserRole", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteUserRole(PageData pd)throws Exception{
		dao.delete("UserRoleMapper.deleteUserRole", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editUserRole(PageData pd)throws Exception{
		dao.update("UserRoleMapper.editUserRole", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("UserRoleMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("UserRoleMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getUserRoleCount(String value)throws Exception{
		return (PageData)dao.findForObject("UserRoleMapper.getUserRoleCount", value);
	}
	
}