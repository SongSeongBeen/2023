package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("당신의월급을 입력하세요: ");
		int money = sc.nextInt();
				
		System.out.println("10년동안 최대 저축액은" + money * 120 +"원 입니다.");
		
		sc.close();
		
	}
}
