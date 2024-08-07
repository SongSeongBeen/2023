package com.javaex.ex02;

public abstract class Bird {

	// 필드
	private String name;
	// 생성자

	public Bird() {

	}

	public Bird(String name) {
		this.name = name;
	}

	// 메소드g/s
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// 일반메소드
	public abstract void showName();// 추상

	protected abstract void fly();

	protected abstract void sing();

}
