package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * experiment_properties实体类
 * 
 * @author 
 *
 */
public class ExperimentProperties {
	/***/
	private Integer id; 
	/**experiment-id*/
	private Integer eid; 
	/***/
	private Integer minval; 
	/***/
	private Integer max; 
	/**
	 * 实例化
	 */
	public ExperimentProperties() {
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
	 * 获取minval
	 * 
	 * @return
	 */
	public Integer getMinval() {
		return minval;
	}

	/**
	 * 设置minval
	 * 
	 * @param minval
	 */
	public void setMinval(Integer minval) {
		this.minval = minval;
	}
	
	/**
	 * 获取max
	 * 
	 * @return
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * 设置max
	 * 
	 * @param max
	 */
	public void setMax(Integer max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "ExperimentProperties [id=" + id + " , eid=" + eid + " , minval=" + minval + " , max=" + max + "  ]";
	
	}
	
	
}