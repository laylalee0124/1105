<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- HTML 웹페이지에서 정보받아서 서버에 등록을 요청.-->
	<!-- 중요한 정보라면 doGet말고 doPost를 활용해야함. -->
	<form action="reg"> <!-- 루트'/'를 빼고 쓰면, 현재잇는 폴더에서 실행한다는의미. -->
		<p> 
		<input type="text" name="name" placeholder="이름" >
		</p>
		<p>
		<input type="text" name="sal" placeholder="급여" >
		</p>
		<p>
		<input type="submit" value="등록" >
		</p>
	</form>
	<!-- HTML 웹페이지에서 정보받아서 서버에 등록을 요청.있는 JSP의 doGet 멧서드로 넘어감.-->
</body>
</html>