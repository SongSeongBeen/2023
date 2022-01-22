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
				
		return "/user/loginForm";
	}
	
//로그인-확인
	@RequestMapping(value="/login", method= {RequestMethod.GET, RequestMethod.POST})
	public String login(@ModelAttribute UserVo userVo) {
			System.out.println("login");
			
		userDao.getUser(userVo);
		
		return "redirect:/main";
	}

//회원가입-폼	
	@RequestMapping(value="/joinForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String joinForm() {
			System.out.println("joinForm");
		return "/user/joinForm";
	}
	
//회원가입-확인
	@RequestMapping(value="/join", method= {RequestMethod.GET, RequestMethod.POST})
	public String join() {
			System.out.println("join");
		return "redirect:/loginForm";
	}
	
//회원정보수정
	@RequestMapping(value="/modifyForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String modifyForm() {
			System.out.println("modifyForm");
		return "/user/modifyForm";
	}
	
//회원정보수정-확인
	@RequestMapping(value="/modify", method= {RequestMethod.GET, RequestMethod.POST})
	public String modifyOk() {
			System.out.println("modify");
		return "redirect:/modifyForm";
	}

}
