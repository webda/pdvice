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
import com.fh.service.app.RoleMenuService; 
import com.fh.entity.app.RoleMenu;
import com.fh.util.PageData;


/**类名称：RoleMenuServiceImplServiceImpl
 * @author HFTC
 */
@Service("RoleMenuServiceImpl")
public class RoleMenuServiceImpl implements RoleMenuService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllRoleMenu(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("RoleMenuMapper.listAllRoleMenu", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryRoleMenu(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("RoleMenuMapper.queryRoleMenu", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<RoleMenu> SelectRoleMenus(PageData pd) throws Exception {
		return (List<RoleMenu>) dao.findForList("RoleMenuMapper.SelectRoleMenus", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveRoleMenu(PageData pd)throws Exception{
		dao.save("RoleMenuMapper.saveRoleMenu", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteRoleMenu(PageData pd)throws Exception{
		dao.delete("RoleMenuMapper.deleteRoleMenu", pd);
	}
	public void deleteRoleMenus(PageData pd)throws Exception{
		dao.delete("RoleMenuMapper.deleteRoleMenus", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editRoleMenu(PageData pd)throws Exception{
		dao.update("RoleMenuMapper.editRoleMenu", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("RoleMenuMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("RoleMenuMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getRoleMenuCount(String value)throws Exception{
		return (PageData)dao.findForObject("RoleMenuMapper.getRoleMenuCount", value);
	}
	
}