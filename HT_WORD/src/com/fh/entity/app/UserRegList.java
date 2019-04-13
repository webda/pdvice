package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * user_reg_list实体类
 * 
 * @author 
 *
 */
public class UserRegList {
	/***/
	private Integer id; 
	/***/
	private Integer uid; 
	/***/
	private java.time.Instant createdate; 
	/**uses-id*/
	private Integer adminid; 
	/***/
	private String adminmobile; 
	/***/
	private Integer state; 
	/**å®¡æ‰¹ç†ç”±*/
	private Object reason; 
	/**å®¡æ‰¹æ—¶é—´*/
	private java.time.Instant applydate; 
	/**å®¡æ‰¹äººï¼Œuses-id*/
	private Integer applyuid; 
	/**
	 * 实例化
	 */
	public UserRegList() {
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
	 * 获取createdate
	 * 
	 * @return
	 */
	public java.time.Instant getCreatedate() {
		return createdate;
	}

	/**
	 * 设置createdate
	 * 
	 * @param createdate
	 */
	public void setCreatedate(java.time.Instant createdate) {
		this.createdate = createdate;
	}
	
	/**
	 * 获取adminid
	 * 
	 * @return
	 */
	public Integer getAdminid() {
		return adminid;
	}

	/**
	 * 设置adminid
	 * 
	 * @param adminid
	 */
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
	
	/**
	 * 获取adminmobile
	 * 
	 * @return
	 */
	public String getAdminmobile() {
		return adminmobile;
	}

	/**
	 * 设置adminmobile
	 * 
	 * @param adminmobile
	 */
	public void setAdminmobile(String adminmobile) {
		this.adminmobile = adminmobile;
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
	 * 获取reason
	 * 
	 * @return
	 */
	public Object getReason() {
		return reason;
	}

	/**
	 * 设置reason
	 * 
	 * @param reason
	 */
	public void setReason(Object reason) {
		this.reason = reason;
	}
	
	/**
	 * 获取applydate
	 * 
	 * @return
	 */
	public java.time.Instant getApplydate() {
		return applydate;
	}

	/**
	 * 设置applydate
	 * 
	 * @param applydate
	 */
	public void setApplydate(java.time.Instant applydate) {
		this.applydate = applydate;
	}
	
	/**
	 * 获取applyuid
	 * 
	 * @return
	 */
	public Integer getApplyuid() {
		return applyuid;
	}

	/**
	 * 设置applyuid
	 * 
	 * @param applyuid
	 */
	public void setApplyuid(Integer applyuid) {
		this.applyuid = applyuid;
	}

	@Override
	public String toString() {
		return "UserRegList [id=" + id + " , uid=" + uid + " , createdate=" + createdate + " , adminid=" + adminid + " , adminmobile=" + adminmobile + " , state=" + state + " , reason=" + reason + " , applydate=" + applydate + " , applyuid=" + applyuid + "  ]";
	
	}
	
	
}