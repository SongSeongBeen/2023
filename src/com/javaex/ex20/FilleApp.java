package com.javaex.ex20;

import java.io.IOException;

public class FilleApp {

	public static void main(String[] args) {
		
		
		FilleManager fr = new FilleManager();
		
		try {  //예외사항 처리
			fr.readFile();
		}catch(IOException e){
			System.out.println("error");
		}
	}

}
