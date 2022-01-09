<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  
<%@ page import="com.javaex.dao.PhoneDao" %>
<%@ page import="com.javaex.vo.PersonVo" %>   

<%
 	//파라미터 형변환
	//System.out.println("확인용");

	//String name = request.getParameter("name");
	//String hp = request.getParameter("hp");
	//String company = request.getParameter("company");
	
	int id = Integer.parseInt(request.getParameter("id"));
	PersonVo personVo = new PhoneDao().getPerson(id);
%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
	
		<h1>[Phonebook1]</h1>
     	
     	<h2>전화번호 수정</h2>
     	
     	<p>
     		전화번호를 수정하려면<br>
     		아래항목을 수정하고 "수정"  버튼을 클릭하세요.
     	</p>
     	
			<form action="/phonebook2/pbc" method="get">
			<input type="hidden" name="id" value="<%= personVo.getPersonId() %>"/><br>
		     	<table border="1">
	     			<tr >
	     				<th align="left">이름(name)</th>
	     				<th ><input type="text" style="text-align:center;" name="name" value="<%= personVo.getName() %>"/></th>
	     			</tr>
		    		<tr>
		     			<th align="left">핸드폰(hp)</th>
		     			<th><input type="text" style="text-align:center;" name="hp" value="<%= personVo.getHp() %>"/></th>
		     		</tr>
					<tr>
		     			<th align="left">회사(compnay)</th>
		     			<th><input type="text" style="text-align:center;" name="company" value="<%= personVo.getCompany() %>"/></th>
		     		</tr>
		     		<tr>
		     			<th align="left">코드(id)</th>
		     			<th><%= personVo.getPersonId() %></th>
		     		</tr>
		     	</table>
	     			<button type="submit" style="margin: 5px 0px 0px 0px;"onclick="location.href='/phonebook2/pbc?action=list' "> 뒤로 </button>
	     			<button type="submit" style="margin: 5px 0px 0px 215px;"> 수정 </button>
	     			<input type="hidden" name="action" value="update">
	     	</form>
     	
	</body>
	
	
</html>