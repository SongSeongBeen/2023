package com.javaex.ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[]args) throws IOException { // 예외 처리 던진다
		
		Writer fw = new FileWriter("F:\\javaStudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		//줄바꿈 기호 운영체제 별로 판단하기
		bw.write("학교종이 땡땡땡");   
		bw.newLine();
		bw.write("어서 모이자");
		bw.newLine();
		bw.write("선생님이 우리를 기다리신다");
		bw.newLine();
		
		bw.close();
	}
}
