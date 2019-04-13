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
import com.fh.service.app.MenuService; 
import com.fh.entity.app.Menu;
import com.fh.util.PageData;


/**类名称：MenuServiceImplServiceImpl
 * @author HFTC
 */
@Service("MenuServiceImpl")
public class MenuServiceImpl implements MenuService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**列出某角色下的所有会员
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAllMenu(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("MenuMapper.listAllMenu", pd);
	}
	@SuppressWarnings("unchecked")
	public List<PageData> queryMenu(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("MenuMapper.queryMenu", pd);
	}
	
    @SuppressWarnings("unchecked")
	public List<Menu> SelectMenus(PageData pd) throws Exception {
		return (List<Menu>) dao.findForList("MenuMapper.SelectMenus", pd);
	}
	
	/**保存用户
	 * @param pd
	 * @throws Exception
	 */
	public void saveMenu(PageData pd)throws Exception{
		dao.save("MenuMapper.saveMenu", pd);
	}
	
	
	/**删除用户
	 * @param pd
	 * @throws Exception
	 */
	public void deleteMenu(PageData pd)throws Exception{
		dao.delete("MenuMapper.deleteMenu", pd);
	}
	
	/**修改用户
	 * @param pd
	 * @throws Exception
	 */
	public void editMenu(PageData pd)throws Exception{
		dao.update("MenuMapper.editMenu", pd);
	}
	

	
	/**通过id获取数据
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public PageData findByUiId(PageData pd)throws Exception{
		return (PageData)dao.findForObject("MenuMapper.findByUiId", pd);
	}
	 
	
	/**批量删除用户
	 * @param USER_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] USER_IDS)throws Exception{
		dao.delete("MenuMapper.deleteAll", USER_IDS);
	}
	
	/**获取总数
	 * @param pd
	 * @throws Exception
	 */
	public PageData getMenuCount(String value)throws Exception{
		return (PageData)dao.findForObject("MenuMapper.getMenuCount", value);
	}


	public List<Menu> listSubMenuByParentId(int parenid)throws Exception{
		return (List<Menu>)dao.findForList("MenuMapper.listSubMenuByParentId", parenid);
	}
	public List<Menu> listAllMenuQx(int id) throws Exception {
		// TODO Auto-generated method stub
		List<Menu> menuList = this.listSubMenuByParentId(id);
		for(Menu menu : menuList){
			menu.setSubMenu(this.listAllMenuQx(menu.getId()));
			menu.setTarget("treeFrame");
		}
		return menuList;
	}
	
}