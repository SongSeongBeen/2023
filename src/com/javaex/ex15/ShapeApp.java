package com.javaex.ex15;

public class ShapeApp {
	
	public static void main(String[] args) { // Shape 하나로 관리
		
		Shape[] sArray = new Shape[3];
		
		
		Shape r01 = new Rectangle("빨강", "빨강", 5, 5);
		//r01.draw();
		
		Shape c01 = new Circle("빨강", "빨강", 15);
		//c01.draw();
		
		Shape t01 = new Triangle("빨강", "빨강", 5, 5);
		//t01.draw();
		
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		for(int i=0; i<sArray.length; i++) {
		sArray[i].draw();
		}
		
		((Circle)c01).getRadius();
		
		
	}
}
