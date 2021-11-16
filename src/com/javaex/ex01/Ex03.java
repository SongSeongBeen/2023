package com.javaex.ex01;

public class Ex03 {
	
	public static void main(String[] args) {
		
		char ch01 = 'A'; //char(문자 ex 1=일 같다) 한글자만 가능하다. 코드값을 저장
		char ch02 = 65;
		/*char ch01 = 65;정수(코드값) 자형 관리되고 있는 표에서 65를 찾아서 A로 표시
		                 문자형
		                        00 01 02 03                
		                     00                
		                     10    A(65)
		                     20
		                     30*/
		
		System.out.println(ch01);
		System.out.println(ch02);

		boolean b01 = true;
		boolean b02 = false;

		System.out.println(b01);
		System.out.println(b02);

		int a = 3;
		int b = 5;
		boolean result = a > b;

		System.out.println(result);

		char st = '안';
		String str = "안녕하세요"; // 여러 글자 가능한데 ""; 표시 한글자를 넣어도 "";

		System.out.println(st);
		System.out.println(str);
	}

}
