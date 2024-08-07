package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("근무시간: ");
		int time = sc.nextInt();

		int undermoney = time * 10000;
		int overmoney = (8 * 10000) + ((time - 8) * 12000);

		if (time <= 8) {
			System.out.print("임금은 " + undermoney + " 입니다.");
		} else if (time > 8) {
			System.out.print("임금은 " + overmoney + " 입니다.");
		}
		sc.close();
	}

}
