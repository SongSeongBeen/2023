package com.javaex.ex02;

public class Point {
	
//필드	
	private int x, y;  //같은 정수형이라 한번에 정의
	
	public Point() { // 디폴트생성자 없어지면 {
        //Point(2)
	}
	public Point(int x) { //이름도 클래스명 Point고정
		this.x = x;
		   //Point(0)
	}
//생성자
	public Point(int x, int y) { //이름도 클래스명 Point고정
	this.x = x;
	this.y = y;
	   //Point(3)
	}

//메소드
	public void setX(int x) {  //담는다
	this.x=x;    //this 메모리 올렸는일  이름 본인지정
	}
	public int getX() {//내보낸다
		return x;
	}
	public void setY(int y) {
	this.y=y;	    
	}
	public int getY() {//내보낸다
		return y;
	}
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}                        
	
//메소드 이름
	
	//setX()
	//getX()
	
	
	//setY()
	//getY()
	
	
	//draw()
	
	
	
	
}
