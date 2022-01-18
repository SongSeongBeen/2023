<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
     	<h1>[Phonebook1]</h1>
     	
     	<h2>전화번호 등록폼</h2>
     	
     	<p>
     		전화번호를 등록하려면<br>
     		아래항목을 기입하고 "등록"  버튼을 클릭하세요.
     	</p>
     	
     	<form action="/phonebook3/phone/write" method="get">
     	이름(name) <input type="text" name="name" value=""> <br>
     	핸드폰(hp) <input type="text" name="hp" value=""> <br>
     	회사(compnay) <input type="text" name="company" value=""> <br>
     	<button type="submit">등록</button><br>
     	</form>
     	<button type="submit" style="margin: 5px 0px 0px 0px;"onclick="location.href='/phonebook3//phone/list' "> 뒤로 </button>
	</body>
</html>