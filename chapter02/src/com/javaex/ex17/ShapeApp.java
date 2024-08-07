package com.javaex.ex17;

public class ShapeApp {
	
	public static void main(String[] args) { // Shape 하나로 관리
		
//		Rectangle r01 = new Rectangle("빨강", "빨강", 5, 10);
//		System.out.println(r01.area());
//		
//		Circle c01 = new Circle("빨강","파랑", 5);
//		System.out.println(c01.area());
//		
//		Triangle t01 = new Triangle("파랑","노랑", 5,10);
//		System.out.println(t01.area());
		
		Shape[] sArray = new Shape[3];
		
		Shape r01 = new Rectangle("빨강", "빨강", 5, 10);
		//System.out.println(r01.area());
		
		Shape c01 = new Circle("노랑","파랑",5);
		//System.out.println(c01.area());
		
		Shape t01 = new Triangle("노랑","파랑", 10,5);
		//System.out.println(t01.area());
		
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
//		Shape s00 = new Shape("빨강",)
		
	}
	
}
