package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {

	public static void main(String[] args) {

		double result;
		int num;

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try { //오류 사항 예외처리 문법
			result = 100 / num;
			System.out.println(result);
		}catch(ArithmeticException e) { //예외상황일때 처리할 로직
			System.out.println(e.toString());  //toString 한줄 나타내준다.
		}finally {
			System.out.println("finally영역");
		}

		sc.close();
	}

}
