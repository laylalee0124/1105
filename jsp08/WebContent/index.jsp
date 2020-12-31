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
		<jsp:include page="/View/common/header.jsp" />
	</div>
	<main class="m_v">
	<h1>메인컨텐츠</h1>
		<div>메인영역</div>
	</main>
	
	<footer class="m_v">
		<h1>회사정보</h1>
		<div>
			푸터영역
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