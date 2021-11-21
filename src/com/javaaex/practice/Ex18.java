package com.javaaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	 public static void main(String[] args) {
	        int line;
	        Scanner sc = new Scanner(System.in);
	        //!!!! 시간 날때마다 다시 해보기
	        System.out.print("숫자를 입력하세요 :");
	        line = sc.nextInt();
	            
	        for(int i=line, add=0; i>0; i--, add++) {
	            for(int j=0; j<=i-1; j++) {
	                System.out.print("*");
	            }
	            for(int j=0; j<line/2 - (i-1)+add; j++) {
	                System.out.print(" ");
	            }
	            System.out.println("");
	        }
	        for(int i=0; i<line-1; i++) {   ///////마지막 라인 출력 시키지 않는다?
	            for(int j=0; j<=i+1; j++) {   ////시작하는 라인이 같아야 가운데 공간이 안생긴다 
	                System.out.print("*");
	            }
	               System.out.println();
	        }
	        sc.close();
	    }
}


