package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;

//로그인-폼
	@RequestMapping(value="/loginForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String loginForm(@ModelAttribute UserVo userVo) {
			System.out.println("loginForm");
		userDao.getUser(userVo);
		return "/user/loginForm";
	}
	
//로그인-폼
	@RequestMapping(value="/login", method= {RequestMethod.GET, RequestMethod.POST})
	public String login(@ModelAttribute UserVo userVo) {
			System.out.println("loginForm");
			
		userDao.getUser(userVo);
		
		return "/user/loginForm";
	}
		
//회원가입-폼	
	@RequestMapping(value="/joinForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String joinForm() {
			System.out.println("join");
		return "redirect:/main";
	}
	
//회원가입-확인
	@RequestMapping(value="/joinOk", method= {RequestMethod.GET, RequestMethod.POST})
	public String joinOk() {
			System.out.println("joinOk");
		return "/user/joinOk";
	}
	
//회원가입-확인
	@RequestMapping(value="/modifyForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String modifyForm() {
			System.out.println("modifyForm");
		return "/user/modifyForm";
	}

}
