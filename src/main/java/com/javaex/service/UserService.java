package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Controller
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	
	public void join(UserVo userVo) {
		//회원가입
		userDao.insertUser(userVo);
		
		
		
	}

}
