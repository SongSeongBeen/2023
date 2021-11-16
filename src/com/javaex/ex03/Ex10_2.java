package com.javaex.ex03;

import java.util.Scanner;

public class Ex10_2 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("1.자바 2.C 3.C++ 4.파이썬");
		System.out.print("과목번호 : ");
		
		int a = sc.nextInt();
		
		if (a==1) {
			System.out.print("R101호 ");
		}
		else if(a==2) {
			System.out.print("R202호 ");
		}
		else if(a==3) {
			System.out.print("R303호 ");
		}
		else if(a==4) {
			System.out.print("R404호 ");
		}
		else {
			System.out.print("상담원에게 문의하세요 ");
		}
		sc.close();
	}
}
