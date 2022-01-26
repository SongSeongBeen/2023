package com.javaex.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.BoardService;
import com.javaex.vo.BoardVo;
import com.javaex.vo.UserVo;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
//게시판 리스트	
	@RequestMapping(value = "/bList", method = { RequestMethod.GET, RequestMethod.POST })
	public String bList(Model model) {
		System.out.println("BoardController.bList()");
		
		List<BoardVo> boardList = boardService.getList();
		
		model.addAttribute("boardList", boardList);
		return"/board/gList";
	}
//글쓰기-폼	
	@RequestMapping(value = "/bList", method = { RequestMethod.GET, RequestMethod.POST })
	public String writeForm(HttpSession session) {
		System.out.println("BoardController.writeForm()");
		
		UserVo authUser = (UserVo)session.getAttribute("authUser");
		if(authUser != null) {
			return"/board/writeForm";
		}else {
			return"redirect:/loginForm";
		}
	}
	
	@RequestMapping(value = "/bList", method = { RequestMethod.GET, RequestMethod.POST })
	public String write(HttpSession session, @RequestParam("title") String title,
			                                 @RequestParam("content") String content) {
		System.out.println("BoardController.write()");
		
		UserVo authUser = (UserVo)session.getAttribute("authUser");
		if(authUser != null) {
			return"/board/writeForm";
		}else {
			return"redirect:/loginForm";
		}
	}
	
//쓰기폼		

//쓰기확인			


//수정폼	

//수정확인			

				
//게시판 읽기	

			
//게시판 읽기 조회수 -- 일단 이렇

		
//삭제	

//				



}
