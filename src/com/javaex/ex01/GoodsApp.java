package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
	
	Goods camera = new Goods();	
	camera.setName("니콘");	
	camera.setPrice(400000);
	
	camera.showinfo();
	
	Goods notebook = new Goods();
	notebook.setName("LG그램");	
	notebook.setPrice(900000);
	
	notebook.showinfo();
	
	Goods cup = new Goods();
	cup.setName("머그컵");	
	cup.setPrice(2000);
	
	cup.showinfo();
	}

}
	
	
//	System.out.println(camera.getName());
//	System.out.println(camera.getPrice());  //개별출력
	
	
	
//	camera.showinfo();    //지정 한번에 출력

//	Goods camera = new Goods(); // 기본자료형이 아니라 따라서 있을 주소값 입력
//	camera.name = "상품이름: "+"니콘, "+"가격:";
//	camera.price = 400000; 
//	
//	Goods notebook = new Goods(); 
//	notebook.name = "상품이름: "+"LG그램, "+"가격:";
//	notebook.price = 900000; 
//	
//	Goods cup = new Goods();
//	cup.name = "상품이름: "+"머그컵, "+"가격:";
//	cup.price = 5000;   	       //  Goods에   .따라가 int 지정해놔서 정수입력
//
//	System.out.print(camera.name); //필드값을 넣어줘야 출력이 된다.
//	System.out.println(camera.price);
//	
//	System.out.print(notebook.name);
//	System.out.println(notebook.price);
//	
//	System.out.print(cup.name);
//	System.out.println(cup.price);


