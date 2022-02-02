<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="${pageContext.request.contextPath}/assets/css/mysite.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath}/assets/css/user.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
		<div id="wrap">
	
			<!-- header + nav -->
			<c:import url="/WEB-INF/views/include/header.jsp"></c:import>
			
			<div id="container" class="clearfix">
			
				<!-- //aside -->
				<c:import url="/WEB-INF/views/include/aside.jsp"></c:import>
				<!-- //aside -->
	
				<div id="content">
				
					 <!-- //content-head -->
					<div id="content-head">
						<h3>회원정보수정</h3>
						<div id="location">
							<ul>
								<li>홈</li>
								<li>회원</li>
								<li class="last">회원정보수정</li>
							</ul>
						</div>
						<div class="clear"></div>
					</div>
					 <!-- //content-head -->
		
					<div id="user">
						<div id="modifyForm">
							<form action="${pageContext.request.contextPath}/user/modify" method="get">
		
								<!-- 아이디 -->
								<div class="form-group">
									<label class="form-text" for="input-uid">아이디</label> 
									<span class="text-large bold" >${authUser.id}</span>
									<input type="hidden" id="input-id" name="id" value="${authUser.id}" >
								</div>
		
								<!-- 비밀번호 -->
								<div class="form-group">
									<label class="form-text" for="input-pass">패스워드</label> 
									<input type="text" id="input-pass" name="password" value="" placeholder="비밀번호를 입력하세요"	>
								</div>
		
								<!-- 이메일 -->
								<div class="form-group">
									<label class="form-text" for="input-name">이름</label> 
									<input type="text" id="input-name" name="name" value="${authUser.name}" placeholder="이름을 입력하세요">
								</div>
						
								<!-- //나이 -->
								<div class="form-group">
									<span class="form-text">성별</span> 
										
									<c:if test="${authUser.gender eq 'male' }">
										<label for="rdo-male">남</label> 
										<input type="radio" id="rdo-male" name="gender" value="male" checked="checked"> 
									
										<label for="rdo-female">여</label> 
										<input type="radio" id="rdo-female" name="gender" value="female"> 
									</c:if>
									
									<c:if test="${authUser.gender eq 'female' }">
										<label for="rdo-male">남</label> 
										<input type="radio" id="rdo-male" name="gender" value="male" > 
									
										<label for="rdo-female">여</label> 
										<input type="radio" id="rdo-female" name="gender" value="female" checked="checked"> 
									</c:if>
								</div>
							
								<!-- 번호 -->
								<div class="form-group">
									<label class="form-text" for="input-no">회원번호</label> 
									<span class="text-large bold">${authUser.no}</span>
									<input type="hidden" id="input-id" name="no" value="${authUser.no}" >
								</div>
								<!-- 버튼영역 -->
								<div class="button-area">
									<button type="submit" id="btn-submit">회원정보수정</button>
								</div>
							</form>
						
						
						</div>
						<!-- //modifyForm -->
					</div>
					<!-- //user -->
				</div>
				<!-- //content  -->
	
			</div>
			<!-- //container  -->
	
			<c:import url="/WEB-INF/views/include/footer.jsp"></c:import>
			<!-- //footer -->
			
		</div>
		<!-- //wrap -->
	
	</body>
	
	
</html>	