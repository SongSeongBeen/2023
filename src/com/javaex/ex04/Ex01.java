package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {

		Point p01 = new Point(12,5);
		Point p02 = new Point(3,17);
		Point p03 = new Point(8,2);

		//섞어쓰기한 이유 공부하기
		List<Point> pList = new ArrayList<Point>(); //섞어 쓰기 않하면 다 쓸수있다 ArrayList<Point>
		//List<Point> pList = new LinkedList<Point>();
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size());  //방의개수
		
		System.out.println(pList.get(1).getX());
		System.out.println(pList.get(1).toString());
		
		//전체출력
		for(int i=0; i<pList.size(); i++) { //방의개수로 설정
			System.out.println(pList.get(i).toString());
		}
		System.out.println("==========================");
		//데이터 지우기
		pList.remove(1); //지우기
		//pList.remove(p02);
		
		
		System.out.println(pList.size());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		//원하는 곳에 넣기
		pList.add(2, p02); //몇번째에 누구 넣을래?
		for(int i=0; i<pList.size(); i++) { //방의개수로 설정
			System.out.println(pList.get(i).toString());
		}
		System.out.println("==========================");
		System.out.println(pList.toString());
		
		System.out.println("==========================");
		//향상된 for문 (처음 부터 끝까지...)
		for(Point p : pList) {
			System.out.println(p.getX());
		}
		
		
	}

}
