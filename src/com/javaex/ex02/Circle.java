package com.javaex.ex02;

public class Circle {
	
	//필드
	private int radius;

	//생성자  
	public Circle() { 
		
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	
	//메소드gs
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	//메소드일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
