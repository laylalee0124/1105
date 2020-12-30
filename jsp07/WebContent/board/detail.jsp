<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="/jsp07/js/jquery-3.5.1.min.js"></script>
	<style type="text/css">
		ul{
			/* list-style: none;
			padding: 0; */
			display: table;
			border-collapse: collapse;
		}
		li{
			display: table-row;
		}
		li>div{
			display: table-cell;
			border: 1px solid #e9e9e9;
		}
	</style>
</head>
<body>
	<jsp:include page="/common/menu.jsp" />
	<ul>
		
		<li>
			<div>NO</div>
			<div>${detail.no }</div>
		</li>
		<li>
			<div>작성일</div>
			<div>${detail.regdate }</div>
		</li>
		<li>
			<div>작성자</div>
			<div>${detail.writer }</div>
		</li>
		<li>
			<div>제목</div>
			<div class="default-item">${detail.subject }</div>
			<div class="edit-item">
				<input id="subject" value="${detail.subject }">
			</div>
		</li>
		<li>
			<div>내용</div>
			<div class="default-item">${detail.content }</div>
			<div class="edit-item">
				<textarea id="content" rows="5" cols="50">${detail.content }</textarea>
			</div>
		</li>
		<li>
			<div class="default-item">
				<button type="button" id="btn_edit">수정</button>
				<button type="button" id="btn_del">삭제</button>
			</div>
			<div class="edit-item">
				<button type="button" id="btn-edit-done">수정완료</button>
			</div>
		</li>
	</ul>
	
	<script type="text/javascript">
	
		$(function(){
			//페이지 로딩시 처리
			$(".edit-item").hide();
			$("#btn-edit-done").click(function(){
				//서버에 전송할 데이터
				var subject=$("#subject").val();
				var content=$("#content").val();
				
				$.post(
						"edit.bo",
						{
							subject : subject, 
							content : content, 
							no : ${detail.no} 
						},
						function(){
							location.href="index.bo";
						}
				);
				
			});
			
			//수정버튼 클릭 이벤트
			$("#btn_edit").click(function(){
				//수정할수 있는환경으로 디자인 변경
				$(".default-item").hide();
				$(".edit-item").show();
				
			});
			
			//삭제버튼 클릭 이벤트
			$("#btn_del").click(function(){
				
			});
		});
		
		
	</script>
	
</body>
</html>