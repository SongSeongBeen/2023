package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
        // !!!!!!!!!!!!!!!!!!!!다시 보기!!!!!!!!!!!!!!!!!
		Scanner sc = new Scanner(System.in);
		
		int a=0, b=0, c=0, sum=0;
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int i=1; i<num+1; i++) {
			a = i/5;         ///5의 배수
			b= i-(a*5);
			if(b==0) {   // 걸러서 5의 배수만
				c++;
				sum+=i;    
				
			}
		}
		System.out.println("5의 배수의 개수: " + c);
		System.out.println("5의 배수의 합: " + sum);
		sc.close();
	}

}
