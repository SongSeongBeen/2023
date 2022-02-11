package com.javaex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
//회원가입-폼	
	@RequestMapping("/joinForm")
	public String joinForm() {
			
			return "user/joinForm";
		}

	
//회원가입-확인
	@RequestMapping("join")
	public String joinOk(@ModelAttribute UserVo userVo) {
		userService.join(userVo);
			return "redirect:loginForm";
		}
	
//로그인-폼	
	@RequestMapping("loginForm")
	public String loginForm() {
			
			return "user/loginForm";
		}
	
//로그인-확인
	@RequestMapping("login")
	public String login(@ModelAttribute UserVo UserVo, HttpSession session) {
			System.out.println("UserController.login()");
			
			UserVo authUser = userService.login(UserVo);
			// 로그인-성공
			if (authUser != null) {
				System.out.println("성공");
				// 저장
				session.setAttribute("authUser", authUser);
				return "redirect:/main";
				// 로그인-실패
			} else {
				System.out.println("실패");
				return "redirect:/user/loginForm?result=fail";
			}
	}
	
	
//로그아웃
	@RequestMapping("logout")
	public String logout() {
			
			return "redirect:/";
		}
	
//아이디 중복체크	
	@RequestMapping("idCheck")
	public String idCheck() {
			
			return "";
		}

	
}
