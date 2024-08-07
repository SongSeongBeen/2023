package com.javaex.ex05;

public class Ex04 {
	
	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;	
		arrA[2] = 9;
		
		int[] arrB = arrA;
		
		arrB[1] = 10000;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
//		
//		
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		
/*	int num = 7;
		int num2 = num;
		
		num = 8;
		int num2 = num;
		
		int[]inArray = new int[2];
	    intArray[0] = 3;
		intArray[1] = 7;
		
		int[]intArray2 = intArray;     // 주소만 복사
		
		intArray[0] = 100;
		println(intArray[0]);    //100
	    println(intArray2[0]);   //100
*/		
	}

}
