package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * role实体类
 * 
 * @author 
 *
 */
public class Role {
	/***/
	private Integer id; 
	/***/
	private String name; 
	/***/
	private String desc; 
	/**user-id*/
	private Integer creator; 
	/**
	 * 实例化
	 */
	public Role() {
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
	 * 获取desc
	 * 
	 * @return
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * 设置desc
	 * 
	 * @param desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
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

	@Override
	public String toString() {
		return "Role [id=" + id + " , name=" + name + " , desc=" + desc + " , creator=" + creator + "  ]";
	
	}
	
	
}