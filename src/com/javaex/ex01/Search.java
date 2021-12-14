package com.javaex.ex01;

public class Search {


	// 필드
	private String name;
	private String hp;
	private String company;

	// 생성자
	public Search() {

	}

	public Search(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	// 메소드gs
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getHp() {
		return hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	// 메소드일반
	@Override
	public String toString() {
		return "Search [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}

	public String bwrite() {
		return name + "," + hp + "," + company;
	}
	

}
