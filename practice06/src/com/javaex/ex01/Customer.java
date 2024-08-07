package com.javaex.ex01;

public class Customer extends Person {
	// 필드
	private int cNo;
	private int point;

	// 생성자
	public Customer() {

	}

	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

	// 메소드g/s
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getcNo() {
		return cNo;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + ", getcNo()=" + getcNo() + ", getPoint()=" + getPoint()
				+ "]";
	}

	// 일반메소드
	public void showInfo() {
		System.out.println("#이름:" + super.getName() + ", #핸드폰:" + getHp() + "#고객번호:" + cNo + ", #포인트점수:" + point);
	}

}
