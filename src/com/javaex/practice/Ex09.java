package com.javaex.practice;

public class Ex09 {
	
	public static void main(String[]args) {
		
		for(int y=1; y<=10; y++) { //세로
			
			for(int x=0; x<10; x++) { // 가로
				
				System.out.print(y+x+"\t");
			}
			
			System.out.println("");
		}
	}

}
