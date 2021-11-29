package com.javaex.ex13;

public class Circle {
	//필드
	private String lineColor;
	private String fillColor;
	private int radius;
	
	//생성자
	public Circle() {
	}

	public Circle(String lineColor, String fillColor, int radius) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.radius = radius;
	}

	// 메소드g/s
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	//일반 메소드
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", radius=" + radius + "]";
	}
	
	public void draw() {
		System.out.println("선색:" + lineColor + " 면색:" + fillColor + " 반지름:" + radius + "  원을 그렸습니다.");
	}
	

}
