package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * device_properties实体类
 * 
 * @author 
 *
 */
public class DeviceProperties {
	/***/
	private Integer id; 
	/***/
	private Integer did; 
	/**å±žæ€§id*/
	private Integer pid; 
	/**
	 * 实例化
	 */
	public DeviceProperties() {
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
	 * 获取did
	 * 
	 * @return
	 */
	public Integer getDid() {
		return did;
	}

	/**
	 * 设置did
	 * 
	 * @param did
	 */
	public void setDid(Integer did) {
		this.did = did;
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
		return "DeviceProperties [id=" + id + " , did=" + did + " , pid=" + pid + "  ]";
	
	}
	
	
}