package com.javaex.ex02;

public class Shape {

	// 필드
	private String fillColor;
	private String lineColor;

	// 생성자
	public Shape() {
		System.out.println("생성자 노멛(0 실행)");
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(2) 실행");
	}

	// 메소드g/s
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

}
