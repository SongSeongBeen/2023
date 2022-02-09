package com.javaex.vo;

public class CategoryVo {
	
	private int cateNo;
	private String id;
	private String catename;
	private String description;
	private String regDate;
	private int postNum;
	
	public CategoryVo() {
	}
	
	public CategoryVo(int cateNo, String id, String catename, String description, String regDate, int postNum) {
		this.cateNo = cateNo;
		this.id = id;
		this.catename = catename;
		this.description = description;
		this.regDate = regDate;
		this.postNum = postNum;
	}

	public int getCateNo() {
		return cateNo;
	}

	public void setCateNo(int cateNo) {
		this.cateNo = cateNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getPostNum() {
		return postNum;
	}

	public void setPostNum(int postNum) {
		this.postNum = postNum;
	}

	@Override
	public String toString() {
		return "CategoryVo [cateNo=" + cateNo + ", id=" + id + ", catename=" + catename + ", description=" + description
				+ ", regDate=" + regDate + ", postNum=" + postNum + "]";
	}
	
	
}
