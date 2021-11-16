package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {

		// 논리연산자
		int a = 5;
		int b = 7;

		// 논리연산자 && && 연산자 - 둘다 다 맞아야 맞다해준다.
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		// 논리연산자 응용
		System.out.println(a > b && a < b); // 5>7(false) && 5<7(true) = false
		System.out.println(a > b && a > b); // 5>7(false) && 5>7(false)= false

		// 논리연산자 || --> || 둘중 하나만 맞아야 맞다 해준다.
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		// ||연산자 응용
		System.out.println(a > b || a < b); // 5>7(false) && 5<7(true) = true
		System.out.println(a > b || a > b); // 5>7(false) && 5>7(false)= false

		// 논리연산자 ! --> 반대
		System.out.println(!true); // false
		System.out.println(!false); // true

		System.out.println(!(a > b)); // true
		System.out.println(!(a < b)); // false
	}

}
