package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int a = sc.nextInt();
//		boolean b = (90>a && a >= 80);
//		boolean c = (80>a && a >= 70);
//		boolean d = (70>a && a >= 60);

		if (a >= 90) {
			System.out.print("A등급");
		} else if (a >= 80) {
			// (b)
			// (a >= 80)
			// (90>a && a >= 80)
			System.out.print("B등급");
		} else if (a >= 70) {
			// (c)
			// (a >= 70)
			// (80>a && a >= 70)
			System.out.print("C등급");
		} else if (a >= 60) {
			// (d)
			// (a >= 60)
			// (70>a && a >= 60)
			System.out.print("D등급");
		} else {
			System.out.print("F등급");
		}
		sc.close();
	}

}
