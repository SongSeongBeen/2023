<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.javaex.vo.PersonVo" %>
<%@ page import="com.javaex.dao.PhoneDao" %>



<%		
	@SuppressWarnings("unchecked") //지정한 형식이 개체만 포함될 것이라는 확신이들면
	//request의 auttribute 영역의 리스트를 가져온다 dao에서 가져오는거 아님                       //꺼내온다
	List<PersonVo> personList = (List<PersonVo>)request.getAttribute("pList"); 
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h1>Phonebook2</h1>
		<h2>전화번호 리스트</h2>
		<P>입력한 정보 내역입니다.</P>
		<%
		for(int i = 0; i<personList.size(); i++){
			
		%>
		<table border="1">
			<tr>
				<td>이름(name)</td>
				<td><%= personList.get(i).getName() %></td>
			</tr>
			<tr>
				<td>핸드폰(hp)</td>
				<td><%= personList.get(i).getHp() %></td>
			</tr>
			<tr>
				<td>회사(company)</td>
				<td><%= personList.get(i).getCompany() %></td>
			</tr>
			<tr>
				<td><a href="/phonebook2/pbc?action=updateForm&id=<%=personList.get(i).getPersonId()%>">수정</a></td>
				<td><a href="/phonebook2/pbc?action=delete&id=<%=personList.get(i).getPersonId()%>">삭제</a></td>
			</tr>
		</table>
		<br>
		<%
		}
		%>
			<a href="/phonebook2/pbc?action=writeForm">추가번호 등록</a>
	</body>
</html>