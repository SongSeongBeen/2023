package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		double ml = sc.nextDouble();
//		double km = 1.609;
		
		System.out.println(ml + "마일은 " + ml * 1.609 + "킬로미터 입니다.");

		sc.close();
	}

}