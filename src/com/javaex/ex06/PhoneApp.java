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
			
			Scanner sc = new Scanner(System.in);
			
			//메모리 올리기
			List<Person> pList = new ArrayList<Person>();
			//파일에 접속
			Reader fr = new FileReader("F:\\javaStudy\\file\\PhoneDB.txt");
			BufferedReader br = new BufferedReader(fr);
			//저장 경로


			while (true) { //한줄씩 읽어
				String line = br.readLine();
				if(line ==null) {
					break;
				}
				String[] sArray = line.split(",");  //마지막이 아니면,로
				String name = sArray[0];
				String  hp = sArray[1];
				String  company = sArray[2];
				//생성 값 넣기
				Person p01 = new Person(name, hp, company);
				//리스트에 추가
				pList.add(p01);
				
			}
		
//			for(int i=0; i<3; i++) {
//				String put = sc.nextLine();
//				String[] sArray = put.split(",");
//
//				Person f = new Person(sArray[0], sArray[1], sArray[2]);
//				
//				pList.add(f);
//			}
		
			//화면출력
			for(int i=0; i<pList.size(); i++) {
				System.out.println("이름:" + pList.get(i).getName());
				System.out.println("핸드폰 :" + pList.get(i).getHp());
				System.out.println("회사:" + pList.get(i).getCompany());
				System.out.println(" ");
				
			}
			//기보드값 입력
			System.out.println("데이터를 입력하세요");
			String put = sc.nextLine();
			String[] sArray = put.split(","); //마지막 ,으로

			String name = sArray[0];
			String  hp = sArray[1];
			String  company = sArray[2];
			Person p01 = new Person(name, hp, company);
			//리스트에 추가
			pList.add(p01);
			
			//파일저장
			Writer fw = new FileWriter("F:\\javaStudy\\file\\PhoneDB.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i=0; i<pList.size(); i++) {
				String str = pList.get(i).getName() + "," + pList.get(i).getHp() + "," +  pList.get(i).getCompany();
				bw.write(str);
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
//				pList.add(p01);
//			}
//			for(Person f:pList) {
//	    		f.showInfo();
//			}
			sc.close();
			br.close();
			bw.close();
		}
		
}


