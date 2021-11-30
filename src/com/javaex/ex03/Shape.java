package com.javaex.ex03;

public class Shape {
	
	// 필드
	private String fillColor;
	private String lineColor;

	// 생성자
	public Shape() {

	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// 메소드 g/s
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	// 일반메소드
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	public void showInfo() {
		System.out.println(fillColor + lineColor);
	}

}
