package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * role_menu实体类
 * 
 * @author 
 *
 */
public class RoleMenu {
	/***/
	private Integer id; 
	/***/
	private Integer rid; 
	/**menuid*/
	private Integer pid; 
	/**
	 * 实例化
	 */
	public RoleMenu() {
		super();
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
	 * 获取rid
	 * 
	 * @return
	 */
	public Integer getRid() {
		return rid;
	}

	/**
	 * 设置rid
	 * 
	 * @param rid
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
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

	@Override
	public String toString() {
		return "RoleMenu [id=" + id + " , rid=" + rid + " , pid=" + pid + "  ]";
	
	}
	
	
}