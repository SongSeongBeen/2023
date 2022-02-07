package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.GalleryService;
import com.javaex.vo.GalleryVo;

@Controller
@RequestMapping("/gallery")
public class GalleryController {
	
	@Autowired
	private GalleryService galleryService;
	
	@RequestMapping("/form")
	public String Form() {
		System.out.println("FileControllet.Form()");
		return "fileupload/form";
	}
	

//리스트 출력	
	@RequestMapping("/list")
	public String list(Model model) {
		
		System.out.println("GalleryControllet.list()");
		
		List<GalleryVo> galleryList = galleryService.getGalleryList();
		
		model.addAttribute("galleryList", galleryList);
		
		return "gallery/list";
	}
	
//파일업로드	
		@RequestMapping("/upload")
		public String upload(@ModelAttribute GalleryVo galleryVo, @RequestParam("file") MultipartFile file) { //첨부파일(그릇)안에  객체가 없어도 그릇의 주소를 찍어준다 
			
			System.out.println("GalleryControllet.upload()");
			
			galleryService.upload(file, galleryVo);
			
			return "redirect:list";
		}
//사진 보기		
		@ResponseBody
		@RequestMapping("/read")
		public GalleryVo read(@RequestParam("no") int no) {
			System.out.println("GalleryControllet.read()");
			
			GalleryVo galleryVo = galleryService.read(no);
			
			return galleryVo;
		}

//삭제
		@ResponseBody
		@RequestMapping("/remove")
		public int remove(@RequestParam("no") int no) {
			
			System.out.println("remove()"); 
			
			return  galleryService.remove(no);
		}
		
		
		
		
		
		/*
		@RequestMapping("/upload")
		public String upload(@RequestParam("file") MultipartFile file, Model model) { //첨부파일(그릇)안에  객체가 없어도 그릇의 주소를 찍어준다 
			System.out.println("FileControllet.upload()"+file);
			
			System.out.println(file.getOriginalFilename());  //객체 이름을 직접 찍어본다 
			
			String saveName = galleryService.restore(file);
			model.addAttribute("saveName", saveName);
			return "fileupload/result";
		}
		*/

}
