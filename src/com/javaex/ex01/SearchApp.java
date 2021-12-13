package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) throws IOException { //예외처리
		Scanner sc = new Scanner(System.in);
		System.out.println("**********************************************");
 		System.out.println("**             전화번호 관리 프로그램            **");
		System.out.println("**********************************************");
		System.out.println(" ");
		
		
		Reader list = new FileReader("F:\\javaStudy\\miniprofile\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(list);
		
		List<Search> pList = new ArrayList<Search>();
		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			String[] sArray = str.split(","); // 마지막이 아니면
			Search p01 = new Search(sArray[0], sArray[1], sArray[2]);
			pList.add(p01);
		}
		br.close();
		
		while (true) {
			System.out.println("----------------------------------------------");
			System.out.println("| 1.리스트 | 2.등록  | 3.삭제  | 4.검색  | 5.종료  |");
			System.out.println("----------------------------------------------");
			
			System.out.print(">메뉴번호:");
			int num = sc.nextInt(); 
			
			if(num==5) {
				System.out.println("**********************************************");
				System.out.println("**********************************************");
		 		System.out.println("**                 감사합니다                  **");
				System.out.println("**********************************************");
				System.out.println("**********************************************");
				break;
			}
			
			switch (num) {

			case 1: // 리스트 메모장으로 받아서 출력
				System.out.println("<1.리스트>");
				showInfo(pList);
				continue;

			case 2: // 등록해서 메모장으로 저장까지
				// 이름
				System.out.println("<2.등록>");
				System.out.print(">이름 : ");
				sc.nextLine();
				String name = sc.nextLine();
				// 핸드폰
				System.out.print(">휴대전화 : ");
				String hp = sc.nextLine();
				// 회사
				System.out.print(">회사전화 : ");
				String company = sc.nextLine();
				// 저장
				Search p02 = new Search(name, hp, company); // p01이랑 다르게 추가
				pList.add(p02); // 리스트추가
				// 저장경로
				Writer in = new FileWriter("F:\\javaStudy\\miniprofile\\PhoneDB.txt");
				BufferedReader bw = new BufferedReader(list);

				System.out.println("[등록되었습니다.]");
				showInfo(pList);
				in.close();
				bw.close();
				continue;

			case 3: // 메모장에 있는거 불러서 삭제?
				System.out.print("<3.삭제>");
				System.out.print(">번호 : ");
				int remove = sc.nextInt();
				pList.remove(--remove);
				System.out.print("[삭제되었습니다.]");
				showInfo(pList);
				continue;

			case 4: // 검색
				System.out.println("시스템 업데이트중입니다.");
				continue;
				
			case 5:
				System.out.println("**********************************************");
				System.out.println("**********************************************");
				System.out.println("**                 감사합니다                  **");
				System.out.println("**********************************************");
				System.out.println("**********************************************");
				break;

			default: // 계속반복
				System.out.println("[메뉴번호가 없습니다.(다시 선택해 주세요)]");
				continue;
			}

			sc.close();
		}
	
	}

	public static void showInfo(List<Search> pList) {
		for (int i = 0; i < pList.size(); i++) {
			System.out.println((i + 1) + ". " + pList.get(i).getName() + " " + pList.get(i).getHp() + " "
					+ pList.get(i).getCompany());
		}
	}
	
	
	
}
