package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] sArray = new Shape[3];
		
		//Shape s = new Shape("빨강"); // abstractd class
		Circle c1 = new Circle("녹색", 10);
		Rectangle r1 = new Rectangle("빨강", 4, 4);
		Rectangle sr1 = new Rectangle("빨강", 12, 10);
			
		sArray[0] = c1;
		sArray[1] = r1;
		sArray[2] = sr1;
		
		for(int i=2; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//sr1을 그리는 메소드 호출
		//((Ractangle)sr1).draw();
		//sr1의 가로크기 출력
		//System.out.println("sr1의 가로는 "+((Rectangle)sr1.setWidth()+" 입니다.");
	}
}

	
	