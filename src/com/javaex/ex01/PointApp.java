package com.javaex.ex01;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(5, 7);
		Point p02 = new Point(10, 15);

//		System.out.println(p01.toString()); 테스트
		
		PointList pList = new PointList();
		
		pList.add(p01);
		pList.add(p02);
		System.out.println(pList.get(0).toString());
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(1).toString());
		System.out.println(pList.get(1).getY());
		
		System.out.println(pList.size());
		
		Point p03 = new Point(155,90);
		pList.add(p03);
		System.out.println(pList.get(2).getX());
		System.out.println(pList.get(2).toString());
	}
	
}
