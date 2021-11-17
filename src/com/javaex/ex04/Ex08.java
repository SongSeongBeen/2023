package com.javaex.ex04;

public class Ex08 {
	
	public static void main(String[] args) {
		
		int i = 0;    //비교할 정수 초기값
		
		while(true) {
			
			i=i+1;//i++
			
			if(i%6==0 && i%14==0) {  //6의 배수 이면서 14의 배수 입니까? yes -->  출력후 반복문 탈출
				System.out.println(i);
				break;
			}
		}
	}

}
