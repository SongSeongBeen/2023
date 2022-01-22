package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class GuestbookDao {
//공통영역	
		@Autowired
		private SqlSession sqlSession;
//공통영역	
		
		public UserVo getUser(UserVo userVo) {
			System.out.println("UserDao.getuser()");
			sqlSession.selectOne("user.getUser", userVo);
			
			UserVo authUser = sqlSession.selectOne("UserVo", userVo);
			
			return authUser;
			
		}

}
