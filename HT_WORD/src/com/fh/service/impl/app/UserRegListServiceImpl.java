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
import com.fh.service.app.UserRegListService; 
import com.fh.entity.app.UserRegList;
import com.fh.entity.app.UserRegListAndUser;
import com.fh.util.PageData;


/**类名称：UserRegListServiceImplServiceImpl
 * @author HFTC
 */
@Service("UserRegListServiceImpl")
public class UserRegListServiceImpl implements UserRegListService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllUserRegList(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UserRegListMapper.listAllUserRegList", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryUserRegList(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UserRegListMapper.queryUserRegList", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<UserRegList> SelectUserRegLists(PageData pd) throws Exception {
		return (List<UserRegList>) dao.findForList("UserRegListMapper.SelectUserRegLists", pd);
	}

    @SuppressWarnings("unchecked")
	public List<UserRegListAndUser> SelectUserRegListAndUser(PageData pd) throws Exception {
		return (List<UserRegListAndUser>) dao.findForList("UserRegListMapper.SelectUserRegListAndUser", pd);
	}
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveUserRegList(PageData pd)throws Exception{
		dao.save("UserRegListMapper.saveUserRegList", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteUserRegList(PageData pd)throws Exception{
		dao.delete("UserRegListMapper.deleteUserRegList", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editUserRegList(PageData pd)throws Exception{
		dao.update("UserRegListMapper.editUserRegList", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("UserRegListMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("UserRegListMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getUserRegListCount(String value)throws Exception{
		return (PageData)dao.findForObject("UserRegListMapper.getUserRegListCount", value);
	}
	
}