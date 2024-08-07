package com.javaex.ex05;

public class Ex06 {
	
	public static void main(String[] args) {
		
		int[] arrA = new int[] {3,25,15};
		int[] arrB = new int[] {15,4,5,};

			if (arrA.length == arrB.length) { // 배열의 크기가 같니??
			//각 방의 값이 같은가 검사 
				for(int i=0; i<arrA.length; i++) {
					if(arrA[i] != arrB[i]) {
						System.out.println(i+"번째가 다릅니다.");
					}	
				}
				
			}else { // 다르니?
				System.out.println("다르다");
			}
						
	}
	
}
