/**
 * 
 */
/**
 * @author xyh
 *
 */
package com.fh.service.app;

import java.util.List;

import com.fh.entity.Page;
import com.fh.util.PageData;
import com.fh.entity.app.RoleMenu;


/** 会员接口类
 * @author  HFTC
 */
public interface RoleMenuService {
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllRoleMenu(PageData pd) throws Exception;
 	public List<PageData> queryRoleMenu(PageData pd) throws Exception ;
 	public List<RoleMenu> SelectRoleMenus(PageData pd) throws Exception ;
 

	/**
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void saveRoleMenu(PageData pd)throws Exception ;
	
	
	/**
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void deleteRoleMenu(PageData pd)throws Exception;
	
	
	
	/**修改用户
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public void editRoleMenu(PageData pd)throws Exception;
	
	/**通过用户ID获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception;
	/**批量删除用户
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception;
	
	
	
	/**获取用户数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getRoleMenuCount(String pd)throws Exception;
	public void deleteRoleMenus(PageData pd)throws Exception;
	
	
	 
}

