package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.FileService;

@Controller
@RequestMapping("/fileupload")
public class FileController {
	
	@Autowired
	private FileService fileService;
	
	@RequestMapping("/form")
	public String Form() {
		System.out.println("FileControllet.Form()");
		return "fileupload/form";
	}
	
	@RequestMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file, Model model) { //첨부파일(그릇)안에  객체가 없어도 그릇의 주소를 찍어준다 
		System.out.println("FileControllet.upload()"+file);
		
		System.out.println(file.getOriginalFilename());  //객체 이름을 직접 찍어본다 
		
		String saveName = fileService.restore(file);
		model.addAttribute("saveName", saveName);
		return "fileupload/result";
	}
	
	@RequestMapping("/list")
	public String list() { //첨부파일(그릇)안에  객체가 없어도 그릇의 주소를 찍어준다 
		
		System.out.println("FileControllet.list()");
		
		
		return "fileupload/list";
	}

}
