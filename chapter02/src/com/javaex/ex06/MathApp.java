package com.javaex.ex06;

public class MathApp {
	
	public static void main(String[] args) {
//		
//		Math math = new Math();
//		
//		System.out.println(math.plusint(3, 2));//정수
//		
//		System.out.println(math.plusdouble(3.5, 2.68));//실수
	
		Math math = new Math();               // 원래 위처럼 자료형 다 정리해줘야함.
		System.out.println(math.plus(3, 2));  //plus로 해주면 알아서 자료형 처리해준다.
		System.out.println(math.plus(34.2, 27.4));
	
	}

}
