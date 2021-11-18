package com.javaaex.practice;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
			for(int y=1; y<=num; y++ ) {// 세로
				
				for(int x=0; x<y; x++ ) {// 가로 x를 y만큼 증가 시켜라
					System.out.print(y);
				}
				System.out.println("");
			}
		sc.close();	
	}

}
