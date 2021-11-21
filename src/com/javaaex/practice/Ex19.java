package com.javaaex.practice;

import java.util.Scanner;

public class Ex19 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int money = 0;
		
		while(flag) {
			System.out.println("-------------------------------------");
			System.out.println(" 1. 예금  | 2. 출금 | 3. 잔고 | 4. 종료 ");
			System.out.println("-------------------------------------");
			
			System.out.print("선택>");
			int input = Integer.parseInt(sc.nextLine()); // 라인으로 받아들여서 int로 변환 
			switch(input) {
			case 1:
				System.out.print("예금>");
				money += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.print("출금액>");
				money -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.print("잔고액>");
				System.out.println(money);
				break;
			case 4:
				System.out.println("프로그램종료");
				flag = false;
				break;
			default:
				System.out.println("다시입력해주세요");
				break;
				}
			
		}
		sc.close();
	}
}


