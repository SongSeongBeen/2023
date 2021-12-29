package com.javaex.ex05;

import java.util.List;

public class BookApp {
	
	public static void main(String[] args) {
		
		
		List<BookVo> List;
		BookDao bookDao = new BookDao();
		
		//작가등록
		bookDao.bookInsert("우리들의 일그러진 영웅", "다림", "1998-02-22", 1);
		
		bookDao.bookInsert("삼국지", "민음사", "2002-03-01", 1);
		
		bookDao.bookInsert("토지", "마로니에북스", "2012-08-15", 2);
		
		bookDao.bookInsert("유시민의글쓰기특강", "생각의길", "2015-04-01", 3);
		
		bookDao.bookInsert("패션왕", "중앙북스(books)", "2012-02-22", 4);
		
		bookDao.bookInsert("순정만화", "재미주의", "2011-08-03", 5);
		
		bookDao.bookInsert("오직두사람", "문학동네", "2017-05-04", 6);
		
		bookDao.bookInsert("26년", "재미주의", "2012-02-04", 5);
		
		System.out.println("---------------------------------------------------------------------");
		
		List = bookDao.bookSelect();
	    for(int i=0; i<List.size(); i++) {
        	BookVo Vo = List.get(i);
        	System.out.println(Vo.getBookId()+","+Vo.getTitle()+","+Vo.getPubs()+","+Vo.getPubdate()+","+Vo.getAuthorId());
        }
	    
	    System.out.println("---------------------------------------------------------------------");
		
		
		//작가수정
		//bookDao.bookUpdate(1, 3,"토지(수정)", "마로니에북스(수정)", "2015-04-01", 2);
		
		//작가삭제
		//bookDao.bookDelete(1);
		
		/*
		List = bookDao.bookSelect();
	    for(int i=0; i<List.size(); i++) {
        	BookVo Vo = List.get(i);
        	System.out.println(Vo.getBookId()+","+Vo.getTitle()+","+Vo.getPubs()+","+Vo.getPubdate()+","+Vo.getAuthorId());
        }
	    System.out.println("---------------------------------------------------------------------");
		*/
		
		
	}

}
