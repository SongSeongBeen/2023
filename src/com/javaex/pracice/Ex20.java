package com.javaex.pracice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: " );
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("100원 개수: " );
		int b = sc.nextInt();
		sc.nextLine();
		System.out.print("50원  개수: " );
		int c= sc.nextInt();
		sc.nextLine();
		System.out.print("10원  개수: " );
		int d= sc.nextInt();
		sc.nextLine();
		
		int a2= 500;
		int b2= 100;
		int c2= 50;
		int d2= 10;
		int abcd = (a2*a)+(b2*b)+(c2*c)+(d2*d);
		
		System.out.print("동전의 총합은 " + abcd + " 원 입니다.");
		
		
		
		sc.close();
		
	}

}
