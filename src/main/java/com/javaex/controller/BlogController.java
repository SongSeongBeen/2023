package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jblog")
public class BlogController {

//블로그-메인	
	public String blogMain() {
		
		return "blog/blog-main";
	}

}
