package com.javaex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.BlogService;
import com.javaex.service.CategoryService;
import com.javaex.vo.BlogVo;

@Controller
@RequestMapping(value = "{id}", method = { RequestMethod.GET, RequestMethod.POST })
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	@Autowired
	private CategoryService categorService;
	
	
	//블로그 공통 부분 뺄것인가 메인로그인 할때 HttpSession으로 다 올려 줄것인가 고민
	

//블로그-메인	
	@RequestMapping("")
	public String blogMain(@PathVariable("id") String id,
						   @RequestParam(value = "cateNo", required=false, defaultValue="0")int cateNo, 
						   @RequestParam(value = "cateNo", required=false, defaultValue="1")int crtpage,
	                       Model model) {
	
		
		return "blog/blog-main";
	}

//블로그 관리	
	@RequestMapping("admin/basic")
	
	public String admin(HttpSession session, @PathVariable("id") String id, Model model) {
		
		return "blog/admin/blog-admin-basic";
	}
	
//블로그 수정
	@RequestMapping("modify")
	public String modify(@PathVariable("id") String id, 
			             @RequestParam("file") MultipartFile file, 
			             @ModelAttribute BlogVo blogVo) {
			blogService.modify(id, file, blogVo);
			
		return "redirect:admin/basic";
	}

}
