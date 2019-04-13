package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * company_device_mobile实体类
 * 
 * @author 
 *
 */
public class CompanyDeviceMobile {
	/***/
	private Integer id; 
	/***/
	private Integer did; 
	/***/
	private Integer cid; 
	/**user-id*/
	private Integer createor; 
	/***/
	private java.time.Instant createdate; 
	/**-1ä¸æé†’ï¼Œ0ä¸€ç›´æé†’ï¼Œå…¶ä»–æ•°æ®ä¸ºæé†’æ¬¡æ•°*/
	private Integer remind; 
	/**å•ä½åˆ†é’Ÿï¼Œæé†’é—´éš”*/
	private Integer interval; 
	/**æ— å¤„ç†æ—¶è‡ªåŠ¨å¤„ç†æ–¹å¼ï¼Œ0=ä¸å¤„ç†ï¼Œ1=å…³æœº*/
	private Integer handle; 
	/**æ˜¯å¦é€šçŸ¥ç®¡ç†å‘˜ï¼Œ0ä¸é€šçŸ¥ï¼Œ1é€šçŸ¥*/
	private Integer remindadmin; 
	/**-1ä¸å¯ç”¨ï¼Œæ­£åœ¨ç»´ä¿®ï¼Œ0ç©ºé—²ï¼Œ1å ç”¨*/
	private Integer state; 
	/**
	 * 实例化
	 */
	public CompanyDeviceMobile() {
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
	 * 获取createor
	 * 
	 * @return
	 */
	public Integer getCreateor() {
		return createor;
	}

	/**
	 * 设置createor
	 * 
	 * @param createor
	 */
	public void setCreateor(Integer createor) {
		this.createor = createor;
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
	 * 获取remind
	 * 
	 * @return
	 */
	public Integer getRemind() {
		return remind;
	}

	/**
	 * 设置remind
	 * 
	 * @param remind
	 */
	public void setRemind(Integer remind) {
		this.remind = remind;
	}
	
	/**
	 * 获取interval
	 * 
	 * @return
	 */
	public Integer getInterval() {
		return interval;
	}

	/**
	 * 设置interval
	 * 
	 * @param interval
	 */
	public void setInterval(Integer interval) {
		this.interval = interval;
	}
	
	/**
	 * 获取handle
	 * 
	 * @return
	 */
	public Integer getHandle() {
		return handle;
	}

	/**
	 * 设置handle
	 * 
	 * @param handle
	 */
	public void setHandle(Integer handle) {
		this.handle = handle;
	}
	
	/**
	 * 获取remindadmin
	 * 
	 * @return
	 */
	public Integer getRemindadmin() {
		return remindadmin;
	}

	/**
	 * 设置remindadmin
	 * 
	 * @param remindadmin
	 */
	public void setRemindadmin(Integer remindadmin) {
		this.remindadmin = remindadmin;
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
		return "CompanyDeviceMobile [id=" + id + " , did=" + did + " , cid=" + cid + " , createor=" + createor + " , createdate=" + createdate + " , remind=" + remind + " , interval=" + interval + " , handle=" + handle + " , remindadmin=" + remindadmin + " , state=" + state + "  ]";
	
	}
	
	
}