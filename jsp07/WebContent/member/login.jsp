<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		.msg{
			font-size: 8px;
			background-color: #0f0;
		}
		
	</style>
</head>
<body>
	<jsp:include page="/common/menu.jsp" />
	<h1>로그인페이지</h1>
	<form action="login.me" method="post">
		<P>
			<span class="msg" >${logMsg }</span>
		</P>
		<p>
		<input type="text" name="email" placeholder="아이디 또는 이메일"/>
		</p>
		<p>
		<input type="password" name="pass" placeholder="비밀번호"/>
		</p>
		<p>
		<input type="submit" value="로그인">
		</p>
	</form>
</body>
</html>