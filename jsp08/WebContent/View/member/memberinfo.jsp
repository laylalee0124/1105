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
		<h1>메인 컨텐츠</h1>
		<div>
			<ul>
				<li>
					<div>No값표현</div> <!-- MemberInfoService의 process()에 mInfo로 저장해놓은 값을 받아옴 -->
					<!-- MemberInfoService implements MemberService안의 MemberDAO 객체가 있어서 no값을 가져올수있음 -->
					<div>${mInfo.no}</div>
				</li>
				<li>
					<div>name</div>
					<div>${mInfo.name}</div>
				</li>
				<li>
					<div>email</div>
					<div>${mInfo.email}</div>
				</li>
				<li>
					<div>password</div>
					<div>
						<input type="password" value=${mInfo.pass } readonly></div>
				</li>
				<li>
					<div>ip</div>
					<div>${mInfo.ip}</div>
				</li>
				<li>
					<div>regdate</div>
					<div>${mInfo.regdate}</div>
				</li>
				<li>

					<div>
						<button type="button" onclick="">비번수정</button>
						<button type="button" onclick="">회원탈퇴</button>

					</div>
				</li>
			</ul>
			<script type="text/javascript">
				function bttn_edit_pass() {
					alert("버튼클릭");
				}
			</script>
		</div>
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