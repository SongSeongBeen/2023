<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javaex.dao.GuestbookDao" %> 

<% 
	//파라미터 형변환
	int no =  Integer.parseInt(request.getParameter("no"));
	String password = request.getParameter("password");
    //메모리 올린다
	GuestbookDao guestbookDao = new GuestbookDao();
	
	//삭제
	guestbookDao.guestbookDelete(no, password);
	
	System.out.println("확인용"); 
	//리다이렉트
	response.sendRedirect("./list.jsp"); 
%>	


