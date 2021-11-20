package com.javaaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args) {
            //!!!!!!다시 보기 !!!!!!!!!!!!!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		
		for(int y=0; y<num; y++) { // 가로줄 반복 세로 갯수
			for(int x=0; x<=y; x++) { 
				System.out.print("*");
			}
			for(int str=0; str<num-y; str++) {   //세로 별찍는 수 한줄 하나씩 뺴나가라 
			System.out.print(" ");
			}
		System.out.println("");
		}
		sc.close();
	}
	
}
