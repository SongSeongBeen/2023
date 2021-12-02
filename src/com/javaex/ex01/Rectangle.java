package com.javaex.ex01;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
//	public int setWidth() {
//		return width;
//	}
	
//	public void showInfo(){
//		System.out.println("[사각형]#면색:" +super.fillColor+ " "
//				+ " #가로:" + width 
//				+" #세로:" + height + "그렸습니다.");                                                                        
//	}

	@Override
	public void draw() { //추가 세부적인 요구사항
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다."); 
		System.out.println("sr1의 가로는"+ width +"입니다.");
	}
		
}


