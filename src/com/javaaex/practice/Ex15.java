package com.javaaex.practice;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
	                
		for(int i =1; i<=num; i++) {
		
			if(num%i==0) {/// 입력한 수 나누기 1부터 증가하는 수 값은 약수이다
				System.out.println(i);    //// 증가하는 수 약수만 표시
			}
		}
		sc.close();
	}
	
}
