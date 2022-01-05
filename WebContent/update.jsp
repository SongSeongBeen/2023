<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javaex.vo.PersonVo" %> 
<%@ page import="com.javaex.dao.PhoneDao"%>

<%
	int personId =  Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	String hp = request.getParameter("hp");
	String company = request.getParameter("company");
	
	PersonVo personVo= new PersonVo(personId, name, hp, company);
	
	//PhoneDao를 메모리에 올린다.
	PhoneDao phoneDao = new PhoneDao();
	//저장
	phoneDao.personUpdate(personVo);
	

	//리다이렉트
	response.sendRedirect("./list.jsp");
%>