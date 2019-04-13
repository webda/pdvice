package com.fh.entity.stucourse;

public class StuCourse {
	
        private Integer id;

	    private String userId;

	    private String textbookId;

	    private String headmasterId;

	    private String createTime;

	    private String outdateTime;

	    private Integer isOutdate;
	    private TextBook textbook;

	    public Integer getId() {
	        return this.id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getUserId() {
	        return this.userId;
	    }

	    public void setUserId(String userId) {
	        this.userId = userId;
	    }

	    public String getTextbookId() {
	        return this.textbookId;
	    }

	    public void setTextbookId(String textbookId) {
	        this.textbookId = textbookId;
	    }

	    public String getHeadmasterId() {
	        return this.headmasterId;
	    }

	    public void setHeadmasterId(String headmasterId) {
	        this.headmasterId = headmasterId;
	    }

	    public String getCreateTime() {
	        return this.createTime;
	    }

	    public void setCreateTime(String createTime) {
	        this.createTime = createTime;
	    }

	    public String getOutdateTime() {
	        return this.outdateTime;
	    }

	    public void setOutdateTime(String outdateTime) {
	        this.outdateTime = outdateTime;
	    }

	    public Integer getIsOutdate() {
	        return this.isOutdate;
	    }

	    public void setIsOutdate(Integer isOutdate) {
	        this.isOutdate = isOutdate;
	    }
	    
	   
	    public TextBook  getTextbook() {
	        return this.textbook;
	    }

	    public void setTextbook(TextBook  textbook) {
	        this.textbook = textbook;
	    }
	    
	    
	    
	}
	
	
	


