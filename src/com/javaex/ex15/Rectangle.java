package com.javaex.ex15;

public class Rectangle extends Shape{
	
	//필드
	//private String linColor; 부모쪽
	//private String fillColor; 부모쪽
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		super();// Shape 기본생성자 디폴트 지워도 된다.
	}
	
	public Rectangle(String lineColor, String fillColor, int width, int height) {
     // super.setLineColor(lineColor); 직접적으로 바로 사용
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
		
	}
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
	//일반메소드

//	@Override
//	public String toString() { //부모쪽에서 안쓸때 이름만 같게 해준다 
//		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor=" + getLineColor()
//				+ ", getFillColor=" + getFillColor() + "]";
//	}
	
	public void draw() {
		System.out.println("선색:" + super.getLineColor() + " 면색:" + super.getFillColor() + " 가로:" + width + " 세로: " + height + " (사각형을 그렸습니다.)" );
	}
	
}
