package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/// ************
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum = 0;//
		
		if (num % 2 == 0) {// 짝수인가
			for (int i=2; i<=num; i =i+2) {
				sum = sum + i;//
			}
			System.out.println("결과값:" + sum);
		} else {// 홀수인가
			for (int i=1; i<=num; i=i+2) {
				sum = sum + i;
			}
			System.out.println("결과값:" + sum);
		}
		sc.close();
	}
	
}
		
		
		
		
		
		
		
		
//==========================================		
//      생각의 한계		
//		int n=0, en = 0, odd = 0;
//		
//		while(n<num) {
//			n++;
//			if(n%2==0) {
//				en=en+n;   //짝수합 
//				continue;
//	        } else {
//	        	odd=odd+n;
//	        	continue;
//	        }
//		}
//		System.out.println("결과값: " + odd);
//		System.out.println("결과값: " + en);
//		sc.close();



