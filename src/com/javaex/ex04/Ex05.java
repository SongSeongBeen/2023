package com.javaex.ex04;

public class Ex05 {
	
	public static void main(String[] args) {

		
		for (int dan = 2; dan < 10; dan++) { // 단 전체적인 큰틀 반복 못들어가면 내려가는거 생각
			for (int num = 1; num < 10; num++) {// 세부적인 반복

				int sum = num * dan;

				System.out.println(dan + " * " + num + " = " + sum);
			}
		}
	}

}
