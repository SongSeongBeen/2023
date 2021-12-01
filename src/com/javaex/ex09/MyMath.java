package com.javaex.ex09;

public class MyMath {
	
	//필드
	private static double pi = 3.14;
	
	//생성자
	
	//메소드 g/s
	
	//일반 메소드
	public static int plus(int a, int b) {   //static 안올리면 new 로 올려줘야함
		return a+b;
	}
	public static double plus(double a, double b) {
		return a+b;
	}
	public static double plus(double a, int b) {
//		double sum = a+b; //3.5 + 3.0 자동형변환 자료형 바뀜
		return a+b;
	}
	public static double plus(int a, double b) {
//			double sum = a+b; //3.5 + 3.0 자동형변환 자료형 바뀜
		return a+b;
	}
	
	public static double circleArea(int radius) {
	
		return radius*radius*pi;
	}
	public static double circleRound(int radius) {
		return (radius*radius)*pi;
	}
	
}


	


