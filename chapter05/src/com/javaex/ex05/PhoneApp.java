package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {
	
	public static void main(String[] args )throws IOException{
		//ArrayList 메모리에 올리기
		List<Person> pList = new ArrayList<Person>();
		//PhonDB.txt 접속
		Reader fr = new FileReader("F:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line =  br.readLine();//한줄씩 읽는다
			if(line == null) { //주소가 없으면
				break;
			}
			
			//배열로 
			String[] dArray =  line.split(","); //마지막이 아니면 (",") 로 구분한다
			String  name = dArray[0];
			String  hp = dArray[1];
			String  company = dArray[2];
			//Person객체를 생성하고 값을 넣어준다
			Person p01 = new Person(name, hp, company);
			//리스트에 추가해준다
			pList.add(p01);
		}
		System.out.println(pList.toString());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println("이름:" + pList.get(i).getName());
			System.out.println("핸드폰:" + pList.get(i).getHp());
			System.out.println("회사:" + pList.get(i).getCompany());
			System.out.println(" ");
		}
		
		
		
		
		br.close();
		
	}

}
