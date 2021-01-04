<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<!-- 메뉴파일을 jsp:include로 쓰기위한 설정 -->
<script src="/JavaScript/jquery-3.5.1.min.js"></script>

<!-- CSS를 External로 사용하기위한 설정 -->
<link rel="stylesheet" href="/css/mystyle.css">
<link rel="stylesheet" href="/css/mystyle-memberInfo.css">


<title>LE BLANC</title>
</head>


<body>
	<div class="top-wrap">
		<!-- 단일태그로 사용 -->
		<jsp:include page="/View/common/header.jsp" />
	</div>
	<main class="m_v">
		<h1>메인 컨텐츠</h1>
		<div class="content-wrap ">
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
						<input id="pass" type="password" value="${mInfo.pass}" disabled>
					</div>
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
			</ul>


			<div class="btn colspan-2">
				<button type="button" onclick="btn_edit_pass()">비밀번호 수정</button>
				<button type="button" onclick="btn_delete()">회원탈퇴</button>
			</div>
			<div class="btn editClicked">
				<button type="button" onclick="editRun()">수정완료</button>
			</div>
			
			<script type="text/javascript">
			
				// 회원 탈퇴 버튼 동작
				function btn_delete(){
				var result=confirm("정말로 삭제하시겟습니까?");
				//alert(result);
				if(result){
					locatoin.href="./delete.me?no="+${mInfo.no} } /*no넘버를 가지고 가야 어떤정보를 삭제할지알수있다 */
				}
				
				// 비밀번호 수정 버튼 동작
				function btn_edit_pass(){
					$("#pass").attr("disabled", false); /* id가 pass인 요소에 disabled속성을 추가하고 false값을 부여한다 = 수정가능하게해준다 */
					$("div.btn.colspan-2").hide(); 		/* div tag안에 btn 안에 colspan-2 를 지정해서 .hide()시킴 */
					$("div.btn.editClicked").css("display","flex");
				}
				
				// 수정완료 버튼 동작
				function editRun(){
					var pw=$("#pass").val();
					$.post(
						"/View/member/editPass.me",
						{
						pass: pass, 
						no : ${mInfo.no }
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