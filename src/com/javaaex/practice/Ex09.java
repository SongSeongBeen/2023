package com.javaaex.practice;

public class Ex09 {
	
	public static void main(String[]args) {
		
		int num = 1;
		
		for(int y=0; y<10; y++) { //세로
			
			for(int x=1; x<=10; x++) { // 가로
				y=y+1;
				System.out.print(y+"\t");
			}
			System.out.print("");
		}
	}

}
