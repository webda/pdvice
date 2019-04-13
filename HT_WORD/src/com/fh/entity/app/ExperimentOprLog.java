package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * experiment_opr_log实体类
 * 
 * @author 
 *
 */
public class ExperimentOprLog {
	/***/
	private Integer id; 
	/**å®žéªŒid*/
	private Integer eid; 
	/**æ“ä½œå±žæ€§idï¼Œå¦‚æžœä¸æ˜¯å¯¹å±žæ€§æ“ä½œï¼Œæ¯”å¦‚å…³æœºï¼Œæ­¤é¡¹ä¸º0*/
	private Integer pid; 
	/**æ“ä½œäºº*/
	private Integer uid; 
	/**æ“ä½œå†…å®¹*/
	private String content; 
	/**æ“ä½œæ—¶é—´*/
	private java.time.Instant oprdate; 
	/**
	 * 实例化
	 */
	public ExperimentOprLog() {
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
	 * 获取content
	 * 
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 设置content
	 * 
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 获取oprdate
	 * 
	 * @return
	 */
	public java.time.Instant getOprdate() {
		return oprdate;
	}

	/**
	 * 设置oprdate
	 * 
	 * @param oprdate
	 */
	public void setOprdate(java.time.Instant oprdate) {
		this.oprdate = oprdate;
	}

	@Override
	public String toString() {
		return "ExperimentOprLog [id=" + id + " , eid=" + eid + " , pid=" + pid + " , uid=" + uid + " , content=" + content + " , oprdate=" + oprdate + "  ]";
	
	}
	
	
}