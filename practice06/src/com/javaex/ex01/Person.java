package com.javaex.ex01;

public class Person {
	// 필드
	private String name;
	private String hp;

	// 생성자
	public Person() {// 디폴트생성자
	}

	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}

	// 메소드g/s
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getHp() {
		return hp;
	}

	// 일반메소드
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", getName()=" + getName() + ", getHp()=" + getHp() + "]";
	}

	public void showInfo() {
		System.out.println("#이름:" + name + ", #핸드폰:" + hp);
	}

}
