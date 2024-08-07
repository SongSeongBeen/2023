package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
//회원가입		
	public void join(UserVo userVo) {
		userDao.insertUser(userVo);
	}
	
//로그인		
	public UserVo login(UserVo userVo) {
		return userDao.getUser(userVo);
	}
	
//아이디 중복체크
	public String idCheck(String id) {
		
	int count = userDao.idCheck(id);
		
		System.out.println(count);
		
		if(count>0) {
			return "fail";
		}else {
			return "success";
		} 

	}
}
