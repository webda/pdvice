package com.fh.entity.app;
import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Page;

/**
 * device实体类
 * 
 * @author 
 *
 */
public class Device {
	/***/
	private Integer id; 
	/***/
	private String name; 
	/**å”¯ä¸€æ ‡è¯†ç ï¼Œåœ¨ç½‘å…³èŽ·å–æ•°æ®æ—¶è¦ç”¨åˆ°*/
	private String sn; 
	/***/
	private String producer; 
	/**è´­ä¹°æ—¶é—´*/
	private java.time.Instant buydate; 
	/**ç»´æŠ¤åˆ°æœŸæ—¶é—´*/
	private java.time.Instant duedate; 
	/**è®¾å¤‡ç±»åž‹*/
	private Integer type; 
	/**user-idï¼ŒæŠ€æœ¯å‘˜*/
	private Integer owner; 
	/**user-id*/
	private Integer creator; 
	/***/
	private java.time.Instant createdate; 
	/**图片*/
	private String img; 
	/**产地*/
	private String origin; 
	/**
	 * 实例化
	 */
	public Device() {
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
	 * 获取sn
	 * 
	 * @return
	 */
	public String getSn() {
		return sn;
	}

	/**
	 * 设置sn
	 * 
	 * @param sn
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}
	
	/**
	 * 获取producer
	 * 
	 * @return
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * 设置producer
	 * 
	 * @param producer
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	/**
	 * 获取buydate
	 * 
	 * @return
	 */
	public java.time.Instant getBuydate() {
		return buydate;
	}

	/**
	 * 设置buydate
	 * 
	 * @param buydate
	 */
	public void setBuydate(java.time.Instant buydate) {
		this.buydate = buydate;
	}
	
	/**
	 * 获取duedate
	 * 
	 * @return
	 */
	public java.time.Instant getDuedate() {
		return duedate;
	}

	/**
	 * 设置duedate
	 * 
	 * @param duedate
	 */
	public void setDuedate(java.time.Instant duedate) {
		this.duedate = duedate;
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
	 * 获取img
	 * 
	 * @return
	 */
	public String getImg() {
		return img;
	}

	/**
	 * 设置img
	 * 
	 * @param img
	 */
	public void setImg(String img) {
		this.img = img;
	}
	
	/**
	 * 获取origin
	 * 
	 * @return
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * 设置origin
	 * 
	 * @param origin
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + " , name=" + name + " , sn=" + sn + " , producer=" + producer + " , buydate=" + buydate + " , duedate=" + duedate + " , type=" + type + " , owner=" + owner + " , creator=" + creator + " , createdate=" + createdate + " , img=" + img + " , origin=" + origin + "  ]";
	
	}
	
	
}