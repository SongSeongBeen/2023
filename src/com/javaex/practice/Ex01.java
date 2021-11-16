package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

//		int age = 15;

		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();

		if (0 < age && age < 18) {// 문법 수정 문제
			System.out.println("청소년입니다.");
		} else {
			System.out.println("성인입니다.");
		}
		sc.close();
	}
}
