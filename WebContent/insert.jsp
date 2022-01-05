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

<%-- <!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h1>[phonebook1]</h1>
		
		<h2>전화번호 리스트</h2>
		
		<p>입력한 정보 내역입니다.</p>
		<br>
		<% 
		for(int i=0; i<personList.size(); i++ ){
		%>	
			<table border="1">
				<tr>
					<td>이름(name)</td>
					<td><%=personList.get(i).getName()%></td>
				</tr>
				<tr>
					<td>핸드폰(hp)</td>
					<td><%=personList.get(i).getHp()%></td>
				</tr>
				<tr>
					<td>회사(company)</td>
					<td><%=personList.get(i).getCompany()%></td>
				</tr>
			</table>
			<br>
		<% } %>
		
		<a href="./writeForm.jsp">전화번호 등록</a>
	</body>
</html> --%>