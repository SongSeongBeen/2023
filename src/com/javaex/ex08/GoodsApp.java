package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000);  
		System.out.println(camera.toString());
	
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.toString());
		
		Goods computer = new Goods("LG그램", 9000000);
		System.out.println(computer.toString());
	}
	
}
