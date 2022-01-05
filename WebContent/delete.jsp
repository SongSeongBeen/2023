<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javaex.dao.PhoneDao" %> 

<% 
	//파라미터 형변환
	int personId =  Integer.parseInt(request.getParameter("id"));
	
	//삭제
	PhoneDao phoneDao = new PhoneDao();
	phoneDao.personDelete(personId);
		
	//리다이렉트
	response.sendRedirect("./list.jsp"); 
%>	

