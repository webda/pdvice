package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * device_properties_mobile实体类
 * 
 * @author 
 *
 */
public class DevicePropertiesMobile {
	/***/
	private Integer id; 
	/**è®¾å¤‡id*/
	private Integer did; 
	/**å±žæ€§id*/
	private Integer pid; 
	/**æœ€å¤§å€¼*/
	private Integer minval; 
	/**æœ€å°å€¼*/
	private Integer maxval; 
	/**
	 * 实例化
	 */
	public DevicePropertiesMobile() {
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
	
	/**
	 * 获取minval
	 * 
	 * @return
	 */
	public Integer getMinval() {
		return minval;
	}

	/**
	 * 设置minval
	 * 
	 * @param minval
	 */
	public void setMinval(Integer minval) {
		this.minval = minval;
	}
	
	/**
	 * 获取maxval
	 * 
	 * @return
	 */
	public Integer getMaxval() {
		return maxval;
	}

	/**
	 * 设置maxval
	 * 
	 * @param maxval
	 */
	public void setMaxval(Integer maxval) {
		this.maxval = maxval;
	}

	@Override
	public String toString() {
		return "DevicePropertiesMobile [id=" + id + " , did=" + did + " , pid=" + pid + " , minval=" + minval + " , maxval=" + maxval + "  ]";
	
	}
	
	
}