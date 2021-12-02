package com.javaex.ex02;

public class Sparrow extends Bird {

//	// 필드
//	private String sing;
//	private String fly;
//
//	// 생성자
//	public Sparrow() {
//
//	}
//
//	public Sparrow(String name, String sing, String fly) {
//		super(name);
//		this.sing = sing;
//		this.fly = fly;
//	}
//
//	// 메소드g/s
//	public void setSing(String sing) {
//		this.sing = sing;
//	}
//
//	public String getSing() {
//		return sing;
//	}
//
//	public void setFly(String fly) {
//		this.fly = fly;
//	}
//
//	public String getFly() {
//		return fly;
//	}

	public void showName() {
		System.out.println("참새의 이름은 " + super.getName() + "입니다.");
	}

	public void fly() {
		System.out.println("참새(" + super.getName() + ")가 날아 다닙니다.");
	}

	public void sing() {
		System.out.println("참새(" + super.getName() + ")가 소리내어 웁니다.");
	}

}
