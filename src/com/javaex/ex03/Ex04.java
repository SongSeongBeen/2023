package com.javaex.ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex04 {

	public static void main(String[]args) throws IOException { // 예외 처리 던진다
		
		Writer fw = new FileWriter("F:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		//줄바꿈 기호 운영체제 별로 판단하기
		bw.write("이정재,");   
		bw.write("010-2222-2222,");  
		bw.write("02-4332-9090"); 
		bw.newLine();
		bw.write("정우성,");
		bw.write("011-0000-23451,");
		bw.write("02-6552-2341");
		bw.newLine();
		bw.write("유재석,");
		bw.write("010-5555-5555,");
		bw.write("02-7552-9994");
		bw.newLine();
		bw.write("이효리,");
		bw.write("011-9999-7777,");
		bw.write("02-900-9888");
		bw.newLine();
		bw.write("송성빈,");
		bw.write("010-3333-5151,");
		bw.write("비트");
		
		bw.close();
	}
}
