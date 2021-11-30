package com.javaex.ex16;

public class Student extends Person {
	// 필드
	private String scoolName;  
	// 생성자
	public Student() {
		
	}
	public Student(String name, int age, String scoolName) {
		super(name, age);
		this.scoolName = scoolName;
	}
	//메소드g/s
	public void setScoolName(String scoolName) {
		this.scoolName = scoolName;
	}
	public String getScoolName() {
		return scoolName;
	}
	//메소드
	@Override
	public String toString() {
		return "Student [scoolName=" + scoolName + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	public void showInfo() {
		System.out.println("*******************************");
		System.out.println("이름: " + super.getName() + " 나이: " + super.getAge() + " 학교이름: " + scoolName);
		System.out.println("*******************************");
	}
	
}
