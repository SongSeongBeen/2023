package com.javaex.ex05;

public class Song {
	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	//생성자
	public Song() {
		
	}
	public Song(String title, String artist, String album, String composer) {
		this(title, artist, album, composer, 0);
	}
	public Song(String title, String artist, String album, String composer, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
	}
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(title, artist, album, composer,year);
		this.track = track;
	}
	


	// 생성자
	
//	public Song() {
//
//	}
//	
//	public Song(String title, String artist, String album, String composer) {
//		this(title, artist, album, composer, "");
//
//	}
//
//	public Song(String title, String artist, String album, String composer, String year) {
//		this.title = title;
//		this.artist = artist;
//		this.album = album;
//		
//		// 작곡가 이름이 최대10글자 까지만 입력 코드:100줄
//		this.composer = composer;
//		
//		// 년도 2021년 이후 년도 들어오면 2021으로 처리 2023 -->2021 코드:200줄
//		this.year = year;
//	}
//
//	public Song(String title, String artist, String album, String composer int track) {
//		this(title, artist, album, composer, year);
//
//		this.track = track;
//	}
//
	// 메소드 g/s
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}

	//메소드 일반
	public void showInfo() {   // 출력용    draw() 
		System.out.println(artist+ ", " + title + "(" + album+ ", " + year+ ", " + track+"번 track, "+ composer+" 작곡)");
	
	
//	@Override
//	public String toString() {
//		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
//				+ year + ", track=" + track + "]";
		
	}
	
	
	
	

}
