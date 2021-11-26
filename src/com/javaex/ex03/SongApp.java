package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {

		Song iu = new Song();
		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이수민");

		iu.showInfo();

		Song bigbang = new Song();
		bigbang.setArtist("BIGBANG");
		bigbang.setTitle("거짓말");
		bigbang.setAlbum("Always");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		bigbang.setComposer("G-DRAGON");

		bigbang.showInfo();

		Song jbj = new Song();
		jbj.setArtist("버스커버스커");
		jbj.setTitle("벚꽃엔딩");
		jbj.setAlbum("버스커버스커1집");
		jbj.setYear(2012);
		jbj.setTrack(4);
		jbj.setComposer("장범준");

		jbj.showInfo();

		//System.out.println(iu.toString()); 내부값 볼수있다.
	}
	
}
