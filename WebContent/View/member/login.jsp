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
<link rel="stylesheet" href="/css/mystyle-login.css">

<!-- 메뉴파일을 jsp:include로 쓰기위한 설정 -->
<script src="/JavaScript/jquery-3.5.1.min.js"></script>


<title>LOGIN</title>
</head>


<body>
	<div class="top-wrap">
	</div>
	<main class="m_v">
		<div>
			<p class="tit">로그인</p>
			<div class="main-wrap">
				<div class="flex-row-center login-logo">
					<!-- 이미지는 inline요소라서 margin auto가안먹힘 -->
					<img alt="logo" src="/images/LE BLANC_blog horizontal.jpg">
				</div>
				<form id="login-form" action="login.layla" method="post">
					<p class="welcom-msg flex-center">
					<span > ${welcomeLog} </span> <!-- LoginService에있는 logMsg의 value값을 가져옴 -->
					</p>
					<!-- value는 쿠키중에서 키값이 userID인걸 뽑아오는것 -->
					<input type="text" name="email" placeholder="  ID" value="${cookie.userID.value}">
					<input type="password" name="pass" placeholder="  PASSWORD" value="${cookie.userPW.value}">
					<p class="logMsg"> 
					<span > ${logMsg} </span> <!-- LoginService에있는 logMsg의 value값을 가져옴 -->
					</p>
					<input type="submit" value="LOGIN">

					<!-- cookie에 저장된 userID가 비어있으면 when을 저장. -->
					
					<c:choose>
						<c:when test="${empty cookie.userID}">
							<!-- 체크박스도 정보를 넘겨줘야할 타입임 -->
							<input type="checkbox" name="idSave">&nbsp;아이디저장
						</c:when>
						<c:otherwise>
							<!-- checked되어있을때 -->
							<input type="checkbox" name="idSave" checked>&nbsp;아이디저장
						</c:otherwise>
					</c:choose>
				</form>
				
				<div>
				<a href="join.jsp"> 회원가입 </a>
				</div>
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