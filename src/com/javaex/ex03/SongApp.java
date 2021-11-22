package com.javaex.ex03;

public class SongApp {
	
	public static void main(String[] args) {
		
		Song IU = new Song();
		IU.setArtist("아이유");
		IU.setTitle("좋은날");
		IU.setAlbum("real");
		IU.setYear(2010);
		IU.setTrack(3);
		IU.setComposer("이수민");
		
		IU.showinfo();
		
		Song BIGBANG = new Song();
		BIGBANG.setArtist("BIGBANG");
		BIGBANG.setTitle("거짓말");
		BIGBANG.setAlbum("Always");
		BIGBANG.setYear(2007);
		BIGBANG.setTrack(2);
		BIGBANG.setComposer("G-DRAGON");
		
		BIGBANG.showinfo();
		
		Song JBJ = new Song();
		JBJ.setArtist("버스커버스커");
		JBJ.setTitle("벚꽃엔딩");
		JBJ.setAlbum("버스커버스커1집");
		JBJ.setYear(2012);
		JBJ.setTrack(4);
		JBJ.setComposer("장범준");
		
		JBJ.showinfo();
	}
	
}
