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
	private int count = 0;
//공통영역		

//회원가입
	public int insertUser(UserVo userVo) {
		System.out.println("UserDao.insertUser()");

		count = sqlSession.insert("user.insertUser", userVo);
		System.out.println(count + "명이 등록되었습니다");
		return count;
	}

//로그인		
	public UserVo selectUser(UserVo userVo) {
		System.out.println("UserDao.selectUser()");

		sqlSession.selectOne("user.selectUser", userVo);
		UserVo authUser = sqlSession.selectOne("user.selectUser", userVo);
		
		return authUser;
	}

//회원 1명 번호로	
	public UserVo getUser(int no) {
		System.out.println("UserDao.getUser()");
		
		return sqlSession.selectOne("user.getUser", no);
	}

// 회원정보 수정
	public int updateUser(UserVo userVo) {
		System.out.println("UserDao.updateUser()"+userVo);
		
		count = sqlSession.update("user.updateUser", userVo);
		
		System.out.println(count + "건이 수정되었습니다");
		
		return count;
	}
// 회원정보 수정
		public int idCheck(UserVo userVo) {
			System.out.println("UserDao.idCheck()"+userVo);
			
			sqlSession.selectOne("user.idCheck", userVo);
			
			//System.out.println(count + "건이 수정되었습니다");
			
			return 0;
		}

}


