package com.javaex.ex12;

public class Point {
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
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	//일반메소드
//	@Override
//	public String toString() {
//		return "Point [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + "]";
//	}

	
	public void showInfo(){
		System.out.println("x= " + x + " y= " + y );
	}
	
}
