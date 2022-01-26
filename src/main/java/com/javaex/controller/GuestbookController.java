package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Controller
@RequestMapping(value="guestbook")
public class GuestbookController {
	// 필드
	@Autowired
	private GuestbookDao guestbookDao;
	// 생성자

	// 메소드gs

	// 메소드 일반

//리스트	
	@RequestMapping(value = "/gList", method = { RequestMethod.GET, RequestMethod.POST })
	public String guestbookList(Model model) {
		System.out.println("GuestbookController=addList");

		List<GuestbookVo> guestbookList = guestbookDao.getList();

		model.addAttribute("guestbookList", guestbookList);

		return "/guestbook/addList";
	}

//리스트입력-확인
	@RequestMapping(value = "/add", method = { RequestMethod.GET, RequestMethod.POST })
	public String add(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println("GuestbookController=add");

		guestbookDao.insert(guestbookVo);

		return "redirect:./gList";
	}

//삭제-폼
	@RequestMapping(value = "/deleteForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String deleteForm() {
		System.out.println("GuestbookController=deleteForm");
		
		return "/guestbook/deleteForm";
	}

//삭제
	@RequestMapping(value = "/delete", method = { RequestMethod.GET, RequestMethod.POST })
	public String delete(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println("GuestbookController=delete");

		guestbookDao.delete(guestbookVo);

		return "redirect:./gList";
	}

}
		

	


