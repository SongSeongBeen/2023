package com.javaex.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String boardList(Model model) {
		System.out.println("BoardController.bList()");
		
		List<BoardVo> boardList = boardService.getList();
		
		model.addAttribute("boardList", boardList);
		
		return"board/list";
	}
	
	@RequestMapping("/bList2")
	public String bList2(Model model, 
						@RequestParam(value = "crtPage", required = false, defaultValue="1")int crtPage) {
		System.out.println("BoardController.bList2()");
		System.out.println(crtPage);
		
		//해당페이지에 글 리스트 10개만 줘라
		Map<String, Object> pMap = boardService.getBoardList2(crtPage);
		
		model.addAttribute("pMap", pMap);
		
		return "board/list";
	}

//글읽기+조회수 증가
	@RequestMapping(value = "/readHit/{no}", method = { RequestMethod.GET, RequestMethod.POST })
	public String readHit(@PathVariable("no")int no, Model model,HttpSession session) {
		System.out.println("BoardController.read()");
		
			BoardVo boardVo = boardService.boardReadHit(no);
			
			model.addAttribute("boardVo", boardVo);
			
			return"board/read";
	}
	
//글읽기
	@RequestMapping(value = "/read/{no}", method = { RequestMethod.GET, RequestMethod.POST })
	public String read(@PathVariable("no")int no, Model model, HttpSession session) {
		System.out.println("BoardController.read()");
		
			BoardVo boardVo = boardService.boardRead(no);
			
			model.addAttribute("boardVo", boardVo);
			
			return"board/read";
	}
	
//글쓰기-폼	
	@RequestMapping(value = "/writeForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String writeForm(HttpSession session) {
		System.out.println("BoardController.writeForm()");
		
		UserVo authUser = (UserVo)session.getAttribute("authUser");
		if(authUser != null) {
			return"board/writeForm";
		}else {
			return"redirect:/loginForm";
		}
	}

//글쓰기-확인	
	@RequestMapping(value = "/write", method = { RequestMethod.GET, RequestMethod.POST })
	public String write(@ModelAttribute BoardVo boardVo) {
		System.out.println("BoardController.write()");
	
		boardService.boardWrite(boardVo);
		
		return"redirect:/board/bList";
	}

//글수정-폼
	@RequestMapping(value = "/modifyForm/{no}", method = { RequestMethod.GET, RequestMethod.POST })
	public String modifyForm(@PathVariable("no")int no, Model model) {
		System.out.println("BoardController.modifyForm()");
		
		BoardVo boardVo = boardService.boardRead(no);
		
		model.addAttribute("boardVo", boardVo);
		
		return"board/modifyForm";
	}
	
//글 수정-확인
	@RequestMapping(value = "/modify", method = { RequestMethod.GET, RequestMethod.POST })
	public String modify(@ModelAttribute BoardVo boardVo,  Model model) {
		System.out.println("BoardController.modify()");
		
		boardService.boardUpdate(boardVo);
		
		return"redirect:/board/bList";
	}
	
//글 삭제
		@RequestMapping(value = "/delete", method = { RequestMethod.GET, RequestMethod.POST })
		public String delete(@RequestParam int no) {
			System.out.println("BoardController.delete()");
			
			boardService.boardDelete(no);
			
			return"redirect:/board/bList";
		}

	
	
}
			




