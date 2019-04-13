package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * user_device实体类
 * 
 * @author 
 *
 */
public class UserDevice {
	/***/
	private Integer id; 
	/**user-id*/
	private Integer uid; 
	/**company-device-mobileçš„id*/
	private Integer cdid; 
	/**
	 * 实例化
	 */
	public UserDevice() {
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
	 * 获取cdid
	 * 
	 * @return
	 */
	public Integer getCdid() {
		return cdid;
	}

	/**
	 * 设置cdid
	 * 
	 * @param cdid
	 */
	public void setCdid(Integer cdid) {
		this.cdid = cdid;
	}

	@Override
	public String toString() {
		return "UserDevice [id=" + id + " , uid=" + uid + " , cdid=" + cdid + "  ]";
	
	}
	
	
}