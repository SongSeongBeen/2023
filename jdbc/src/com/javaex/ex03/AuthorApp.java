package com.javaex.ex03;

import java.util.List;

public class AuthorApp {
	
	public static void main(String[] args) {
		
		List<AuthorVo> List;
		
		//작가입력
		AuthorDao authorDao = new AuthorDao();
		
		AuthorVo vo01 = new AuthorVo("이문열", "경북 영양");
		authorDao.authorInsert(vo01);
		
		AuthorVo vo02 = new AuthorVo("박경리", "경상남도 통영");
		authorDao.authorInsert(vo02);
		
		AuthorVo vo03 = new AuthorVo("유시민", "17대 국회의원");
		authorDao.authorInsert(vo03);
		
		AuthorVo vo04 = new AuthorVo("기안84", "기안동에서산84년생");
		authorDao.authorInsert(vo04);
		
		AuthorVo vo05 = new AuthorVo("강풀", "온라인만화가1세대");
		authorDao.authorInsert(vo05);
		
		AuthorVo vo06 = new AuthorVo("김영하", "알쓸신잡");
		authorDao.authorInsert(vo06);
		
		System.out.println("--------------------------");
		List = authorDao.authorSelect();
		for(int i=0; i<List.size(); i++) {
			AuthorVo vo = List.get(i);
			System.out.println(vo.getAuthorId() + "," + vo.getAuthorName() + "," + vo.getAuthorDesc());
		}
		System.out.println("--------------------------");
		
		//작가수정
		AuthorVo authorVo = new AuthorVo(2, "박경리(수정)", "경상남도 통영(수정)");
		authorDao.authorUpdate(authorVo);
		List = authorDao.authorSelect();
		for(int i=0; i<List.size(); i++) {
			AuthorVo vo = List.get(i);
			System.out.println(vo.getAuthorId() + "," + vo.getAuthorName() + "," + vo.getAuthorDesc());
		}
		System.out.println("--------------------------");
		
		//작가삭제
		authorDao.authorDelete(1);
		
	}

		
}
