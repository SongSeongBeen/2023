package com.javaex.practice;

public class Ex05 {
	
	public static void main(String[] args) {
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {//5까지하라
				flag = false;
			}
			System.out.println(i);
			i=i+1; 
		}
	}

}

//1=1+1    1
//2=2+1    2
//3=3+1    3
//4=4+1    4
//5=5+1    5