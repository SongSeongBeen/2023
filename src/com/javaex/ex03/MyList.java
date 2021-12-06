package com.javaex.ex03;

import java.util.Arrays;
//T ---->Point   Circle
public class MyList<T> {   /// T로 묶어서 관리

	// 필드
	private T[] oArray;         //T[]
	private int crtPos;

	// 생성자

	public MyList() {
		this.oArray = (T[])new Object[3]; //       T[]new 배열이라 형변환 하는 형식으로 해줘야 한다.
		this.crtPos = 0;
	}
	// 메소드 gs --- 생략
	// 메소드 일반
	public void add(T o) { //   Object ---> T로         범용으로 쓰는대신 포기
		oArray[crtPos] = o;
		crtPos++;
	}

	public T get(int index) {
		T result = oArray[index];
		return result;
	}

	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}

}
