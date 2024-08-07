package com.javaex.ex18;

public abstract class Shape {
	
	//필드
	private String lineColor;
	private String fillColor;
	
	//생성자
	public Shape() {
	}
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
	//메소드g/s
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

	//일반메소드
//	@Override
//	public String toString() {
//		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
//	}
//	public void draw() { ********Drawable 구현하여 부모쪽 필요없다 ****
//		System.out.println("선색: " + getLineColor() + "면색 : " + fillColor + " 도형을 그렸습니다.");
//	}
	
//	public double area() { //area 만들지못함
//		double result = 0.0;   //형태를 위해서 억지로 맞춰줌
//		return result;
//	}
	
	public abstract double area(); //추상 메소드 제목만 있는상태 쓸려면 자식에게 값입력해주기
	//오버라이드 됐을때 완성이 된다
		
}
