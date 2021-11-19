package com.javaaex.practice;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("숫자를 입력하세요");
		
		int max = 0;
		
		for(int i=1; i<=5; i++) {  //5번 반복 시켜라
		
			System.out.print("숫자: ");
			int num = sc.nextInt();      
			
				if(max < num) {                        //5번 받고 그중 맥스값 출력 
					max=num;                           
			}
		}
		System.out.print("최대값은"+max+"입니다");
		sc.close();
	}

}
