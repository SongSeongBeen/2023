package com.javaex.ex11;

public class PersonApp {  

	// 필드
	// 생성자
	// 메소드g/s
	// 일반메소드

	public static void main(String[] args) {
		
		/*
		Person p01 = new Person("정우성", 45);

		Person p02 = new Person();
		p02.setName("이정재");
		p02.setAge(46);

//		 System.out.println(p01.toString());
//		 System.out.println(p02.toString());
//		
		p01.showInfo();
		p02.showInfo();
		
		Student s01 = new Student();
		s01.setSchoolName("서울고등학교");
		
		System.out.println(s01.toString());
		*/
		Person p01 = new Person("정우성", 45);
		p01.showInfo();
		
		Student s01 = new Student();
		s01.setName("강호동");
		s01.setAge(55);
		s01.setSchoolName("서울고등학교");
		
		System.out.println(s01.getName());
		System.out.println(s01.getAge());
		System.out.println(s01.getSchoolName());
	
		Student s02 = new Student("서장훈", 55, "아형고등학교");
		System.out.println(s02.getName());
		s02.showInfo();
		s02.showInfo2();
//		Student s02 = new Student("강남고등학교");
		
		
	}
	
}
