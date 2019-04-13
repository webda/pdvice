package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * users实体类
 * 
 * @author 
 *
 */
public class Users {
	/***/
	private Integer id; 
	/**å…¬å¸idï¼Œåœ¨usertypeä¸ºå®žéªŒå®¤ç®¡ç†å‘˜å’Œå®žéªŒå‘˜æ—¶éœ€è¦å¡«*/
	private Integer cid; 
	/**è°åˆ›å»ºçš„ï¼Œid*/
	private Integer pid; 
	/***/
	private String name; 
	/***/
	private String pwd; 
	/***/
	private String realname; 
	/***/
	private String mobile; 
	/***/
	private String email; 
	/***/
	private java.time.Instant lastlogin; 
	/***/
	private Integer state; 
	/**1=åŽå°è¶…çº§ç®¡ç†å‘˜ï¼Œ2=åŽå°ç®¡ç†å‘˜ï¼Œ3=æŠ€æœ¯å‘˜ï¼Œ11=å®žéªŒå®¤è¶…çº§ç®¡ç†å‘˜ï¼Œ12=å®žéªŒç®¡ç†å‘˜ï¼Œ13=å®žéªŒå‘˜*/
	private Integer usertype; 
	/**æ˜¯å¦åˆ é™¤ï¼Œåˆ é™¤åŽï¼Œä¸æ˜¾ç¤ºï¼Œåªæ˜¾ç¤ºåœ¨å…³è”æ•°æ®ä¸Š*/
	private Integer isdel; 
	/**æ˜¯å¦éœ€è¦ä¿®æ”¹å¯†ç ï¼Œä¸€èˆ¬æ˜¯é»˜è®¤å¯†ç æ—¶ï¼ˆåˆ›å»ºç”¨æˆ·ã€é‡ç½®ç”¨æˆ·æ—¶ä¸º1ï¼‰ï¼Œåœ¨ç™»å½•åŽæç¤ºä¿®æ”¹å¯†ç */
	private Integer isneedchgpwd; 
	/**
	 * 实例化
	 */
	public Users() {
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
	 * 获取pwd
	 * 
	 * @return
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * 设置pwd
	 * 
	 * @param pwd
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	 * 获取email
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置email
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 获取lastlogin
	 * 
	 * @return
	 */
	public java.time.Instant getLastlogin() {
		return lastlogin;
	}

	/**
	 * 设置lastlogin
	 * 
	 * @param lastlogin
	 */
	public void setLastlogin(java.time.Instant lastlogin) {
		this.lastlogin = lastlogin;
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
	 * 获取usertype
	 * 
	 * @return
	 */
	public Integer getUsertype() {
		return usertype;
	}

	/**
	 * 设置usertype
	 * 
	 * @param usertype
	 */
	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}
	
	/**
	 * 获取isdel
	 * 
	 * @return
	 */
	public Integer getIsdel() {
		return isdel;
	}

	/**
	 * 设置isdel
	 * 
	 * @param isdel
	 */
	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}
	
	/**
	 * 获取isneedchgpwd
	 * 
	 * @return
	 */
	public Integer getIsneedchgpwd() {
		return isneedchgpwd;
	}

	/**
	 * 设置isneedchgpwd
	 * 
	 * @param isneedchgpwd
	 */
	public void setIsneedchgpwd(Integer isneedchgpwd) {
		this.isneedchgpwd = isneedchgpwd;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + " , cid=" + cid + " , pid=" + pid + " , name=" + name + " , pwd=" + pwd + " , realname=" + realname + " , mobile=" + mobile + " , email=" + email + " , lastlogin=" + lastlogin + " , state=" + state + " , usertype=" + usertype + " , isdel=" + isdel + " , isneedchgpwd=" + isneedchgpwd + "  ]";
	
	}
	
	
}