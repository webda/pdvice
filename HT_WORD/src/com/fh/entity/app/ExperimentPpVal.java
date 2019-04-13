package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * experiment_pp_val实体类
 * 
 * @author 
 *
 */
public class ExperimentPpVal {
	/***/
	private Integer id; 
	/**å®žéªŒid*/
	private Integer eid; 
	/**å±žæ€§id*/
	private Integer pid; 
	/**å®žéªŒæ•°æ®*/
	private Double val; 
	/**æ•°æ®å¯¹åº”çš„æ—¶é—´*/
	private java.time.Instant curdate; 
	/**æ˜¯å¦å¼‚å¸¸*/
	private Integer isabn; 
	/**
	 * 实例化
	 */
	public ExperimentPpVal() {
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
	 * 获取curdate
	 * 
	 * @return
	 */
	public java.time.Instant getCurdate() {
		return curdate;
	}

	/**
	 * 设置curdate
	 * 
	 * @param curdate
	 */
	public void setCurdate(java.time.Instant curdate) {
		this.curdate = curdate;
	}
	
	/**
	 * 获取isabn
	 * 
	 * @return
	 */
	public Integer getIsabn() {
		return isabn;
	}

	/**
	 * 设置isabn
	 * 
	 * @param isabn
	 */
	public void setIsabn(Integer isabn) {
		this.isabn = isabn;
	}

	@Override
	public String toString() {
		return "ExperimentPpVal [id=" + id + " , eid=" + eid + " , pid=" + pid + " , val=" + val + " , curdate=" + curdate + " , isabn=" + isabn + "  ]";
	
	}
	
	
}