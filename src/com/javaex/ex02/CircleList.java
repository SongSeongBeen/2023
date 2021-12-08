package com.javaex.ex02;

import java.util.Arrays;

public class CircleList {
	
	//필드
	private Circle[] cArray; // 배열
	private int crtPos;
	
	//생성자 --- 직접 입력
	public CircleList() {
		this.cArray = new Circle[3];
		this.crtPos = 0;
	}
	
	//메소드gs --- 생략
	
	//메소드일반 ---세부사항 설정
	//배열에 crtPos 증가값 설정
	public void add(Circle c) {
		cArray[crtPos] = c;    //주가 들어오면 배열의 마지막에 Point를 넣는다.
		//배열에 0,1,2 = crtPos 변경?? 묶어서 증가값 설정위해서
		crtPos++;
	}
	public Circle get(int index) { //방의주소 리턴 값 설정
		return cArray[index];
	}
	public int size() { //관리되고 있는 포인트개수를 리턴
		return crtPos;
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
		
}
