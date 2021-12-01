package com.javaex.ex03;

public class Song {
    //필드	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
    //메소드	
	public void setTitle(String t) {// 담는다
		title = t;
	}
	public String getTitle() {
		return title;
	}
	public void setArtist(String a) {// 담는다
		artist = a;
	}
	public String getArtist() {
		return artist;
	}
	public void setAlbum(String al) {// 담는다
		album = al;
	}
	public String getAlbum() {
		return album;
	}
	public void setComposer(String c) {// 담는다
		composer = c;
	}
	public String getComposer() {
		return composer;
	}
	public void setYear(int y) {// 담는다
		year = y;
	}
	public int getYear() {
		return year;
	}
	public void setTrack(int t) {// 담는다
		track = t;
	}
	public int getTrack() {
		return track;
	}
    //일반메소드	
	public void showInfo() { // showinfo 좀더 다양하게 출력가능 마지막 출력용
		System.out.println(
				artist + ", " + title + "(" + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
	}
	
}
//	@Override  (alt+shift+s) --> to String  //확인용 출력
//	public String toString() {
//		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
//				+ year + ", track=" + track + "]";
//	}
//	
	

