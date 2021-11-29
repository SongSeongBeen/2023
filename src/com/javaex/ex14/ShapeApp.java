package com.javaex.ex14;

public class ShapeApp {
	
	public static void main(String[] args) {
		/*
		Shape s01 = new Shape("빨강", "빨강");
		System.out.println(s01.toString());
		*/
		//사각형 배열
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형
		Rectangle r01 = new Rectangle("빨강","빨강", 5, 5);
		//System.out.println(r01.toString()); 생략 자식쪽에 재정의 된 메소드 사용
		
		Rectangle r02 = new Rectangle("파랑","노랑", 9, 4);
		//System.out.println(r01.toString()); 생략
		
		Rectangle r03 = new Rectangle("보라","초록", 7, 15);
		//System.out.println(r01.toString()); 생략
		
		////사각형을 관리할 배열을 만든다 (주소)
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
//		r01.draw();
//		r02.draw();
//		r03.draw();
		
		//원 배열
		Circle[]cArray = new Circle[3];
		//원
		Circle c01 = new Circle("빨강", "노랑", 15);
		Circle c02 = new Circle("파랑", "빨강", 20);
		Circle c03 = new Circle("초록", "파랑", 10);
		
		
		//원 배열 관리(주소)
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		//배열
		Triangle[] tArray = new Triangle[3];
		//삼각형
		Triangle t01 = new Triangle("빨강", "파랑", 20,20);
		Triangle t02 = new Triangle("파랑", "초록", 10,15);
		Triangle t03 = new Triangle("노랑", "파랑", 15,10);
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
	}

}
