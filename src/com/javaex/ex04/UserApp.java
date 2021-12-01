package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {

		Customer[] cArray = new Customer[3];

		Customer c01 = new Customer("jws", "1234", "정우성", 1000);

		Customer c02 = new Customer("yjs", "2345", "이효리", 2000);

		Customer c03 = new Customer("master", "m7788", "운영자", 5000000);

		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;

		for (int i = 0; i < cArray.length; i++) {
			cArray[i].showInfo();
		}

		Employee y01 = new Employee(5000000);
		y01.showInfo();
	}

}
