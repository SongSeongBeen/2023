package com.javaex.ex18;

public class ShapeApp {
	
	public static void main(String[] args) { // Shape 하나로 관리
		
//		Point p01 = new Point(5,5);
//		p01.draw();
//		
//		Point p02 = new Point(114, 117);
//		p02.draw();
//		((Point)p02).getX(); // 형변환  다운캐스팅 해서 사용
		
//		Drawable r01 = new Rectangle("빨강","빨강",5,7);
//		r01.draw();
		
		//배열
		Drawable[] dArray = new Drawable[4];
		//값
		Drawable p01 = new Point(1,1); //점 찍는걸 추가 하기 위해서 implements Drawable 사용
		Drawable c01 = new Rectangle("빨강","빨강",5, 7);
		Drawable t01 = new Rectangle("빨강","빨강",155, 7);
		Drawable r01 = new Rectangle("빨강","빨강",6, 7);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		for(int i=0; i<dArray.length; i++) { //instanceof 연산자 사용 
			if(dArray[i] instanceof Shape) { //지금주소의 인스턴스 Shape틀에서 만어졌나?
				System.out.println(((Shape)dArray[i]).area());				
			}else {
				
			}
		}
	}
	
}
