package com.javaex.ex20;

import java.io.IOException;

public class FilleManager {

	//v필드 - 생략
	
	//생성자
	//public Fillemanager() { 디폴트 생성자
		
	//}
	
	//일반메소드
	public void readFile() throws IOException { //예외 사항
		
		try {
			System.out.println("강제예외상황발생");
			throw new IOException();//파일을 못 읽었을때
		}catch(IOException e){
			System.out.println("파일이 없습니다.");
		}
		
		
	}
}
