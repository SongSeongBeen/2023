package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
	                                            
		int sum = 0;
	
		for (int i = 1; i <= num; i++) {// i는 입력한 수 까지만 반복
			sum+=i;
			System.out.print(i);    //마지막에 붙은 +.....
			if(i<num) {             // i는 입력한 수보다 작다
				System.out.print("+");   //+계속 반복 입력한 수 전까지
			}
		}
		System.out.println("");
		System.out.println("합계: "+sum);
	
		sc.close();
	}
	
}
