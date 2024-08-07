package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int a = sc.nextInt();
		System.out.print("숫자2: ");
		int b = sc.nextInt();
		System.out.print("숫자3: ");
		int c = sc.nextInt();

		if (a < b && a < c) {// a가 b,c보다 작다
			System.out.print("가장작은수는 " + a + " 입니다.");
		} else if (b < a && b < c) {//b가 a,c보다 작다
			System.out.print("가장작은수는 " + b + " 입니다.");
		} else if (c < a && c < b) {//c가 a,b보다 작다
			System.out.print("가장작은수는 " + c + " 입니다.");
		} 
		sc.close();
	}

}
