package com.javaaex.practice;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("while문");
		int index = 0;
		while (index < 3) { // 두번
			System.out.println("index=" + index);
			index++;
		}
		// index0
		// index1
		// index2
		System.out.println("for문");
		for (int order = 0; order < 3; order++) { // 두번
			System.out.println("index=" + index);
		}
		// order0
		// order1
		// order2
	}

}
