package com.javaex.ex02;

public class Triangle extends Shape {
	// 필드
	private int width;
	private int height;

	public Triangle() {
		System.out.println("생성자  Triange(0) 실행");
	}

	public Triangle(int width, int height) {
		super("검정", "검정");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triange(2) 실행");
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super("fillColor", "lineColor");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triange(4) 실행");
	}

	// 메소드g/s
	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	// 일반메소드
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

}

