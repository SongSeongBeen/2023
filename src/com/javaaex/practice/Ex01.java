package com.javaaex.practice;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("while문");
		int index = 0;
		while (index < 3) { // 0부터 2까지
			System.out.println("index=" + index);
			index++;
		}
		// index0
		// index1
		// index2
		System.out.println("for문");
		for (int order = 0; order < 3; order++) { // 0부터 2까지
			System.out.println("index=" + index);
		}
		// order0
		// order1
		// order2
	}

}
