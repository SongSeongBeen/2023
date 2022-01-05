<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.javaex.vo.PersonVo" %>	
<%@ page import="com.javaex.dao.PhoneDao" %>

<%@ page import="java.util.List" %>

<%
	String name = request.getParameter("name");
    String hp = request.getParameter("hp");
    String company = request.getParameter("company");
  	/* 테스트 확인용 출력
  	System.out.println(name);
  	System.out.println(hp);
  	System.out.println(company); */
    
    //전송된 값을 Vo객체로 만든다
    PersonVo personVo= new PersonVo(name, hp, company);
    
  	//PhoneDao를 메모리에 올린다.
  	PhoneDao phoneDao = new PhoneDao();
  	
  	//저장한다.
  	phoneDao.personInsert(personVo);
  	
  	
  	//----------------------------------------------
  	
  	//전체리스트를 가져온다
  	List<PersonVo> personList = phoneDao.getPersonList();
  	//html 하고 섞는다
  	
  	//리다이렉트
  	response.sendRedirect("./list.jsp");
  
%>
