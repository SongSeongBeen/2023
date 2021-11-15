package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");

		int a = sc.nextInt();

		if (a % 3 == 0) {
			System.out.print(a + "는(은) 3의 배수 입니다.");
		}
		else {
			System.out.print(a + "는(은) 3의 배수가 아닙니다.");
		}
		sc.close();
	}
}
