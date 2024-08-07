package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	
	//Integer 숫자가 아니라 빡싱되어 있는 클래스다
	
	public static void main(String[] args) {
		
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		int i04 = 100;
		Integer i05 = new Integer(9);
		Integer i06 = new Integer(13);      //Integer(중복) 안된다
		
		Set<Integer> iSet = new HashSet<Integer>();
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04); //자동 박싱
		iSet.add(i05);
		iSet.add(i06);
//		pList.add(i01);
//		pList.add(i02);
//		pList.add(i03);
		
		iSet.remove(i05); //Integer(실제값) 으로 지울수 있다.
		System.out.println("갯수:" + iSet.size());
		
		for(Integer no :iSet) {
			System.out.println(no.toString());
		}
//		for(Integer no : pList) {
//			System.out.println(no.toString());
//		}
		
		//hashCode() 주소값에 대응
		
		//Point 관리
		Point p01 = new Point(3,13);
		Point p02 = new Point(4,34);
		Point p03 = new Point(3,16);
		Point p04 = new Point(5,55);
		
		Set<Point> pSet = new HashSet<Point>();  
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		//pSet.remove(p02);
		System.out.println(pSet.size());
		System.out.println(pSet.toString());
		for(Point i: pSet) {
			System.out.println(i.getX());
		}
		
	}
	
}
