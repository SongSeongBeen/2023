package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.BlogService;
import com.javaex.service.CategoryService;

@Controller
@RequestMapping(value = "{id}", method = { RequestMethod.GET, RequestMethod.POST })
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	@Autowired
	private CategoryService categorService;

//블로그-메인	
	@RequestMapping("")
	public String blogMain(@PathVariable("id") String id,
						   @RequestParam(value = "cateNo", required=false, defaultValue="0")int cateNo, 
						   @RequestParam(value = "cateNo", required=false, defaultValue="1")int crtpage,
	                       Model model) {
	//	List<CategoryVo> categoryList = categorService.getCateList(id);
		//model.addAttribute("categoryList",categoryList);
		
		return "blog/blog-main";
	}

}
