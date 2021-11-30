package com.javaex.ex04;

public class Employee extends User{

	// 필드
	private int salary;

	// 생성자
	public Employee(int salary) {
		super();
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	// 메소드
	public void showInfo() {
		System.out.println("운영자의 월급은 " + salary + "원 입니다.");
	}

}
