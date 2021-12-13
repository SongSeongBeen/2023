package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

		public static void main(String[] args) throws IOException {
			
			//메모리 올리기
			List<Person> pList = new ArrayList<Person>();
			//파일에 접속
			Reader fr = new FileReader("F:\\javaStudy\\file\\PhoneDB.txt");
			BufferedReader br = new BufferedReader(fr);
			//저장 경로

			
			while (true) { // 한줄씩 읽어
				String line = br.readLine();
				if (line == null) {
					break;
				}
				String[] sArray = line.split(","); // 마지막이 아니면,로
				String name = sArray[0];
				String hp = sArray[1];
				String company = sArray[2];
				// 생성 값 넣기
				Person p01 = new Person(name, hp, company);
				// 리스트에 추가
				pList.add(p01);

			}
			
			br.close();
			
			listPrint(pList);
			//3줄 입력받아
//			for(int i=0; i<3; i++) {
//				String put = sc.nextLine();
//				String[] sArray = put.split(",");
//
//				Person f = new Person(sArray[0], sArray[1], sArray[2]);
//				
//				pList.add(f);
//			}
			
		
			//화면출력
//			for(int i=0; i<pList.size(); i++) {
//				System.out.println("이름:" + pList.get(i).getName());
//				System.out.println("핸드폰 :" + pList.get(i).getHp());
//				System.out.println("회사:" + pList.get(i).getCompany());
//				System.out.println(" ");
//				
//			}
			
			//기보드값 입력
			Scanner sc = new Scanner(System.in);
			System.out.println("데이터를 입력하세요.(종료:q)");
			
			while (true) {
				String put = sc.nextLine();
				if(put.equals("q")){
					break;
				}
					
				String[] fArray = put.split(","); //마지막 ,으로
	
				String name = fArray[0];
				String  hp = fArray[1];
				String  company = fArray[2];
				
				Person p02 = new Person(name, hp, company);
				//리스트에 추가
				pList.add(p02);
				
			}
			
			sc.close();
		
			
			listPrint(pList);
			//파일저장
			Writer fw = new FileWriter("F:\\javaStudy\\file\\PhoneDB2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (Person print : pList) {			
				bw.write(print.bwrite());
				bw.newLine();
			}
				
//				String put = sc.nextLine();
//				String[] sArray = put.split(",");
//
//				String name = sArray[0];
//				String  hp = sArray[1];
//				String  company = sArray[2];
//				Person p01 = new Person(name, hp, company);
//				
//				Person p01 = new Person(sArray[0], sArray[1], sArray[2]);
//				pList.add(p01
//			}
//			for(Person f:pList) {
//	    		f.showInfo();
//			}
		
		
			bw.close();
		}
		
		public static void listPrint(List<Person> pList) {
			for (int i = 0; i < pList.size(); i++) {
				System.out.println("이름: " + pList.get(i).getName());
				System.out.println("핸드폰: " + pList.get(i).getHp());
				System.out.println("회사: " + pList.get(i).getCompany());
				System.out.println(" ");
			}
		}
		
}


