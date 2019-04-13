package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * user_role实体类
 * 
 * @author 
 *
 */
public class UserRole {
	/***/
	private Integer id; 
	/**user-id*/
	private Integer uid; 
	/**role-id*/
	private Integer rid; 
	/**
	 * 实例化
	 */
	public UserRole() {
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
	 * 获取uid
	 * 
	 * @return
	 */
	public Integer getUid() {
		return uid;
	}

	/**
	 * 设置uid
	 * 
	 * @param uid
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
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

	@Override
	public String toString() {
		return "UserRole [id=" + id + " , uid=" + uid + " , rid=" + rid + "  ]";
	
	}
	
	
}