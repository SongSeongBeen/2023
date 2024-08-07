package com.javaex.ex03;

public class MyListApp {
	
	public static void main(String[] args) {
		
		//도형생성
		Point p01 = new Point(4,7);
		Point p02 = new Point(4,7);
		Circle c01 = new Circle(5);
		
		//포인트관리
		MyList<Point> pList = new MyList<Point>();  //<point>만 관리
		pList.add(p01);
		pList.add(p02);
		System.out.println(pList.toString());
		
		//원관리
		MyList<Circle> cList = new MyList<Circle>(); //<Circle>만 관리
		cList.add(c01);
		//cList.add(p01); 다른 클래스는 들어 오지 못하게 한다.
		System.out.println((cList.get(0)).getRadius());
		//System.out.println(cList.toString());
		
	}

}
