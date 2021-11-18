package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {      //--
			if(i%2==0 && i%3==0) {      //  |    출력표시가 없으니 6은 제외하고 밑으로 계속 찍어줘라(continue;     
				//break;                //  | 
				continue;               //  |   
			}                           //--
			System.out.println(i);
		}
	}
}
