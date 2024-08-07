package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4, 4);
		p.showInfo();

		ColorPoint cp1 = new ColorPoint("red");
		cp1.showInfo();

		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.showInfo2();

	}

}
