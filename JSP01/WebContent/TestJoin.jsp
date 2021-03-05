<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="haha"> <!-- 루트'/'를 빼고 쓰면, 현재잇는 폴더에서 실행한다는의미. -->
			<p> 
			<input type="text" name="name" placeholder="이름" >
			</p>
			<p>
			<input type="text" name="subject" placeholder="제목" >
			</p>
			<p>
			<input type="text" name="content" placeholder="내용" >
			</p>
			<p>
			<input type="text" name="counter" placeholder="조회수" >
			</p>
			<p>
			<input type="submit" value="등록" >
			</p>
		</form>
</body>
</html>