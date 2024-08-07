<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
     	<h1>[Phonebook3]</h1>
     	
     	<h2>전화번호 등록폼</h2>
     	
     	<p>
     		전화번호를 등록하려면<br>
     		아래항목을 기입하고 "등록"  버튼을 클릭하세요.
     	</p>
     	<form action="/phonebook3/phone/write" method="get">
	     	<table border="1">
	     			<tr >
	     				<th align="left">이름(name)</th>										
	     				<th ><input type="text" style="text-align:center;" name="name" value=""/></th>
	     			</tr>
		    		<tr>
		     			<th align="left">핸드폰(hp)</th>
		     			<th><input type="text" style="text-align:center;" name="hp" value=""/></th>
		     		</tr>
					<tr>
		     			<th align="left">회사(compnay)</th>
		     			<th><input type="text" style="text-align:center;" name="company" value=""/></th>
		     		</tr>
			 </table>
			 <button type="submit" style="margin: 5px 0px 0px 0px;"onclick="location.href='/phonebook3//phone/list' "> 뒤로 </button>
	   		 <button type="submit" style="margin: 5px 0px 0px 215px;"> 등록 </button>
     	</form>
	</body>
	
</html>