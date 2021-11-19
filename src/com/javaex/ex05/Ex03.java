package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
//		int[] intArray = new int[5];
		int[] intArray = new int[] {3,7,13} ;   //생성과 동시에 초기화 길이정보 생략가능 [] 숫자 생략
		
		intArray[0] = 3;
		intArray[1] = 13;
		intArray[2] = 7;
		
		System.out.println(intArray[2]);
		
		for(int i =0; i<3; i++) {        //규칙이 있으면 반복문으로 가능 방번호는 0부터시작
			System.out.println(intArray[i]);
		}
		
		char[] charArray = new char[3];
		
		charArray[0] = 'A';
		charArray[1] = '한';
		charArray[2] = 'z';
				
		System.out.println(charArray[1]);
		
		for(int i =0; i<charArray.length; i++) {        //.length 변경된 값만큼 세팅
			System.out.println(intArray[i]);            //i<=charArray = 범위를 벗어난다 
				                                        // int a = 값 없을시 0 으로 기본 세팅 
			
		}
	}
	
}
