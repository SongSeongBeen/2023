package com.javaaex.practice;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {// i는 입력한 수 까지만
			sum+=i;//sum=sum+i   //0=0+1
		}                        //1=1+2 ... 3=3+3 
		System.out.println("합계:" + sum);

		sc.close();
	}
}
