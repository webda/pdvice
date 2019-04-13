package com.fh.service.system.appuser;

import java.util.List;

import com.fh.entity.Page;
import com.fh.util.PageData;


/** 会员接口类
 * @author  HFTC
 */
public interface AppuserManager {
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllAppuserByRorlid(PageData pd) throws Exception;
	/**获取学生用户未选课程信息
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> nochoosecourse(PageData pd)throws Exception;
	
	/**通过id获取校长数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData finduserLience(PageData pd)throws Exception;
	
	
	/**修改用户,个别修改
	 * @param pd
	 * @throws Exception
	 */
	public void editUserinf(PageData pd)throws Exception;
	

	/**获取学员的开通图书数
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData>getstuopenbookcount(PageData pd) throws Exception ;
	
	
	/**获取校长的开通人数
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData>getopenbookcount(PageData pd) throws Exception;
	
	/**获取学生用户已经选择课程信息
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> selectedcourse(PageData pd)throws Exception;
	
	
	/**会员列表
	 * @param page
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listPdPageUser(Page page)throws Exception;
	
	/**通过用户名获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUsername(PageData pd)throws Exception;
	/**通过用户名获取数据多个
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> findByUsernamelist(PageData pd)throws Exception;
	
	
	
	/**修改用户复习设置
	 * @param pd
	 * @throws Exception
	 */
	public void editsyspreview(PageData pd)throws Exception;
	
	
	
	/**通过用户名和密码获取用户数据登录信息
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUsername_password(PageData pd)throws Exception;
	
	/**通过邮箱获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByEmail(PageData pd)throws Exception;
	
	/**通过编号获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByNumber(PageData pd)throws Exception;
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveU(PageData pd)throws Exception;
	
	/**批量保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveUmulti(PageData pd)throws Exception;
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteU(PageData pd)throws Exception;
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editU(PageData pd)throws Exception;
	
	/**修改用户登录次数
	 * @param pd
	 * @throws Exception
	 */
	public void editlogincount(PageData pd)throws Exception;
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editUser(PageData pd)throws Exception;
	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception;
	
	/**全部会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> listAllUser(PageData pd)throws Exception;
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAllU(String[] USER_IDS)throws Exception;
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getAppUserCount(String value)throws Exception;
	
}

