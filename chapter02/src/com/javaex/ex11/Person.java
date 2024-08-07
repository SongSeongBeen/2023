package com.javaex.ex11;

public class Person {    //Student에게 상속중 부모에게는 아무런 표시 없다
	//필드
	protected String name;
	protected int age;
	
	//생성자
	public Person() {
		System.out.println("person()"); //생략
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("person(2)"); //생략
	}
	
	//메소드g/s
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void showInfo() {
		//this.name 표기 가능 본인 자기 자신   
		//헷갈리게 없을떄 this. 안써도된다.     필드값을 불러와서 출력한다.
		
		//******getname()  this.getname() 메소드를 불러와서 출력******** ex)조건문 반복문 적용시 입력값 직접확인
		System.out.println("==========================");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("==========================");
		System.out.println("==========================");
		System.out.println(" ");
	}

}
