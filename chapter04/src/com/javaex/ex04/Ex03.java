package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	
	public static void main(String[] args) {
		//HashSet 을 이용해 로또 자동생성기
		//ramdom
		Set<Integer> iSet = new HashSet<Integer>();
		while(true) { //6개면 탈출
			if(iSet.size() >=6) {
				break;
			}//반복문 가능
			int num = (int)(Math.random()*45)+1;     //int 달아주고 0. 곱하기 최소값+
			System.out.println("생성된 숫자:" + num); //중복체크는 Set를 통해 해결
			iSet.add(num); //주머니 넣어주겠다
			
		}
		for(int no :iSet) {
			System.out.print(" ");
			System.out.print(no);
		}
	}
}

//		Integer i01 = new Integer((int) ((Math.random()*45)))+1;   //중복안된다. 
//		Integer i02 = new Integer((int) ((Math.random()*45)))+1;
//		Integer i03 = new Integer((int) ((Math.random()*45)))+1;
//		Integer i04 = new Integer((int) ((Math.random()*45)))+1;
//		Integer i05 = new Integer((int) ((Math.random()*45)))+1;
//		Integer i06 = new Integer((int) ((Math.random()*45)))+1;
//		
//		Set<Integer> iSet = new HashSet<Integer>();
//		iSet.add(i01);
//		iSet.add(i02);
//		iSet.add(i03);
//		iSet.add(i04); //자동 박싱
//		iSet.add(i05);
//		iSet.add(i06);
//		
//		for(Integer no :iSet) {
//			System.out.print(" ");
//			System.out.print(no.toString());

