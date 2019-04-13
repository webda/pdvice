package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * user_apply_device实体类
 * 
 * @author 
 *
 */
public class UserApplyDevice {
	/***/
	private Integer id; 
	/***/
	private Integer uid; 
	/**company-device-mobileçš„id*/
	private Integer cdid; 
	/**ç”³è¯·æ—¶é—´*/
	private java.time.Instant creatordate; 
	/**ç”³è¯·ç†ç”±*/
	private String reason; 
	/**user-idï¼Œå¤„ç†äºº*/
	private Integer dealid; 
	/**å¤„ç†æ—¶é—´*/
	private java.time.Instant dealdate; 
	/**0å¾…å®¡æ‰¹ï¼Œ1é€šè¿‡ï¼Œ2æ‹’ç»*/
	private Integer state; 
	/**
	 * 实例化
	 */
	public UserApplyDevice() {
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
	
	/**
	 * 获取creatordate
	 * 
	 * @return
	 */
	public java.time.Instant getCreatordate() {
		return creatordate;
	}

	/**
	 * 设置creatordate
	 * 
	 * @param creatordate
	 */
	public void setCreatordate(java.time.Instant creatordate) {
		this.creatordate = creatordate;
	}
	
	/**
	 * 获取reason
	 * 
	 * @return
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * 设置reason
	 * 
	 * @param reason
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	/**
	 * 获取dealid
	 * 
	 * @return
	 */
	public Integer getDealid() {
		return dealid;
	}

	/**
	 * 设置dealid
	 * 
	 * @param dealid
	 */
	public void setDealid(Integer dealid) {
		this.dealid = dealid;
	}
	
	/**
	 * 获取dealdate
	 * 
	 * @return
	 */
	public java.time.Instant getDealdate() {
		return dealdate;
	}

	/**
	 * 设置dealdate
	 * 
	 * @param dealdate
	 */
	public void setDealdate(java.time.Instant dealdate) {
		this.dealdate = dealdate;
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

	@Override
	public String toString() {
		return "UserApplyDevice [id=" + id + " , uid=" + uid + " , cdid=" + cdid + " , creatordate=" + creatordate + " , reason=" + reason + " , dealid=" + dealid + " , dealdate=" + dealdate + " , state=" + state + "  ]";
	
	}
	
	
}