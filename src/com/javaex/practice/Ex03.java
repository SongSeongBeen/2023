package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x, y;
		for(y=0; y<4; y++) { // 0포함 3까지 증가 세로    0 1 2 3 번        
			for(x=2; x>=0; x--) { //2부터 0포함 감소 가로 감소가 안된다?     2 1 0 ***
				System.out.print("*");
			}
			System.out.println("");
		}
		//***
		//***
		//***
		//***	
	}

}
