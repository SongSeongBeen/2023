package com.javaex.ex11;
										//Person 상속받는중 자식에게만 표시
public class Student extends Person { //가져오기 + 가져올 부모이름 ( 가져올시 상속 개념 필드 g/s 만들필요 없다)
	
	//필드 추가된거만
	private String schoolName;  //아형 고등학교  // 부모자식간만 접근허용 필드값 수정한다
											  //
										      //private (default)  protected public
	
	//생성자
	public Student() {
		
	}
    
	public Student(String schoolname) {
		this.schoolName = schoolname;
	}
	public Student(String name, int age, String schoolName) {
		
		/*
		super.name= name;  // 부모쪽에 필드값이 있을때 super 표기
		super.name= name;  // 부모쪽에 필드값이 있을때 super 표기
		*/
		//super(); 부모쪽 생성자 부르고 파라미터로 맞출수있다.  = this() 자식에게 쓰는 거랑 같은 개념
		super(name, age);
		
		super.setName(name);
		super.setAge(age);
		this.schoolName = schoolName;  // 자기한테 있으면 똑같이 this.쓰면된다
		System.out.println("person(3)"); //생략
	}
	
	//메소드g/s
	public void setSchoolName(String schoolname) {
		this.schoolName = schoolname;
	}
	public String getSchoolName() {
		return schoolName;
	}
	
	//일반메소드
	@Override
	public String toString() {
		return "Student [schoolname=" + schoolName + "]";
	}
	
	public void showInfo2() {
		System.out.println("******************************");
		System.out.println("이름: " + super.name); // super부모쪽에꺼 protected 필드값 변경후 사용가능 같은 
		System.out.println("나이: " + super.age);  // super부모쪽에꺼 protected 필드값 변경후 사용가능 같은 
		System.out.println("학교: " + this.schoolName);  //자기 자신꺼
		System.out.println("******************************");
		System.out.println(" ");
		
	}

}
