package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member jws = new Member("jws", "정우성", 50000);
		jws.showinfo();
		
		Member yjs = new Member("yjs", "유재석", 50000);
		yjs.showinfo();
		
		Member lhr = new Member("lhr", "이효리", 50000);
		lhr.showinfo();
	}

}
