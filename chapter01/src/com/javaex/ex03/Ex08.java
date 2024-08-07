package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int a = sc.nextInt();

		if (a > 0) {
			if (a % 2 == 0) {
				System.out.print("짝수");
			} else {
				System.out.print("홀수");
			}
		} else if (a < 0) {
			System.out.print("음수");
		} else {
			System.out.print("0");
		}
		sc.close();
	}
	
}
