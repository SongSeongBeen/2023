package com.javaex.ex01;

public class PointApp {
	
	public static void main(String[] args) {
	
	//생성자
	//Object 클래스
	Object obj= new Object();
	System.out.println(obj.getClass()); // 클래스저정
	System.out.println(obj.hashCode()); //주소값에 중복되지 않는 임의의 숫자를 생성해 준다
	System.out.println(obj.toString()); //객체의 정보를 문자열로 리턴
	System.out.println(obj.equals(obj)); //객체가 같은지 비교 vs (== 주소가 같은지)
	
	
	Object obj2= new Object();
	Object obj3= new Object();
	Object obj4= new Object();
	System.out.println(obj2.hashCode()); //주소값에 중복되지 않는 숫자 알려준다
	System.out.println(obj3.hashCode()); //주소값에 중복되지 않는 숫자 알려준다
	//메소드g/s
	
	//일반메소드
	}
}
