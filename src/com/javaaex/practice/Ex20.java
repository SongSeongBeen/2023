package com.javaaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================");
		System.out.println("  [숫자맞추기게임 시작]");
		System.out.println("=====================");
		
		int random = 20;
		
		while(true) {

				System.out.print(">>");
				int num = sc.nextInt();
				
				if(num>random) {
					System.out.println("더 낮게");
				} else if(num<random){
					System.out.println("더 높게");
				} else if(num==random) {
					System.out.println("맞았습니다.");
					break;
				}
			

			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			String a = sc.next();                   //여기 부분 다시 생각해보기
			System.out.println("=====================");
			System.out.println("  [숫자맞추기게임 종료]");
			System.out.println("=====================");
			sc.close();
			}
	}
}
	


