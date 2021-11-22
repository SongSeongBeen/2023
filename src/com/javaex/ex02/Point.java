package com.javaex.ex02;

public class Point {
	
//필드	
	private int X, Y;  //같은 정수형이라 한번에 정의

//메소드
	public void setX(int x) {  //담는다
	X=x;
	}
	public int getX() {//내보낸다
		return X;
	}
	public void setY(int y) {
	Y=y;	
	}
	public int getY() {//내보낸다
		return Y;
	}
	public void draw() {
		System.out.println("점[x="+X+", y="+Y+"]을 그렸습니다.");
	}                        
	
//메소드 이름
	
	//setX()
	//getX()
	
	
	//setY()
	//getY()
	
	
	//draw()
	
	
	
	
}
