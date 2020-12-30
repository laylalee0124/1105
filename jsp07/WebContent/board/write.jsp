<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/common/menu.jsp" />
	<h1>글쓰기 페이지입니다.</h1>
	<form action="reg.bo" method="post">
		<p>
			<input type="text" name="subject" placeholder="제목입력"/>
		</p>
		<p>
			<textarea rows="5" cols="50" name="content" ></textarea>
		</p>
		<p>
			<input type="hidden" name="writer" value="guest">
		</p>
		<p>
			<input type="submit" value="등록">
		</p>
	</form>

</body>
</html>