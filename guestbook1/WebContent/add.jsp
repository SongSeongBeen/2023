<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javaex.dao.GuestbookDao" %>    
<%@ page import="com.javaex.vo.GuestbookVo" %>

<%
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String content = request.getParameter("content");

	//전송된 값을 Vo객체로 만든다
	GuestbookVo guestbookVo= new GuestbookVo(name, password, content);
	   
	//PhoneDao를 메모리에 올린다.
	GuestbookDao guestbookDao = new GuestbookDao();
	 	
	//저장한다.
	guestbookDao.guestInsert(guestbookVo);
	System.out.println("확인용"); 
	
	//----------------------------------------------
	 	
	//리다이렉트
	response.sendRedirect("./addList.jsp");
%>
