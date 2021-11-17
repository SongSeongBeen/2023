package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean action = true;

		while (action){//true
			
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			if (num == 0) { //0이면 종료 
				System.out.println("프로그램을 종료합니다.");
				action=false; //break;
			} else if (num %3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");			
			}
			///action으로 변경하여 입력하면 이위치 값이 있냐 없냐에 따라 미묘하게 다르다   
		}
		sc.close();
	}

}
