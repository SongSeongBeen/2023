package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자: ");
		int a = sc.nextInt();
		System.out.print("숫자: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.print("큰수" + a + "   작은수: " + b + "입니다.");
		} else if (a < b) {
			System.out.print("큰수" + b + "   작은수: " + a + "입니다.");
		} else {
			System.out.print("큰수" + b + "   작은수: " + a + "입니다.");
		}
		sc.close();
	}

}
