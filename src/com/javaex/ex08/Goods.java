package com.javaex.ex08;

public class Goods {
	// 필드
	private String name;
	private int price;
	private  static int totalCount; //static 공통으로 증감 적용 ++

	// 생성자
	public Goods() {  //생성자 static 사용 경고 (기능으로 쓴다)
		this.totalCount++;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.totalCount++;
	}

	// 메소드g/s
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	// 일반 메소드
//	public void showinfo() { //마지막 출력용
//		System.out.println(name+price+totalCount);
//	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}

}
