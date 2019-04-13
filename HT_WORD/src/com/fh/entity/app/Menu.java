package com.fh.entity.app;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * menu实体类
 * 
 * @author 
 *
 */
public class Menu {
	/***/
	private Integer id; 
	/***/
	private Integer pid; 
	/***/
	private String name; 
	/***/
	private String url; 
	/***/
	private Integer sort; 
	/***/
	private String icon; 
	/***/
	private Integer state; 
	/**1=åŽå°ï¼Œ2=æ‰‹æœº*/
	private Integer pagetype; 
	/**1=åŽå°ç®¡ç†å‘˜å¯ä»¥åˆ†é…çš„*/
	private Integer mgr; 
	private boolean HasMenu; 
	/**
	 * 实例化
	 */
	public Menu() {
		super();
	}
	   
	/**
	 * 获取id
	 * 
	 * @return
	 */
	public boolean getHasMenu() {
		return HasMenu;
	}

	/**
	 * 设置id
	 * 
	 * @param id
	 */
	public void setHasMenu(boolean HasMenu) {
		this.HasMenu = HasMenu;
	}
	
	/**
	 * 获取id
	 * 
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置id
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		 
		this.id = id;
	}
	

	/**
	 * 获取pid
	 * 
	 * @return
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * 设置pid
	 * 
	 * @param pid
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	/**
	 * 获取name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取url
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置url
	 * 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * 获取sort
	 * 
	 * @return
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * 设置sort
	 * 
	 * @param sort
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	/**
	 * 获取icon
	 * 
	 * @return
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 设置icon
	 * 
	 * @param icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	/**
	 * 获取state
	 * 
	 * @return
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * 设置state
	 * 
	 * @param state
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	
	/**
	 * 获取pagetype
	 * 
	 * @return
	 */
	public Integer getPagetype() {
		return pagetype;
	}

	/**
	 * 设置pagetype
	 * 
	 * @param pagetype
	 */
	public void setPagetype(Integer pagetype) {
		this.pagetype = pagetype;
	}
	
	/**
	 * 获取mgr
	 * 
	 * @return
	 */
	public Integer getMgr() {
		return mgr;
	}

	/**
	 * 设置mgr
	 * 
	 * @param mgr
	 */
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + " , pid=" + pid + " , name=" + name + " , url=" + url + " , sort=" + sort + " , icon=" + icon + " , state=" + state + " , pagetype=" + pagetype + " , mgr=" + mgr + "  ]";
	
	}
	public List<Menu> subMenu;
	public List<Menu> getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(List<Menu> subMenu) {
		this.subMenu = subMenu;
	}
	public String target;
	public void setTarget(String target) {
		this.target = target;
	}
	public String getTarget() {
		return target;
	}
}