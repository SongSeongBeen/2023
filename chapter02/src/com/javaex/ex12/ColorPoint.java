package com.javaex.ex12;

public class ColorPoint extends Point {
	//필드
	private String color;
	//생성자
	public ColorPoint(String color) {
		this.color = color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;				
	}
	
	//메소드g/s
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	//일반 메소드
	
	public void showInfo(){
		System.out.println("색상 " + color);
	}
	
	public void showInfo2(){
		System.out.println("x=" + super.getX() + "y=" + super.getY()+ "색상 " + color);
	}

}
