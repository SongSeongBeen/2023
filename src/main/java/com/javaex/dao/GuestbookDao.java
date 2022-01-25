package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestbookVo;
import com.javaex.vo.UserVo;

@Repository
public class GuestbookDao {
//공통영역	
	@Autowired
	private SqlSession sqlSession;
	private int connt = 0;

//공통영역	

	public UserVo getUser(UserVo userVo) {
		System.out.println("UserDao.getuser()");
		sqlSession.selectOne("user.getUser", userVo);

		UserVo authUser = sqlSession.selectOne("UserVo", userVo);

		return authUser;
	}

//리스트 영역	
	public List<GuestbookVo> getList() {
		System.out.println("GuestbookDao.getList");
		List<GuestbookVo> guestbookList = sqlSession.selectList("guestbook.selectList");

		return guestbookList;

	}

//등록		
	public int guestInsert(GuestbookVo guestbookVo) {
		System.out.println("GuestbookDao.guestInser");
		sqlSession.insert("guestbook.insert", guestbookVo);
		System.out.println(connt + "건");
		return connt;

	}

//삭제 영역
	public int guestbookDelete(GuestbookVo guestBookVo) {
		System.out.println("PhoneDao.personDelete");
		sqlSession.delete("guestbook.delete", guestBookVo);
		return connt;
	}

}
