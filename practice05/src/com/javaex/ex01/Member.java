package com.javaex.ex01;

public class Member {
	
	//필드
	private String id, name;
	private int point;
	//생성자
	public Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	//메소드 g/s
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	
	//일반 메소드
	public void showinfo() {
		System.out.println("회원정보: "+ name+"("+id+"), "+point+"점");
	}
	
}

//	@Override
//	public String toString() {
//		return "Member [id=" + id + ", name=" + name + ", point=" + point + "]";
//	} 
	


