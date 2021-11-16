package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자: ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int b = sc.nextInt();

		if (a < b) {// a 가 작을때
			if (b % a == 0) {
				System.out.println(a + " 는(은) " + b + " 의 약수입니다.");
			} else {
				System.out.println(a + " 는(은) " + b + " 의 약수가 아닙니다.");
			}
		} else if (a > b) {// b 가 작을때
			if (a % b == 0) {
				System.out.println(b + " 는(은) " + a + " 의 약수입니다.");
			} else {
				System.out.println(b + " 는(은) " + a + " 의 약수가 아닙니다.");
			}
		}
		sc.close();
	}

}
