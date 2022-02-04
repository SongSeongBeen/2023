package com.javaex.vo;

public class GalleryVo {
	
	//필드
	private int no;
	private int user_no;
	private String nmae;
	private String content;
	private String filePath;
	private String orgName;
	private String saveName;
	private String fileSize;
	
	
	public GalleryVo() {

	}
	
	public GalleryVo(int no, int user_no, String nmae, String content, String filePath, String orgName, String saveName,
			String fileSize) {
		this.no = no;
		this.user_no = user_no;
		this.nmae = nmae;
		this.content = content;
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getNmae() {
		return nmae;
	}

	public void setNmae(String nmae) {
		this.nmae = nmae;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "GalleryVo [no=" + no + ", user_no=" + user_no + ", nmae=" + nmae + ", content=" + content
				+ ", filePath=" + filePath + ", orgName=" + orgName + ", saveName=" + saveName + ", fileSize="
				+ fileSize + "]";
	}
	
	
	

}
