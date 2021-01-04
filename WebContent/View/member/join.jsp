<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- JSTL 사용을 위한 설정부분 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<!-- CSS를 External로 사용하기위한 설정 -->
<link rel="stylesheet" href="/css/mystyle.css">
<link rel="stylesheet" href="/css/mystyle-join.css">

<!-- 메뉴파일을 jsp:include로 쓰기위한 설정 -->
<script src="/JavaScript/jquery-3.5.1.min.js"></script>

<!-- ajax구문 -->
<script type="text/javascript">
	var emailResult=false;
	var passResult=false;
	var pass2Result=false;
	var nameResult=false;

 	$(function(){
 		$("#email").blur(emailCheck);
 		$("#password").blur(passCheck);
 		$("#password2").blur(pass2Check);
 		$("#name").blur(nameCheck);
 		$("#join-form").submit(return submitCheck);
 	});

 	function submitCheck(){
 	 	//이름이 일정길이이상인지체크
 	 	if(emailResult && passResult && pass2Result && nameResult){
 	 		return true;
 	 	}else{
 	 		return false;
 	 	}
 	}
 	
 	function nameCheck(){
 	 	//이름이 일정길이이상인지체크
 	 	var name=$(#this).val().trim();
 	 	if(name.length<2){
 	 		$(".nameMsg span")
 	 		.text("이름을 입력하세요.");
 	 		.css("color","red")
 	 		pass2=$(this).focus();
 	 		var nameResult=false;
 	 	}else{
 	 		$(".nameMsg span")
 	 		.text("ok");
 	 		.css("color","green")
 	 		nameResult=true;
 	 	}
 	}
 	
 	function pass2Check(){
 	 	//일치하는지 체크
 	 	var pass=$(#password).val();
 	 	var pass2=$(#password2).val();
 	 	if(pass!=pass2){
 	 		$(".pass2Msg span")
 	 		.text("일치하지않습니다.");
 	 		.css("color","red")
 	 		pass2=$(#password2).focus(); /* 재입력을위한 포커스이동 */
 	 		var pass2Result=false;
 	 	}else{
 	 		$(".pass2Msg span")
 	 		.text("일치 합니다.");
 	 		.css("color","green")
 	 		var pass2Result=true;
 	 	}
 	 	}
 	
 	
 	/* 아래 펑션을 실행하는 조건이 상기에 설정되어있음 
 	
 	실행안됨. 체크바람
 	
 	*/
 	function passCheck(){
 	//최소 자리수 체크
 	var pass=$(this).val();
 	var len=pass.length;
 	if(len<4){
 		$(".passMsg sapn")
 		.text("최소네글자이상요")
 		.css("color","red")
 		$(this).focus(); /* 재입력을위한 포커스이동 */
 		var passResult=false;
 	}else{
 		$(".passMsg span")
 		.text("사용가넝")
 		.css("color","green")
 		var passResult=true;
 	}
 	}
 	
 	
 	function emailCheck(){
 	$.post( /* 백그라운드에서 정보확인요청해서 받은정보를 result로 반환 */
 		"emailCheck.layla",
 		{email: $(#email).val()},
 		function(result,status){
 			alert(result);
 			/* result가 1이면 잇음, 0이면 존재하지않음 */
 			if(result){
 				$(".emailMsg span")
 				.text("이미 존재하는 id입니다.");
 				/* form tag내에서는 .val로 쓰고, 일반 태그에서는 .text로 표현 */
 				$("$email").focus
 				var emailResult=false;
 			}else{
 				$(".passMsg span")
 				.text("사용가능한 id입니다.");
 				var emailResult=true;
 			}
 		}
 		
 	);
 	
 	}
</script>

<title>join</title>
</head>


<body>
	<div class="top-wrap">
	</div>
	<main class="m_v">
		<div>
			<p class="tit">로그인</p>
			<div class="main-wrap">
				<div class="flex-row-center join-logo">
					<!-- 이미지는 inline요소라서 margin auto가안먹힘 -->
					<img alt="logo" src="/images/LE BLANC_blog horizontal.jpg">
				</div>
				<form id="join-form" action="join.layla" method="post">
					<!-- value는 쿠키중에서 키값이 userID인걸 뽑아오는것 -->
					<label for="email">EMAIL</label>
					<input id="email" type="text" name="email" placeholder="  EMAIL">
					<p class="emailMsg Msg">
						<span></span>
					</p>
					<label for="password">PASSWORD</label>
					<input id="password" type="password" name="pass" placeholder="  PASSWORD" >
					<p class="passMsg Msg">
						<span></span>
					</p>
					<label for="passconfirm">PASSWORD RECONFIRM</label>
					<input id="passconfirm" type="password" placeholder="  RECONFIRM PASSWORD">
					<p class="passMsg Msg">
						<span></span>
					</p>
					<label for="name">NAME</label>
					<input id="name" type="text" name="name" placeholder="  NAME">
					<p class="nameMsg Msg">
						<span></span>
					</p>
					
					<p class="logMsg Msg"> 
					<span > ${logMsg} </span> <!-- joinService에있는 logMsg의 value값을 가져옴 -->
					</p>
					<input type="submit" value="JOIN">

					<!-- cookie에 저장된 userID가 비어있으면 when을 저장. -->
					
				</form>
				
			</div>
		</div>
	</main>
	
	<footer class="m_v">
		<div>
		<ul>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		</ul>
	</div>
	</footer>
</body>
</html>