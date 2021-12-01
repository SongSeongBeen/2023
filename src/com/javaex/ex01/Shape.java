package com.javaex.ex01;

public abstract class Shape { //코드만입력
	
	protected String fillColor;
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	public abstract void draw();
}


