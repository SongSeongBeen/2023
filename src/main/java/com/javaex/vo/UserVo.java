package com.javaex.vo;

public class UserVo {
	private String id;
	private String bologTitle;
	private String logoFile;
	
	public UserVo() {
	}
	
	public UserVo(String id, String bologTitle, String logoFile) {
		this.id = id;
		this.bologTitle = bologTitle;
		this.logoFile = logoFile;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBologTitle() {
		return bologTitle;
	}

	public void setBologTitle(String bologTitle) {
		this.bologTitle = bologTitle;
	}

	public String getLogoFile() {
		return logoFile;
	}

	public void setLogoFile(String logoFile) {
		this.logoFile = logoFile;
	}

	@Override
	public String toString() {
		return "UserVo [id=" + id + ", bologTitle=" + bologTitle + ", logoFile=" + logoFile + "]";
	}
	
	
}
