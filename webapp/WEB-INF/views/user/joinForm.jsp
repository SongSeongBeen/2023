<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JBlog</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jblog.css">
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery/jquery-1.12.4.js"></script>
	    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/bootstrap/js/bootstrap.js"></script>
	</head>

	<body>
		<div id="center-content">
			
			<!-- 메인 해더 -->
		    <c:import url="/WEB-INF/views/includes/main-header.jsp"></c:import>
	
			<div>		
				<form id="joinForm" method="post" action="${pageContext.request.contextPath}/user/join">
					<table>
				      	<colgroup>
							<col style="width: 100px;">
							<col style="width: 170px;">
							<col style="">
						</colgroup>
			      		<tr>
			      			<td><label for="txtId">아이디</label></td>
			      			<td><input id="txtId" type="text" name="id" placeholder=""></td>
			      			<td><button id="btnIdCheck" type="button">아이디체크</button></td>
			      		</tr>
			      		<tr>
			      			<td></td>
			      			<td id="idMsg" colspan="2"></td>
			      		</tr> 
			      		<tr>
			      			<td><label for="txtPassword">패스워드</label> </td>
			      			<td><input id="txtPassword" type="password" name="password"  placeholder=""></td>   
			      			<td></td>  			
			      		</tr> 
			      		<tr>
			      			<td></td>
			      			<td id="pwMsg" colspan="2"></td>
			      		</tr> 
			      		<tr>
			      			<td><label for="txtUserName">이름</label> </td>
			      			<td><input id="txtUserName" type="text" name="userName"  placeholder=""></td>   
			      			<td></td>  			
			      		</tr>  
			      		<tr>
			      			<td></td>
			      			<td id="userNameMsg" colspan="2"></td>
			      		</tr> 
			      		<tr>
			      			<td><span>약관동의</span> </td>
			      			<td colspan="3">
			      				<fieldset class="fieldarea f2">
			      				<legend><span>이용</span>약관</legend>
									<p class="agreeText">
				      					<label for="chkAgree">서비스 약관에 동의합니다.</label>
				      					<input id="chkAgree" type="checkbox" name="agree1" >
				      					<textarea id="text1" readonly style="resize: none;">
													내용
										</textarea>
									</p>
			      				</fieldset>
			      				<fieldset class="fieldarea f3" >
                  					<legend><span>개인정보</span>취급방침</legend>
										<p class="agreeText"> 
											<label for="chkAgree">아래 사항에 동의 합니다.</label> 
											<input id="chkAgree2" type="checkbox" name="agreem2" /> 
											<textarea id="text2" readonly style="resize: none;">
												개인정보 방침 및 안내  
											</textarea> 
										</p>
								</fieldset>
			      			</td>   
			      		</tr>   		
			      	</table>
		      		<div id="btnArea">
						<button id="btnJoin" class="btn" type="submit" >회원가입</button>
					</div>
		      		
				</form>
				
			</div>
			
			
			<!-- 메인 푸터  자리-->
			<c:import url="/WEB-INF/views/includes/main-footer.jsp"></c:import>
		</div>
	
	</body>
	<script type="text/javascript">
        //아이디 중복 체크	
		$("#btnIdCheck").on("click", function(){
			console.log("클릭");
			
			//요청
			$.ajax({
					//요청할때
					url : "${pageContext.request.contextPath}/user/idCheck",// 주소.    
					type : "get",//get, post(어차피 차이 없음)
					//contentType : "application/json",
					
					//파라미터로 보낼때 객체로 보내야 한다
					data : {id : $("#txtId").val()},
				
					//응답받을때
					//dataType : "json",
					success : function(idCheck) {//json --> js로 변환되서 담김
						
							if(idCheck == 'success'){
								 $("#idMsg").html("사용가능한 아이디 입니다.");
				
							}else{
								 $("#idMsg").html("이미 사용중인 아이디 입니다.");
								 
							}
					},
					error : function(XHR, status, error) {
						console.error(status + " : " + error);
					}
			});
			
		});
        
        //체크박스 체크여부
        $("#chkAgree").click(checkedChange) && $("#chkAgree2").click(checkedChange); 
        function checkedChange() { 
        	if($(this).prop("checked")){ 
        		$("label[for="+this.id+"]").text("동의 되었 습니다."); 
        		$("label[for="+this.id+"]").css("color","blue"); 
        	}else{ 
        		$("label[for="+this.id+"]").text("동의 해주시기 바랍니다."); 
        		$("label[for="+this.id+"]").css("color","red");
       		}
        }
    
	//회원가입 버튼
	//각 항목 유효성 검사
	$("#btnJoin").on("click", function(){ 
		  const id = document.getElementById("txtId"); //블록범위 선언 const
		  const pw = document.getElementById("txtPassword");
		  const name = document.getElementById("txtUserName");
		
		  if (id.value === "") {
			  $("#idMsg").html("아이디를 입력해 주세요.");
			  return false;
		  }
		  else if (pw.value === ""){
			  $("#pwMsg").html("비밀번호를 입력해 주세요.");
			  return false;
		  }  
		  else if (name.value === ""){
			  $("#userNameMsg").html("이름을 입력해 주세요.");
			  return false;
		  }
		  else if(! $("#chkAgree").is(":checked")){
			  alert("약관에 동의해주세요");
			  return false;
		  }
		  else if(! $("#chkAgree2").is(":checked")){
			  alert("개인정보 방침에 동의해 주세요");
			  return false;
		  }
    });
	

	</script>


</html>