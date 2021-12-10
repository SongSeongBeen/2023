package com.javaex.ex01;

import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println(" 1.  | 2.  | 3.  | 4. ");
			System.out.println("-------------------------------------");
			
			System.out.print("선택>");
			int input = sc.nextInt(); 
			switch(input) {
			case 1:
				System.out.print("");
			
				break;
			case 2:
				System.out.print("");
				
				break;
			case 3:
				System.out.print("");
		
				break;
			case 4:
				System.out.println("");
				
				break;
			default:
				System.out.println("");
				break;
				}
			sc.close();
		}
	
	}
	
	
}
