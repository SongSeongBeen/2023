package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int age;

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.println("나이: ");
		age = sc.nextInt();

		if (age > 20) { // 21살 이상 1번그룹 21살 100살
			System.out.println("\"1번그룹\"");
		} else {// 20살이하 2번그룹 15살 19살 20살
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");

		sc.close();
	}

}
