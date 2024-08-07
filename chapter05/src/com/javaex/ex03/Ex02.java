package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException{ //예외처리 
		
		Reader fr = new FileReader("F:\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		while(true) {
			String str = br.readLine();//한줄씩 읽어 온다//줄바꿈 기호는 제외
			if(str==null) {//문자 스트림은 마지막에 null 값이 Ex01.java없다
				break;
			}
			System.out.println(str);
		}
		//기본적으로 문자열을 내보내고 불러올때 UTF-8형식
		
		br.close();
		
	}
}
