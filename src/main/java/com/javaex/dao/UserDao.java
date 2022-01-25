package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {
//공통영역	
		@Autowired
		private SqlSession sqlSession;

//공통영역		
		
//회원가입
//		public int insert(UserVo userVo) {
//	
//	
//		}
//로그인		
		public UserVo selectUser(UserVo userVo) {
			System.out.println("UserDao.selectUse r");
			sqlSession.selectOne("user.selectUser", userVo);
			
			UserVo authUser = sqlSession.selectOne("UserVo", userVo);
			
			
			return authUser;
			
		}
//회원 1명 번호로	
//		public UserVo getUserNo(int num) {
//			
//		}
		
// 회원정보 수정
//		public int Update(UserVo userVo) {
//
//		}

}


