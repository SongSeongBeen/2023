package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestbookVo;

@Repository
public class GuestbookDao {
//공통영역	
	@Autowired
	private SqlSession sqlSession;
	private int count = 0;

//리스트 영역	
	public List<GuestbookVo> getList() {
		System.out.println("GuestbookDao.getList");
		
		List<GuestbookVo> guestbookList = sqlSession.selectList("guestbook.selectList");
		
		return guestbookList;
	}

//등록		
	public int insert(GuestbookVo guestbookVo) {
		System.out.println("GuestbookDao.guestInsert");
		
		count = sqlSession.insert("guestbook.insert", guestbookVo);
		System.out.println(count + "건");
		
		return count;
	}

//삭제 영역
		public int delete(GuestbookVo guestbookVo) {
		System.out.println("PhoneDao.personDelete");
		
		count = sqlSession.delete("guestbook.delete", guestbookVo);
		
		return count;
	}

}
