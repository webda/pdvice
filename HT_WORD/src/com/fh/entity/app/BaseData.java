package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * base_data实体类
 * 
 * @author 
 *
 */
public class BaseData {
	/***/
	private Integer id; 
	/**çˆ¶çº§çš„codeï¼Œå¦‚æžœæ˜¯å¤§ç±»ä¸º-*/
	private String pcode; 
	/**å”¯ä¸€ä»£ç */
	private String code; 
	/***/
	private String name; 
	/***/
	private String value; 
	/**
	 * 实例化
	 */
	public BaseData() {
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
	 * 获取pcode
	 * 
	 * @return
	 */
	public String getPcode() {
		return pcode;
	}

	/**
	 * 设置pcode
	 * 
	 * @param pcode
	 */
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	
	/**
	 * 获取code
	 * 
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 设置code
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * 获取value
	 * 
	 * @return
	 */
	public String getValue() {
		return value;
	}

	/**
	 * 设置value
	 * 
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "BaseData [id=" + id + " , pcode=" + pcode + " , code=" + code + " , name=" + name + " , value=" + value + "  ]";
	
	}
	
	
}