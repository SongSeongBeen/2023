package com.javaex.ex02;

public class Goods {
	
	//필드
	private String name;
	private int price;
	//생성자
	
	public Goods() { //쓰지않으면 없어진다 
		
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드 g/s	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	//일반 메소드
	public void showInfo() {
		System.out.println("상품명: " + name + ", 가격: " + price);
	}

	
	
}




