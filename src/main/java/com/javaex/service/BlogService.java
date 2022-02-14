package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BlogDao;
import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class BlogService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private BlogDao blogDao;
	
//블로그 유저 가져오기	
   public UserVo getBlogUser(String id) {
	   	return userDao.getBlogUser(id);
   }
   

}
