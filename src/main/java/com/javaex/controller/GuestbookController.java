package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;


@Controller
public class GuestbookController {

	@Autowired
	private UserDao userDao;
		
//리스트입력-확인		
		@RequestMapping(value="/guestList", method= {RequestMethod.GET, RequestMethod.POST})
		public String loginForm(@ModelAttribute UserVo userVo) {
			System.out.println("guestList");
			userDao.getUser(userVo);
			return "/guestbook/addList";
		}
}
		

	


