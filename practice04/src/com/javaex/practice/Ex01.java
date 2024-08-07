package com.javaex.practice;

public class Ex01 {
	
	public static void main(String[] args) {

		int[] intArray = new int[] {3,7,12}; /// 방수 6개 0,1,2,3,4,5
//		intArray[0] = 3;
//		intArray[1] = 7;
//		intArray[2] = 12;


		int result = 0;

		for (int i = 0; i <intArray.length; i++) { //i는 0 부터 방 3 7 12   <= 범위를 벗어난다
		   result=result+intArray[i];        //0 = 0+ 3 3
		}                                    //3=3+7   10
		System.out.println(result);          //10=10+12  22
	}

}
