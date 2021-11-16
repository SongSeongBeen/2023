package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("근무시간: ");
		int time = sc.nextInt();

		int undermoney = time * 10000;
		double overmoney = (8 * 10000) + ((time - 8) * 10000 * 1.5);

		if (time <= 8) {
			System.out.print("임금은 " + undermoney + "원 입니다.");
		} else if (time > 8) {
			System.out.print("임금은 " + (int) overmoney + "원 입니다.");
		}
		sc.close();
	}
	
}
