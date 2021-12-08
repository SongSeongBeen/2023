package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
	
	public static void main(String[] arga) {
		
		Map<String, Point>pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1, 11); //권상우
		Point p02 = new Point(2, 22); //정우성
		Point p03 = new Point(3, 33); //이효리
		
		
		//포인트형 주소를 준다
		pMap.put("권상우", p01);
		pMap.put("정우성", p02);
		pMap.put("이효리", p03);
		System.out.println(pMap);   //println=toString 기능포함
		
		System.out.println(pMap.get("정우성").getX());
		System.out.println(pMap.size());
		
		//키셋 구하기
		Set<String> keySet = pMap.keySet();
		for(String key : keySet) {
				System.out.println(pMap.get(key).getX());
				
		////////////////////////////////
		}
	}

}
