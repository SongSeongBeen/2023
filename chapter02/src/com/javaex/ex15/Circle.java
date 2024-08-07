package com.javaex.ex15;

public class Circle extends Shape{
	//필드
	private int radius;
	//생성자
	public Circle() {
		
	}
	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}
	//메소드g/s
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
//	@Override
//	public String toString() {
//		return "Circle [radius=" + radius + ", getLineColor()" + getLineColor() + ", getFillColor()" + getFillColor()
//				+ "]";
//	}
	
	//메소드
	public void draw() {
		System.out.println("면색:"+ super.getLineColor() + " 선색:" + super.getFillColor() + " 반지름:" + radius + " (원을 그렸습니다.)" );
	}

}
