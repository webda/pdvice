package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * experiment_abnormal实体类
 * 
 * @author 
 *
 */
public class ExperimentAbnormal {
	/***/
	private Integer id; 
	/***/
	private Integer eid; 
	/***/
	private Integer pid; 
	/***/
	private Integer minid; 
	/***/
	private Integer maxid; 
	/***/
	private Double val; 
	/**ä¸‹æ¬¡æé†’æ—¶é—´*/
	private java.time.Instant nextreminddate; 
	/** å‰©ä½™æé†’æ¬¡æ•°*/
	private Integer residueremindtime; 
	/**æ€»éœ€è¦æé†’æ¬¡æ•°*/
	private Integer totaltime; 
	/**è‡ªåŠ¨æé†’æ˜¯å¦æ‰§è¡Œå®Œæ¯•ï¼Œ0æ‰§è¡Œå®Œæ¯•*/
	private Integer state; 
	/**æ˜¯å¦å·²ç»æé†’äº†ç®¡ç†å‘˜,1å·²ç»æé†’*/
	private Integer isremindadmin; 
	/**
	 * 实例化
	 */
	public ExperimentAbnormal() {
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
	 * 获取eid
	 * 
	 * @return
	 */
	public Integer getEid() {
		return eid;
	}

	/**
	 * 设置eid
	 * 
	 * @param eid
	 */
	public void setEid(Integer eid) {
		this.eid = eid;
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
	 * 获取minid
	 * 
	 * @return
	 */
	public Integer getMinid() {
		return minid;
	}

	/**
	 * 设置minid
	 * 
	 * @param minid
	 */
	public void setMinid(Integer minid) {
		this.minid = minid;
	}
	
	/**
	 * 获取maxid
	 * 
	 * @return
	 */
	public Integer getMaxid() {
		return maxid;
	}

	/**
	 * 设置maxid
	 * 
	 * @param maxid
	 */
	public void setMaxid(Integer maxid) {
		this.maxid = maxid;
	}
	
	/**
	 * 获取val
	 * 
	 * @return
	 */
	public Double getVal() {
		return val;
	}

	/**
	 * 设置val
	 * 
	 * @param val
	 */
	public void setVal(Double val) {
		this.val = val;
	}
	
	/**
	 * 获取nextreminddate
	 * 
	 * @return
	 */
	public java.time.Instant getNextreminddate() {
		return nextreminddate;
	}

	/**
	 * 设置nextreminddate
	 * 
	 * @param nextreminddate
	 */
	public void setNextreminddate(java.time.Instant nextreminddate) {
		this.nextreminddate = nextreminddate;
	}
	
	/**
	 * 获取residueremindtime
	 * 
	 * @return
	 */
	public Integer getResidueremindtime() {
		return residueremindtime;
	}

	/**
	 * 设置residueremindtime
	 * 
	 * @param residueremindtime
	 */
	public void setResidueremindtime(Integer residueremindtime) {
		this.residueremindtime = residueremindtime;
	}
	
	/**
	 * 获取totaltime
	 * 
	 * @return
	 */
	public Integer getTotaltime() {
		return totaltime;
	}

	/**
	 * 设置totaltime
	 * 
	 * @param totaltime
	 */
	public void setTotaltime(Integer totaltime) {
		this.totaltime = totaltime;
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
	 * 获取isremindadmin
	 * 
	 * @return
	 */
	public Integer getIsremindadmin() {
		return isremindadmin;
	}

	/**
	 * 设置isremindadmin
	 * 
	 * @param isremindadmin
	 */
	public void setIsremindadmin(Integer isremindadmin) {
		this.isremindadmin = isremindadmin;
	}

	@Override
	public String toString() {
		return "ExperimentAbnormal [id=" + id + " , eid=" + eid + " , pid=" + pid + " , minid=" + minid + " , maxid=" + maxid + " , val=" + val + " , nextreminddate=" + nextreminddate + " , residueremindtime=" + residueremindtime + " , totaltime=" + totaltime + " , state=" + state + " , isremindadmin=" + isremindadmin + "  ]";
	
	}
	
	
}