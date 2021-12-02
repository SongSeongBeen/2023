package com.javaex.ex03;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}

	public Point(int x, int y) {
		this.x =x;
		this.y= y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) { //Object 밑 모든것 비교
		//Point p =(Point)obj;
		//return(this.x == p.x && this.y == p.y);
		
		Point p =(Point)obj;
		System.out.println("a.x="+this.x);
		System.out.println("a.y="+this.y);
		
		System.out.println("b.x="+p.x);
		System.out.println("b.y="+p.y);
		
		if(this.x == p.x && this.y == p.y) {
			return true;
			//System.out.println(true);
		}else {
			return false;
		//System.out.println(false);
		}

	}
	
}
