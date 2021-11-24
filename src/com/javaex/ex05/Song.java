package com.javaex.ex05;

public class Song {
	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	// 생성자
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	//메소드 g/s
	//메소드 일반
	public void showinfo() {   // 출력용
		System.out.println(artist+ ", " + title + "(" + album+ ", " + year+ ", " + track+"번 track, "+ composer+" 작곡)");
	
	
//	@Override
//	public String toString() {
//		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
//				+ year + ", track=" + track + "]";
	}
	
	

}
