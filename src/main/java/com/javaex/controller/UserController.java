package com.javaex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
@RequestMapping(value="user")
public class UserController {

	@Autowired
	private UserService userService;

//로그인-폼
	@RequestMapping(value = "/loginForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginForm(@ModelAttribute UserVo userVo) {
		System.out.println("loginForm");

		return "/user/loginForm";
	}

//로그인-확인
	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(@ModelAttribute UserVo userVo, HttpSession session) {
		System.out.println("UserController.login()");

		UserVo authUser = userService.login(userVo);
		System.out.println(authUser);

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
	@RequestMapping(value = "/logout", method = { RequestMethod.GET, RequestMethod.POST })
	public String logout(HttpSession session) {
		System.out.println("logout");

		session.removeAttribute("authUser");
		session.invalidate();

		return "redirect:/user/loginForm";
	}

//회원가입-폼	
	@RequestMapping(value = "/joinForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String joinForm() {
		System.out.println("joinForm");

		return "/user/joinForm";
	}

//회원가입-확인
	@RequestMapping(value = "/join", method = { RequestMethod.GET, RequestMethod.POST })
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("join");

		userService.join(userVo);

		return "redirect:/user/loginForm";
	}

//회원정보수정-폼
	@RequestMapping(value = "/modifyForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String modifyForm(Model model, HttpSession session) {
		System.out.println("UserController.modifyForm()");
		
		UserVo authUser = (UserVo)session.getAttribute("authUser");
		UserVo authVo= userService.getUser(authUser.getNo());
				
		model.addAttribute("authUser", authVo);
		
		return "/user/modifyForm";
	}

//회원정보수정-확인
	@RequestMapping(value = "/modify", method = { RequestMethod.GET, RequestMethod.POST })
	public String modify(@ModelAttribute UserVo userVo) {

		
		System.out.println("modify"+userVo);
		
		userService.updateUser(userVo);
		
		return "redirect:/main";
	}
	
//글 삭제

	@RequestMapping(value = "/idCheck", method = { RequestMethod.GET, RequestMethod.POST })
	public String idCheck(@ModelAttribute UserVo userVo) {
		System.out.println("BoardController.idCheck()");
		System.out.println(userVo);
		//userService.idCheck(userVo);
		
		return"redirect:/user/modifyForm";
	}

}
