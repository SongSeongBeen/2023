package com.javaex.ex07;

public class BookVo {

	private int bookId;
	private String title;
	private String pubs;
	private String pubdate;
	private String authorId;
	private String authorName;
	private String authorDesc;  //-->조인한 결과값 까지 같이 입력
	
	public BookVo() {

	}
	public BookVo(int bookId, String title, String pubs, String pubdate, String authorId, String authorName,
			String authorDesc) {

		this.bookId = bookId;
		this.title = title;
		this.pubs = pubs;
		this.pubdate = pubdate;
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorDesc = authorDesc;
	}

	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getPubs() {
		return pubs;
	}

	public String getPubdate() {
		return pubdate;
	}

	public String getAuthorId() {
		return authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getAuthorDesc() {
		return authorDesc;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPubs(String pubs) {
		this.pubs = pubs;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}

	@Override
	public String toString() {
		return "BookVo [bookId=" + bookId + ", title=" + title + ", pubs=" + pubs + ", pubdate=" + pubdate
				+ ", authorId=" + authorId + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}
	
	
	
	
	
	
	
	
	
}
