package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	private UserVo userVo;
	private int count = 0;

	public UserVo login(UserVo userVo) {
		UserVo authUser = userDao.selectUser(userVo);
		return authUser;
	}

	public int join(UserVo userVo) {
		count = userDao.insertUser(userVo);
		return count;
	}

	public UserVo getUser(int no) {
		userVo = userDao.getUser(no);
		return userVo;
	}

	public int updateUser(UserVo userVo) {
		count = userDao.insertUser(userVo);
		return count;
	}

}
