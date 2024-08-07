package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호1: ");
		String a = sc.next(); // 기호도 입력 가능

		System.out.print("숫자1: ");
		double b = sc.nextDouble();
		System.out.print("숫자2: ");
		double c = sc.nextDouble();

		switch (a) {
		case "+": // "" 표기 하기
			System.out.print("결과는: " + (b + c)); // 특별한 명령어 없이 연산 가능
			break;
		case "-":
			System.out.print("결과는: " + (b - c));
			break;
		case "*":
			System.out.print("결과는: " + (b * c));
			break;
		case "/":
			if (c == 0) {
				System.out.print("계산할 수 없습니다.");
			} else {
				System.out.print("결과는: " + (b / c));
			}
			break;
		default:
			System.out.print("계산할 수 없는 기호입니다.");
			break;
		}
		sc.close();
	}

}
//if로 작성
/*if (a.equals("+")) { //equals 배우지 않은것 == 왜 안되지?
	System.out.println("결과는 " + (b + c));
} else if (a.equals ("-")) {
	System.out.println("결과는 " + (b - c));
} else if (a.equals ("*")) {
	System.out.println("결과는 " + (b * c));
} else if (a.equals ("/")) {
	System.out.println("결과는 " + (b / c));
	if (c == 0) {
		System.out.println("계산할 수 없습니다.");
	} else {
		System.out.println("(b/c)");
	}
}*/

