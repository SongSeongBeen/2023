package com.javaex.ex04;

public class Ex07 {
	
	public static void main(String[] args) {

		for (int y=1; y<7; y++) {//세로줄
			
			for (int x=1; x<y; x++) {//가로줄 x<y 만큼 증가시켜라
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

/*
 * String star = "*";
 * 
 * for (int y=1 y<5 y++) {
 * 
 * System.out.println(""); 
 * star = star+1
 * 
 * }
 */