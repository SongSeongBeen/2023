package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		int a = sc.nextInt();

		if (a % 3 == 0) {// 나머지가 0 일때 - A팀
			System.out.print("A팀입니다.");
		} else if (a % 3 == 1) {// 나머지가 1 일때 - B팀
			System.out.print("B팀입니다.");
		} else if (a % 3 == 2) {// 나머지가 2 일때 - C팀
			System.out.print("C팀입니다.");
		} else {// 그외
			System.out.print("잘못입력하셨습니다.");
		}
		sc.close();
	}

}
