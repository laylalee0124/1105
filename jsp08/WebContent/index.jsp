<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<!-- CSS를 External로 사용하기위한 설정 -->
<link rel="stylesheet" href="/css/mystyle.css">

<!-- 메뉴파일을 jsp:include로 쓰기위한 설정 -->
<script src="/JavaScript/jquery-3.5.1.min.js"></script>

<title>LE BLANC</title>
</head>


<body>
	<div class="top-wrap">
		<!-- 단일태그로 사용 -->
		<jsp:include page="menu.jsp" />
	</div>
	<main class="m_v">
		<div>메인영역</div>
	</main>
	<footer class="m_v">
		<div>footer</div>
	</footer>
	<header>
		<!-- //////////////////  메인메뉴  ///////////////////// -->
		<div>
			<ul class="flow-row">
				<li>products</li>
			</ul>
		</div>

		<!-- //////////////////  유저메뉴  ///////////////////// -->
		<section>
			<div>
				<a href="#">API메뉴</a> <input type="search" /> <a
					href="/View/member/Login.jsp"><button>로그인</button></a>
			</div>
		</section>

	</header>
</body>
</html>