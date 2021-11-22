package com.javaex.ex01;

public class Goods {
	
	//필드와 메소드의 접근을 제한하기
	//                클래스 내누  동일 패키지    상속받은 클래스   이외영역
	//private            O          X             X          X
	//(default)          O          X             X          X
	//protected          O          X             O          X
	//public             O          X             O          O
//필드	
	private String name;
	private int price;
//메소드
    public void setName(String n){//담는다
    name = n;
    }	
    public String getName(){   //내보낸다
        return name;
        }
    
    public void setPrice(int p) {
    	price = p;
    }
    public int getPrice() {
    	return price;
    }
    
    public void showinfo() {
    	System.out.println("상품명 : " + name);
    	System.out.println("가격 : " + price);
    	System.out.println("---------------------------");
    }
    
			
}
