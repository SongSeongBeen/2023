package com.javaex.ex19;

public class ArrayExcepiton {
	
	public static void main(String[] args) {
		
		int[] intArray = new int[] {3,6,9};
		
		try {
			System.out.println(intArray[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch(ArithmeticException e) {
		} finally {
			System.out.println();
		}
	}
}


