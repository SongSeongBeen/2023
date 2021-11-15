package com.javaex.pracice;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[]args) {
		
//		try (Scanner sc = new Scanner(System.in)) {}
		Scanner sc = new Scanner(System.in);
			System.out.print("화씨: ");
			double f = sc.nextDouble();
			
			System.out.print("화씨: "+ f +"의 섭씨온도는 "+(5.0/9.0)*(f-32));
			
			sc.close();
		}
		
	}


