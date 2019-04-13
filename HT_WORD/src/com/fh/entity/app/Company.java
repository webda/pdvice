package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * company实体类
 * 
 * @author 
 *
 */
public class Company {
	/***/
	private Integer id; 
	/***/
	private String company; 
	/***/
	private String address; 
	/***/
	private String phone; 
	/***/
	private String mobile; 
	/**è”ç³»äºº*/
	private String relation; 
	/**user-id,æŠ€æœ¯å‘˜*/
	private Integer owner; 
	/**user-idï¼Œåˆ›å»ºäºº*/
	private Integer creator; 
	/**1å¯ç”¨ï¼Œ0ä¸å¯ç”¨*/
	private Integer state; 
	/**1=å…¬å¸ï¼Œ2=å›¢ä½“ï¼Œ3=ä¸ªäººï¼Œ4=å®žéªŒå®¤*/
	private Integer type; 
	/**ç½‘å…³å”¯ä¸€æ ‡è¯†ç */
	private String getawaysn; 
	/**
	 * 实例化
	 */
	public Company() {
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
	 * 获取company
	 * 
	 * @return
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * 设置company
	 * 
	 * @param company
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	
	/**
	 * 获取address
	 * 
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置address
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * 获取phone
	 * 
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置phone
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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
	 * 获取relation
	 * 
	 * @return
	 */
	public String getRelation() {
		return relation;
	}

	/**
	 * 设置relation
	 * 
	 * @param relation
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	/**
	 * 获取owner
	 * 
	 * @return
	 */
	public Integer getOwner() {
		return owner;
	}

	/**
	 * 设置owner
	 * 
	 * @param owner
	 */
	public void setOwner(Integer owner) {
		this.owner = owner;
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
	 * 获取type
	 * 
	 * @return
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * 设置type
	 * 
	 * @param type
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	
	/**
	 * 获取getawaysn
	 * 
	 * @return
	 */
	public String getGetawaysn() {
		return getawaysn;
	}

	/**
	 * 设置getawaysn
	 * 
	 * @param getawaysn
	 */
	public void setGetawaysn(String getawaysn) {
		this.getawaysn = getawaysn;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + " , company=" + company + " , address=" + address + " , phone=" + phone + " , mobile=" + mobile + " , relation=" + relation + " , owner=" + owner + " , creator=" + creator + " , state=" + state + " , type=" + type + " , getawaysn=" + getawaysn + "  ]";
	
	}
	
	
}