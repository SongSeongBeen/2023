package com.javaex.ex18;

public class Point implements Drawable {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메소드g/s
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	//메소드 일반

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() { //draw 코드 구현
		System.out.println("x=" + x + ", y=" + y + "점을 그렸습니다.");
	}

	
	
	
}
