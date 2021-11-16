package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");

		double a = sc.nextDouble();

		double b = 0.09 * a; // 0원이상 1000만원 이하인 경우
		double c = 1000 * 0.09 + 0.18 * (a - 1000); // 1000만원 초과 4000만원 이하인 경우
		double d = 1000 * 0.09 + 3000 * 0.18 + 0.27 * (a - 4000); // 4000만원 초과 8000만원 미만인 경우
		double e = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (a - 8000); // 8000만원 이상인 경우

		if (a >= 0 && a <= 1000) {
			System.out.println("소득세는 " + b + " 입니다.");
		} else if (a > 1000 && a <= 4000) {
			System.out.println("소득세는 " + c + " 입니다.");
		} else if (a > 4000 && a <= 8000) {
			System.out.println("소득세는 " + d + " 입니다.");
		} else if (a >= 8000) {
			System.out.println("소득세는 " + e + " 입니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		sc.close();
	}

}


