package com.javaex.vo;

public class BoardVo {
	
		//필드
		private int no;
		private String title;
		private String content;
		private String name;
		private int hit;
		private String regDate;
		private int userNo;
		
		public BoardVo() {
		}
		
		//쓰기
		public BoardVo(String title, String content, int userNo) {
			this.title = title;
			this.content = content;
			this.userNo = userNo;
		}
		
		//수정
		public BoardVo(int no, String title, String content) {
			super();
			this.no = no;
			this.title = title;
			this.content = content;
		}
		
		public BoardVo(int no, String title, String content, int hit, String regDate, int userNo) {
			super();
			this.no = no;
			this.title = title;
			this.content = content;
			this.hit = hit;
			this.regDate = regDate;
			this.userNo = userNo;
		}
		
		public BoardVo(int no, String title, String content, String name, int hit, String regDate, int userNo) {
			super();
			this.no = no;
			this.title = title;
			this.content = content;
			this.name = name;
			this.hit = hit;
			this.regDate = regDate;
			this.userNo = userNo;
		}
	
		public int getNo() {
			return no;
		}
	
		public void setNo(int no) {
			this.no = no;
		}
	
		public String getTitle() {
			return title;
		}
	
		public void setTitle(String title) {
			this.title = title;
		}
	
		public String getContent() {
			return content;
		}
	
		public void setContent(String content) {
			this.content = content;
		}
	
		public int getHit() {
			return hit;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	
		public String getName() {
			return name;
		}
	
		public void setHit(int hit) {
			this.hit = hit;
		}
	
		public String getRegDate() {
			return regDate;
		}
	
		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}
	
		public int getUserNo() {
			return userNo;
		}
	
		public void setUserNo(int userNo) {
			this.userNo = userNo;
		}
		@Override
		public String toString() {
			return "BoardVo [no=" + no + ", title=" + title + ", content=" + content + ", hit=" + hit + ", regDate="
					+ regDate + ", userNo=" + userNo + "]";
		}
			
	
}
