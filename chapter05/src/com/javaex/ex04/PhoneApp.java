package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("F:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			
			String[] dataArray = line.split(",");
			
			String name = dataArray[0];
			String hp = dataArray[1];
			String company = dataArray[2];
			
			System.out.println("이름: " + name + "\n" + "핸드폰: " + hp + "\n" + "회사: " + company  + "\n");
		}
		br.close();	
	}
}
