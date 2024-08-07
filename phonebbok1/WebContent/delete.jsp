<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javaex.dao.PhoneDao" %> 

<% 
	//파라미터 형변환
	int id =  Integer.parseInt(request.getParameter("id"));
	
    //메모리 올린다
	PhoneDao phoneDao = new PhoneDao();
	
	//삭제
	phoneDao.personDelete(id);
		
	//리다이렉트
	response.sendRedirect("./list.jsp"); 
%>	

