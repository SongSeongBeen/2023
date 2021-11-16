package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	
	public static void mian(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		int a = sc.nextInt();
		
		if(a%3==0) {
			System.out.print("A팀입니다.");
		}
		sc.close();
	}

}
