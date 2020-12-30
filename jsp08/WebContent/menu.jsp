<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<header class="m_w flex-col-center top">
	<div class=top>
	<nav>
		<br>
		<br>
		<a href="/jsp07">HOME</a>
		<a href="/jsp07/member/reg.jsp">회원가입</a>
		<%--<c:choose>
			<c:when test="${empty login}">
				<a href="/jsp07/member/login.jsp">로그인</a>
			</c:when>
			<c:otherwise>
				<span>${login.name}</span>
				<a href="/jsp07/member/logout.me">로그아웃</a>
			</c:otherwise>
		</c:choose> --%>
		<a href="/jsp07/board/index.bo">게시판</a>
		<a href="/jsp07/board/index2.bo">LAYLA 톡톡talk!</a>
		<a href="/jsp07/member/etc/test.jsp">테스트</a>
		<br>
		<br>
		<hr>
	</nav>
	</div>
</header>