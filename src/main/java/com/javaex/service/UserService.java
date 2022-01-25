package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public UserVo login(UserVo userVo) {
		UserVo authUser = userDao.selectUser(userVo);
		return authUser;
	}

	public int join(UserVo userVo) {
		int count = userDao.insertUser(userVo);
		return count;
	}

	public UserVo getUser(int no) {
		UserVo userVo = userDao.getUser(no);
		return userVo;
	}

	public int updateUser(UserVo userVo) {
		int count = userDao.insertUser(userVo);
		return count;
	}

}
