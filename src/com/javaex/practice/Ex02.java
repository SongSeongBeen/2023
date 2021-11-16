package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// int x =0;

		Scanner sc = new Scanner(System.in);
		System.out.print("0을 입력해주세요: ");
		int x = sc.nextInt();

		if (x == 0) {// 문법 수정 문제
			System.out.println("x는 0이다.");
		} else {
			System.out.println("없는 값입니다.");
		}
		sc.close();
	}
}
