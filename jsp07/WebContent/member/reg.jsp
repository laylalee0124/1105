<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="/jsp07/js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript">
		$(function(){
			//이메일체크
			$("#email").blur(emailCheck);
			//비밀번호체크
			$("#pass2").focusout(passCheck);
		});
		///////////////////////////////////
		function passCheck(){
			//첫번째 비밀번호
			//*
			var pass1=$("#pass1").val();//var pass1=$("#pass1").val();
			var pass2=$("#pass2").val();
			if(pass1 == pass2){
				$("#passMsg").text("비밀번호가 일치합니다.");
			}else{
				$("#passMsg").text("비밀번호가 일치하지 않습니다.");
			}
			//*/
			/*
			if(10 === "10"){
				$("#passMsg").text("일치합니다.");
			}else{
				$("#passMsg").text("불일치");
			}
			*/
			
		}
		///////////////////////////////////
		function emailCheck(){
			
			var email=$("#email").val();
			
			$.ajax({
				url: "emailCheck.me",
				type: "post",
				data:{email : email },
				success: function(result){
					var msg=null;
					if(result==0) {
						msg="사용 가능한 이메일입니다!";
					}else {
						msg="이미 존재하거나 탈퇴 회원입니다!";
					}
					$("#emailMsg").text(msg);
				}
			});
		}
		////////////////////////////////////
		function submitCheck(){
			var email=$("#email").val().trim();
			var pass=$("#pass1").val().trim();
			var name=$("#name").val().trim();
			if(email == "" || pass == "" || name == ""){
				alert("필수옵션 미입력 하였습니다.");
				return false;
			}
			
			return true;
		}
	</script>
</head>
<body>
	<jsp:include page="/common/menu.jsp" />
	<hr>
	<h1>회원가입</h1>
	<form action="reg.me" method="post" onsubmit="return submitCheck()">
		<p>
			<input id="email" type="text" name="email" placeholder="이메일"/>
			<span id="emailMsg"></span>
		</p>
		<p>
			<input id="pass1" type="password" name="pass" placeholder="비밀번호"/>
		</p>
		<p>
			<input id="pass2" type="password" placeholder="비밀번호 확인"/>
			<span id="passMsg"></span>
		</p>
		<p>
			<input id="name" type="text" name="name" placeholder="이름"/>
		</p>
		<p>
			<input type="submit"  value="회원가입"/>
		</p>
	</form>
</body>
</html>