package com.javaex.ex04;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드gs

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return x * y;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		Point p = ((Point) obj);
		if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}

	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Point p = ((Point) obj);
//		if (this. == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Point other = (Point) obj;
//		return x == other.x && y == other.y;
//		
//	}

	
		
	
	
}
