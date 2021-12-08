package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {   //***bin*** - ***bout***

	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("C:\\JavaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);   //다른 기능이 더있다. //BufferedInputStream 자동으로 배열 영역을 지정해준다.
		
		OutputStream out = new FileOutputStream("C:\\JavaStudy\\file\\byteimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		while(true) {
			int data = bin.read();  //
			if(data == -1) {
				System.out.println("복사가 완료 되었습니다."+data);
				break;
			} 
			bout.write(data);
		}
		
		bin.close();
		bout.close();

	}
}
