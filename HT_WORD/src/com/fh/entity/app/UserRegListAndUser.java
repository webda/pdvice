package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * user_reg_list实体类
 * 
 * @author 
 *
 */
public class UserRegListAndUser {
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
	private String adminname; 
	/***/
	private Integer state; 
	/**å®¡æ‰¹ç†ç”±*/
	private String reason; 
	/**å®¡æ‰¹æ—¶é—´*/
	private java.time.Instant applydate; 
	/**å®¡æ‰¹äººï¼Œuses-id*/
	private Integer applyuid; 
	private String name; 
	private String realname; 
	private String mobile; 
	private String email; 
	/**
	 * 实例化
	 */
	public UserRegListAndUser() {
		super();
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
	 * 获取realname
	 * 
	 * @return
	 */
	public String getRealname() {
		return realname;
	}

	/**
	 * 设置realname
	 * 
	 * @param realname
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}
	/**
	 * 获取mobile
	 * 
	 * @return
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置mobile
	 * 
	 * @param mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	/**
	 * 获取mobile
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置mobile
	 * 
	 * @param mobile
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

 
	
	
}