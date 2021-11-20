package com.javaaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int y=0; y<num; y++) { // 가로줄 반복 세로
	
			for(int x=0; x<num-y; x++) {   //가로 별찍는 수 한줄 하나씩 뺴나가라 
			            //이부분 다시 이해
			System.out.print("*");
			}
		System.out.println("");
		}
		sc.close();
	}

}
