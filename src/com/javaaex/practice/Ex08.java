package com.javaaex.practice;

public class Ex08 {
	
	public static void main(String[] args) {
		
		for(int dan=2; dan<=9; dan++) { //세로
			for(int num=1; num<=9; num++) { //가로 
				System.out.print(dan+"*"+num+"="+dan*num+"\t");
			}
			System.out.println("");
		}
	}

}
