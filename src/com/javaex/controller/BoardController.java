package com.javaex.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaex.dao.BoardDao;
import com.javaex.util.WebUtil;
import com.javaex.vo.BoardVo;

@SuppressWarnings("serial")//부모클래스에 객체가 있기때문
@WebServlet("/bcl")
public class BoardController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String act = request.getParameter("action");
//쓰기폼		
		if("writeForm".equals(act)) {
			System.out.println("action=writeForm");
			WebUtil.forward(request, response, "/WEB-INF/views/board/writeForm.jsp");
//수정폼	
		}else if("modifyForm".equals(act)) {
			System.out.println("action=modifyForm");
			WebUtil.forward(request, response, "/WEB-INF/views/board/modifyForm.jsp");
//게시판 읽기	
		}else if("read".equals(act)) {
			System.out.println("action=read");
			WebUtil.forward(request, response, "/WEB-INF/views/board/read.jsp");
//리스트	
		}else {
			System.out.println("list");
			
			List<BoardVo> boardList = new BoardDao().getBoardList();
			
			// 포워드
			request.setAttribute("bList", boardList); // 주소만 준거다
			
			// ^^^^^ setAttribute(값입력) ex("pList", personList);
			WebUtil.forward(request, response, "/WEB-INF/views/board/list.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
