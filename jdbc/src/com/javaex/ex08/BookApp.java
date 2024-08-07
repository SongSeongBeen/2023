package com.javaex.ex08;

import java.util.List;

public class BookApp {

	public static void main(String[] args) {

		List<BookVo> List;
	
		BookDao bookDao = new BookDao();

//		BookVo vo01 = new BookVo("우리들의 일그러진 영웅", "다림", "1998-02-22", 1);
//		bookDao.bookInsert(vo01);
//		
//		BookVo vo02 = new BookVo("삼국지", "민음사", "2002-03-01", 1);
//		bookDao.bookInsert(vo02);
//		
//		BookVo vo03 = new BookVo("토지", "마로니에북스", "2012-08-15", 2);
//		bookDao.bookInsert(vo03);
//		
//		BookVo vo04 = new BookVo("자바프로그래밍 입문", "위키북스", "2015-04-01", 3);
//		bookDao.bookInsert(vo04);
//		
//		BookVo vo05 = new BookVo("패션왕", "중앙북스(books)", "2012-02-22", 4);
//		bookDao.bookInsert(vo05);
//		
//		BookVo vo06 = new BookVo("순정만화", "재미주의", "2011-08-03", 5);
//		bookDao.bookInsert(vo06);
//		
//		BookVo vo07 = new BookVo("오직두사람", "문학동네", "2017-05-04", 6);
//		bookDao.bookInsert(vo07);
//		
//		BookVo vo08 = new BookVo("26년", "재미주의", "2012-02-04", 5);
//		bookDao.bookInsert(vo08);
//
//		// 작가수정
//		BookVo bookVo = new BookVo(2, "26년(수정)", "재미주의(수정)", "2012-02-04", 2);
//		bookDao.bookUpdate(9, bookVo);

		
		System.out.println("---------------------------------------------------------------------");

		List = bookDao.bookSelect();
		for (int i = 0; i < List.size(); i++) {
			BookVo Vo = List.get(i);
			System.out.println(Vo.getBookId() + "," + Vo.getTitle() + "," + Vo.getPubs() + "," + Vo.getPubDate() + ","
					+ Vo.getAuthorName());
		}

		System.out.println("---------------------------------------------------------------------");
        
		// 검색
		List = bookDao.bookAllSearch();
		for (int i = 0; i < List.size(); i++) {
			BookVo Vo = List.get(i);
			System.out.println(Vo.getBookId() + "," + Vo.getTitle() + "," + Vo.getPubs() + "," + Vo.getPubDate() + ","
					+ Vo.getAuthorName());
		}
		// 작가삭제
		// bookDao.bookDelete(1);

		/*
		 * System.out.println(
		 * "---------------------------------------------------------------------");
		 * 
		 * List = bookDao.bookSelect(); for(int i=0; i<List.size(); i++) { BookVo Vo =
		 * List.get(i);
		 * System.out.println(Vo.getBookId()+","+Vo.getTitle()+","+Vo.getPubs()+","+Vo.
		 * getPubDate()+","+Vo.getAuthorId()); }
		 * 
		 * System.out.println(
		 * "---------------------------------------------------------------------");
		 */

	}

}
