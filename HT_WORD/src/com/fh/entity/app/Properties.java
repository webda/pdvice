package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * properties实体类
 * 
 * @author 
 *
 */
public class Properties {
	/***/
	private Integer id; 
	/***/
	private String name; 
	/**å•ä½*/
	private String unit; 
	/***/
	private String icon; 
	/**è®¡ç®—å™¨åç§°*/
	private String calc; 
	/**å¯„å­˜å™¨æ ‡è¯†*/
	private String tellflag; 
	/**
	 * 实例化
	 */
	public Properties() {
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
	 * 获取unit
	 * 
	 * @return
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * 设置unit
	 * 
	 * @param unit
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	/**
	 * 获取icon
	 * 
	 * @return
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 设置icon
	 * 
	 * @param icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	/**
	 * 获取calc
	 * 
	 * @return
	 */
	public String getCalc() {
		return calc;
	}

	/**
	 * 设置calc
	 * 
	 * @param calc
	 */
	public void setCalc(String calc) {
		this.calc = calc;
	}
	
	/**
	 * 获取tellflag
	 * 
	 * @return
	 */
	public String getTellflag() {
		return tellflag;
	}

	/**
	 * 设置tellflag
	 * 
	 * @param tellflag
	 */
	public void setTellflag(String tellflag) {
		this.tellflag = tellflag;
	}

	@Override
	public String toString() {
		return "Properties [id=" + id + " , name=" + name + " , unit=" + unit + " , icon=" + icon + " , calc=" + calc + " , tellflag=" + tellflag + "  ]";
	
	}
	
	
}