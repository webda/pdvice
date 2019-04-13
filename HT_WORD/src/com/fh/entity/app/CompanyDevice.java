package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * company_device实体类
 * 
 * @author 
 *
 */
public class CompanyDevice {
	/***/
	private Integer id; 
	/**company-id*/
	private Integer cid; 
	/**device-id*/
	private Integer did; 
	/**ip*/
	private String ip; 
	/**slaveid*/
	private Integer slaveid; 
	/**
	 * 实例化
	 */
	public CompanyDevice() {
		super();
	}
	   

	/**
	 * 获取Ip
	 * 
	 * @return
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * 设置Ip
	 * 
	 * @param Ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取slaveid
	 * 
	 * @return
	 */
	public Integer getSlaveid() {
		return slaveid;
	}

	/**
	 * 设置slaveid
	 * 
	 * @param slaveid
	 */
	public void setSlaveid(Integer slaveid) {
		this.slaveid = slaveid;
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
	 * 获取cid
	 * 
	 * @return
	 */
	public Integer getCid() {
		return cid;
	}

	/**
	 * 设置cid
	 * 
	 * @param cid
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
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

	@Override
	public String toString() {
		return "CompanyDevice [id=" + id + " , cid=" + cid + " , did=" + did + "  ]";
	
	}
	
	
}