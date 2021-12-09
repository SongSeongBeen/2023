package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg"); //생성자에 파일위치를 써야한다.
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
			 
		byte[] buff = new byte[1234]; //byte로 정해줌
		while(true) {
			
			int data = in.read(buff);
			
			if(data == -1) {
				System.out.println("복사가 완료되었습니다." + data);
				
				
				break;
			}
			out.write(buff);
		}
		
		
		
//		System.out.println("복사시작");
//		while(true) {
//			int data = in.read();
//			
//			if(data == -1) {
//				System.out.println("복사가 완료 되었습니다." + data);
//				break;
//			}
//			out.write(data);
//		}
		in.close();
		out.close();
	}
}
