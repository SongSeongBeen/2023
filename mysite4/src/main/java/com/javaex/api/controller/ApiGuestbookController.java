package com.javaex.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javaex.service.GuestbookService;
import com.javaex.vo.GuestbookVo;

@Controller
@RequestMapping("/api/guestbook")
public class ApiGuestbookController {
	
	@Autowired
	private GuestbookService guestbookService;
	
	@RequestMapping("/gList")
	public String guestbookList() {
		System.out.println("ApiGuestbookController.guestbookList()");
	
		return "aGuestbook/addList";
	}
	
	@ResponseBody
	@RequestMapping("/list")
	public List<GuestbookVo> list() {
		System.out.println("ApiGuestbookController.list()");
		
		List<GuestbookVo> guestbookList = guestbookService.getGusetList();
		System.out.println(guestbookList);
		
		//데이터만 주고 화면에서만 주고 받는다.
		return guestbookList;
	}
	@ResponseBody
	@RequestMapping("/write")
	public GuestbookVo write(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println(guestbookVo);
		//저장하고 저장된값 리턴
		GuestbookVo gVo = guestbookService.addGuestResultVo(guestbookVo);
		System.out.println(gVo);
		return gVo;
	}
	
	@ResponseBody
	@RequestMapping("/write2")
	public GuestbookVo write2(@RequestBody GuestbookVo guestbookVo) {
		System.out.println("ApiGuestbookController.write2");
		
		//저장하고 저장된값 리턴
		GuestbookVo gVo = guestbookService.addGuestResultVo(guestbookVo);
	
		return gVo;
		
	}
	
	@ResponseBody
	@RequestMapping("/remove")
	public String remove(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println("remove");
		System.out.println(guestbookVo);
		
		String result = guestbookService.remove(guestbookVo);
		//success
		System.out.println(result);
		
		return result;
	}
}
