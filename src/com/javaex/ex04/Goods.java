package com.javaex.ex04;

public class Goods {
	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() { // 메모리 올려라
		System.out.println("public Goods");
	}

	public Goods(String name, int price) { // 메모리 올려라 둘다쓸꺼
		this.name = name;
		this.price = price;
		System.out.println("public Goods(String name, int price)");
	}

	// 메소드 g/s
	public String getName() { // getName N대문자
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 메소드 일반
    //public void showinfo() {   // 출력용
	
	@Override
	public String toString() { // 입력내용 확인용 출력
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
