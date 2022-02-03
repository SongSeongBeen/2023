package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.GuestbookVo;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public UserVo login(UserVo userVo) {
		
		UserVo authUser = userDao.selectUser(userVo);
		
		return authUser;
	}

	public void join(UserVo userVo) {
		
		userDao.insertUser(userVo);
	}

	public UserVo getUser(int no) {
		
		return userDao.getUser(no);
	}

	public void updateUser(UserVo userVo) {

		userDao.updateUser(userVo);
	}
	
	public String idCheck(String id){
		System.out.println("idCheck");
		
		int count = userDao.idCheck(id);
		System.out.println(count);
		
		if(count>0) {
			return "success";
		}else {
			return "fail";
		}   
	}
}
