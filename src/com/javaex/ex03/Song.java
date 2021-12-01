package com.javaex.ex03;

public class Song {
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//생성자
	public Song() { //디폴트 생성자
		System.out.println("Song(파라미터0개)");
	}
	
	public Song(String title, String artist, String album,  String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(파라미터5개)");
	}
	
	public Song(String title, String artist, String album,  String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track = track;
		System.out.println("Song(파라미터6개)");
	}
	//메소드g/s

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return composer;
	}

	public void setYear(String year) {
		this.year = year;
	}
	public String getYear() {
		return year;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	public int getTrack() {
		return track;
	}
	//일반메소드

//	@Override
//	public String toString() {
//		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
//				+ year + ", track=" + track + "]";
//	}
//	
//	public void showInfo() {
//		System.out.println(title + artist + album + composer + year + track);
//	}
	
}



