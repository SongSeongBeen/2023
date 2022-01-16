package com.javaex.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaex.dao.BoardDao;
import com.javaex.util.WebUtil;
import com.javaex.vo.BoardVo;
import com.javaex.vo.UserVo;

@SuppressWarnings("serial")//부모클래스에 객체가 있기때문
@WebServlet("/bod")
public class BoardController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String act = request.getParameter("action");

//쓰기폼		
		if("writeForm".equals(act)) {
			System.out.println("action=writeForm");
			WebUtil.forward(request, response, "/WEB-INF/views/board/writeForm.jsp");
			
//쓰기확인			
		}else if("write".equals(act)) {	
			System.out.println("action=write");
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
					
			HttpSession session = request.getSession();
			UserVo userVo = (UserVo)session.getAttribute("authUser");
			
			int userNo = userVo.getNo();
			
			BoardVo boardVo = new BoardVo(title, content, userNo);
			new BoardDao().write(boardVo);
			
			WebUtil.redirect(request, response, "/mysite/bod");

//수정폼	
		}else if("modifyForm".equals(act)) {
			System.out.println("action=modifyForm");
			int no = Integer.parseInt(request.getParameter("no"));
		
			BoardVo boardVo = new BoardDao().getboard(no);
			
			request.setAttribute("boardVo", boardVo);
			WebUtil.forward(request, response, "/WEB-INF/views/board/modifyForm.jsp");
//수정확인			
		}else if("modify".equals(act)) {
			int no= Integer.parseInt(request.getParameter("no"));
			String title= request.getParameter("title");
			String content= request.getParameter("content");
			
			BoardVo boardVo = new BoardVo(no, title, content);
			new BoardDao().modify(boardVo);
			
			WebUtil.redirect(request, response, "/mysite/bod");
			
//게시판 읽기	
		}else if("read".equals(act)) {
			System.out.println("action=read");
			
			int no = Integer.parseInt(request.getParameter("num"));
			BoardVo boardVo = new BoardDao().getboard(no);
		
			request.setAttribute("boardVo", boardVo);
			
			WebUtil.forward(request, response, "/WEB-INF/views/board/read.jsp");
	
//삭제	
		}else if("delete".equals(act)) {
			
			System.out.println("action=delete");
			
			int no =  Integer.parseInt(request.getParameter("no"));
			new BoardDao().boardDelete(no);
			
			WebUtil.redirect(request, response, "/mysite/bod");
			
//리스트	
		}else {
			System.out.println("list");
			
			List<BoardVo> boardList = new BoardDao().getBoardList();
			
			request.setAttribute("bList", boardList); // 주소만 준거다
			
			WebUtil.forward(request, response, "/WEB-INF/views/board/list.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
