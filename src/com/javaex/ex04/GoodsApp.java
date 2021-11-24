package com.javaex.ex04;

public class GoodsApp {

	// 필드

	// 생성자
	// 메소드g/s

	// 일반메소드
	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000); // 생성자로 생성한거 한번에 (표기)
		System.out.println(camera.toString()); // toString
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.toString());
	}

}
