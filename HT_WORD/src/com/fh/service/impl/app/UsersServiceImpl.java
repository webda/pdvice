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
import com.fh.service.app.UsersService; 
import com.fh.entity.app.Users;
import com.fh.util.PageData;


/**类名称：UsersServiceImplServiceImpl
 * @author HFTC
 */
@Service("UsersServiceImpl")
public class UsersServiceImpl implements UsersService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllUsers(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UsersMapper.listAllUsers", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryUsers(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UsersMapper.queryUsers", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<Users> SelectUserss(PageData pd) throws Exception {
		return (List<Users>) dao.findForList("UsersMapper.SelectUserss", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public int saveUsers(PageData pd)throws Exception{
		 
		
		int re=  (int)dao.save("UsersMapper.saveUsers", pd);
		if(re==0)  return -1;
		
		return Integer.parseInt(pd.getString("id"));
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteUsers(PageData pd)throws Exception{
		dao.delete("UsersMapper.deleteUsers", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editUsers(PageData pd)throws Exception{
		dao.update("UsersMapper.editUsers", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("UsersMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("UsersMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getUsersCount(String value)throws Exception{
		return (PageData)dao.findForObject("UsersMapper.getUsersCount", value);
	}
	@Override
	public PageData getUserByNameAndPwd(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return (PageData)dao.findForObject("UsersMapper.getUserByNameAndPwd", pd);
	}
	
	@Override
	public List<PageData> PageUsers(Page page)throws Exception
	{
		return (List<PageData>)dao.findForList("UsersMapper.datalistPage", page);
		
	}
}