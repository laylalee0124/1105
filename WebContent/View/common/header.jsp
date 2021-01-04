<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- JSTL 사용을 위한 설정부분 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<!-- CSS를 External로 사용하기위한 설정 -->
<link rel="stylesheet" href="/css/mystyle.css">
<link rel="stylesheet" href="/css/mystyle-join.css">
</head>


<header class="headerstyle top-area flex-col-center">
	<h1>상단영역</h1>
	<div class="flex-between">
		<!-- /////////로고//////////////////////////////////////////////// -->
		<section>
			<h1>로고</h1>
			<div>
				<a href="/index.jsp">NAVER</a> <a href="/">Developers</a>
			</div>
		</section>
		<!-- /////////메인메뉴//////////////////////////////////////////////// -->
		<nav id="top-memu">
			<h1>메인메뉴</h1>
			<div>
				<ul class="flex-row">
					<li>Products</li>
					<li>Documents</li>
					<li>Application</li>
					<li>NAVER D2</li>
					<li>Support</li>
					<li>Forum</li>
				</ul>
			</div>

		</nav>
		<!-- /////////user메뉴//////////////////////////////////////////////// -->
		<section>
			<h1>user메뉴</h1>
			<div>
				<a href="#">API메뉴</a> <input type="search" />
				<c:choose>
					<c:when test="${empty logInfo}"> <!-- sessionScope는 생략하고 logInfo만 써도 된다. -->
						<a href="/View/member/login.jsp"><button>로그인</button></a>
					</c:when>
					<c:otherwise>
						<!-- 세션정보에서 이름을 가져와서 표현해주는 부분 -->
						<a href="/View/member/memberInfo.layla">${sessionScope.logInfo.name}</a>
						<a href="/View/member/logout.layla"><button>로그아웃</button></a>
					</c:otherwise>
				</c:choose>
			</div>
		</section>
	</div>
</header>