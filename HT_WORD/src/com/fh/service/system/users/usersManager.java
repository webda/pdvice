/**
 * 
 */
/**
 * @author xyh
 *
 */
package com.fh.service.system.users;

import java.util.List;

import com.fh.entity.Page;
import com.fh.util.PageData;


/** 会员接口类
 * @author  HFTC
 */
public interface usersManager {
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllusersByRorlid(PageData pd) throws Exception;
 
 
	
	/**修改用户,个别修改
	 * @param pd
	 * @throws Exception
	 */
	public PageData getUserInfo(PageData pd)throws Exception;
	

	/**
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void saveU(PageData pd) throws Exception ;
	
	
	/**
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void deleteU(PageData pd) throws Exception;
	
	
	
	/**修改用户
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public void editU(PageData pd)throws Exception;
	
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
	public void deleteAllU(String[] USER_IDS)throws Exception;
	
	
	
	/**获取用户数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getusersCount(String pd)throws Exception;
	
	
	 
}

