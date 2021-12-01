package com.javaex.ex01;

public abstract class Shape { //메소드 정의 --> 실제 코드가 작성되면 안됨
	
	protected String fillColor;
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	public abstract void draw();
}


