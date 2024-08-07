package com.javaex.ex01;

import java.util.Arrays; 

public class PointList {
	
	//필드
	private Point[]pArray; //
	private int crtPos;
	//생성자
	public PointList() {			//직접 셋팅
		this.pArray = new Point[3];
		this.crtPos = 0;
	}
//	public PointList(Point[] pArray, int crtPos) { // 자동으로 생성할시 원하는곳에 안들어가 직접 설정해야됨 
												   //만들어주지 않는다
//		this.pArray = pArray;
//		this.crtPos = crtPos;
//	}

	//메소드gs
	//내부에서만 관리할수있게 만들지 않는다.
	
	//메소드일반
	public void add(Point p) {   //배열에 지정한crtPos 증가값 설정
		pArray[crtPos] = p;  
		crtPos++;
	}
	
	public Point get(int index) {
		return pArray[index];
//		Point result = pArray[index];
//		return result;
	}
	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
}
