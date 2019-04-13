package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * experiment实体类
 * 
 * @author 
 *
 */
public class Experiment {
	/***/
	private Integer id; 
	/**user-idå®žéªŒå‘˜id*/
	private Integer creator; 
	/**å®žéªŒåç§°*/
	private String name; 
	/**å¼€å§‹æ—¶é—´*/
	private java.time.Instant startdate; 
	/**é¢„è®¡ç»“æŸæ—¶é—´*/
	private java.time.Instant enddate; 
	/**å®žé™…ç»“æŸæ—¶é—´*/
	private java.time.Instant realenddate; 
	/**ç»“æŸäºº*/
	private Integer enduser; 
	/**ç»“æŸæ–¹å¼ï¼š0è‡ªåŠ¨ç»“æŸï¼Œ1å¼‚å¸¸è‡ªåŠ¨ç»“æŸï¼Œ2å¼‚å¸¸æ‰‹åŠ¨ç»“æŸï¼Œ3éžåˆ›å»ºäººç»“æŸ*/
	private Integer endtype; 
	/**0å®žéªŒç»“æŸï¼Œ1æ­£åœ¨å®žéªŒ*/
	private Integer state; 
	/**å¼‚å¸¸ä¸ªæ•°*/
	private Integer abncount; 
	/**
	 * 实例化
	 */
	public Experiment() {
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
	 * 获取creator
	 * 
	 * @return
	 */
	public Integer getCreator() {
		return creator;
	}

	/**
	 * 设置creator
	 * 
	 * @param creator
	 */
	public void setCreator(Integer creator) {
		this.creator = creator;
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
	 * 获取startdate
	 * 
	 * @return
	 */
	public java.time.Instant getStartdate() {
		return startdate;
	}

	/**
	 * 设置startdate
	 * 
	 * @param startdate
	 */
	public void setStartdate(java.time.Instant startdate) {
		this.startdate = startdate;
	}
	
	/**
	 * 获取enddate
	 * 
	 * @return
	 */
	public java.time.Instant getEnddate() {
		return enddate;
	}

	/**
	 * 设置enddate
	 * 
	 * @param enddate
	 */
	public void setEnddate(java.time.Instant enddate) {
		this.enddate = enddate;
	}
	
	/**
	 * 获取realenddate
	 * 
	 * @return
	 */
	public java.time.Instant getRealenddate() {
		return realenddate;
	}

	/**
	 * 设置realenddate
	 * 
	 * @param realenddate
	 */
	public void setRealenddate(java.time.Instant realenddate) {
		this.realenddate = realenddate;
	}
	
	/**
	 * 获取enduser
	 * 
	 * @return
	 */
	public Integer getEnduser() {
		return enduser;
	}

	/**
	 * 设置enduser
	 * 
	 * @param enduser
	 */
	public void setEnduser(Integer enduser) {
		this.enduser = enduser;
	}
	
	/**
	 * 获取endtype
	 * 
	 * @return
	 */
	public Integer getEndtype() {
		return endtype;
	}

	/**
	 * 设置endtype
	 * 
	 * @param endtype
	 */
	public void setEndtype(Integer endtype) {
		this.endtype = endtype;
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
	 * 获取abncount
	 * 
	 * @return
	 */
	public Integer getAbncount() {
		return abncount;
	}

	/**
	 * 设置abncount
	 * 
	 * @param abncount
	 */
	public void setAbncount(Integer abncount) {
		this.abncount = abncount;
	}

	@Override
	public String toString() {
		return "Experiment [id=" + id + " , creator=" + creator + " , name=" + name + " , startdate=" + startdate + " , enddate=" + enddate + " , realenddate=" + realenddate + " , enduser=" + enduser + " , endtype=" + endtype + " , state=" + state + " , abncount=" + abncount + "  ]";
	
	}
	
	
}