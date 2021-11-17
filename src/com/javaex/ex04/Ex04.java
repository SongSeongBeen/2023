package com.javaex.ex04;

public class Ex04 {
	
	public static void main(String[] args) {

		int sum = 0;
		
		for (int num = 1; num < 11; num++) {
			sum = num + sum;
			System.out.println(num + " 까지의 " + "합은 " + sum);
			
		}
		System.out.println("1부터 10까지의 정수의 합은 " + sum);
	}

}
