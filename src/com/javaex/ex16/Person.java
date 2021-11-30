package com.javaex.ex16;

public class Person {
	//필드
	private String name;
	private int age;

	// 생성자
	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}
	//메소드 g/s
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	//일반메소드
	public void showInfo() {
		System.out.println("*******************************");
		System.out.println("이름: " + name + " 나이: " + age);
		System.out.println("*******************************");
	}
	
	
}
