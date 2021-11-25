package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(3, 6); // 생성자로 할때
		// first.setX(5);
		// first.setY(5);

		p01.draw();

		Point p02 = new Point(); // 생성자로 할때
		// second.setX(10);
		// second.setY(23);
		p02.draw();

		Point p03 = new Point(55, 65); // 생성자로 할때
		p03.draw(true);
		p03.draw(false);
	}

}
