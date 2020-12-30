<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		ul{
			list-style: none;
			margin:0;
			padding: 0;
			display: flex;
			min-width: 500px;
		}
		li{
			border: 1px solid #e9e9e9;
			border-left: none;
			border-top: none;
		}
		li:first-child {
			width: 40px;
			border-left: 1px solid #e9e9e9;
		}
		li:nth-of-type(2) {
			width: 200px;
		}
		li:nth-of-type(3) {
			width: 60px;
		}
		li:nth-of-type(4) {
			width: 100px;
		}
		li:last-child {
			width: 100px;
		}
		ul:first-child	li {
			border-top: 1px solid #e9e9e9;
		}
		
		
}
	</style>
</head>
<body>
	<jsp:include page="/common/menu.jsp" />
	<h1>게시판페이지입니다.</h1>
	<div>
		<a href="write.jsp">글쓰기</a>
	</div>
	<section>
		<ul>
			<li>NO</li>
			<li>제목</li>
			<li>조회수</li>
			<li>작성자</li>
			<li>작성일</li>
		</ul>
		<c:forEach var="dto" items="${list }">
		<ul>
			<li>${dto.no }</li>
			<li><a href="detail.bo?no=${dto.no }">${dto.subject }</a></li>
			<li>${dto.count }</li>
			<li>${dto.writer }</li>
			<li>${dto.regdate.toLocalDate() }</li>
		</ul>
		</c:forEach>
	
	</section>
</body>
</html>