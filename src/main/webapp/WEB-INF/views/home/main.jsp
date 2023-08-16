<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script src="../resources/home/js/main.js"></script>
</head>
<body>
<form id="mainForm" action="main" method="POST">
	<h2>메인화면 폼</h2>
		<div>
			<input type="button" id="loginBtn" onclick="location.href='../member/login'" value="로그인하러가기" />
		</div>
		
<!-- 여기서부터 아래는 누르면 각자의 게시판으로 가는 버튼인데, #은 본인이 만든걸로 바꿔주세용. 제꺼 만들면서 같이 만들어놨어요*^0^* -->
		<div>
			<input type="button" id="INTJBtn"  onclick="location.href='../intj/INTJBoard'" value="INTJ" />
		</div>

		<div>
			<input type="button" id="ISTPBtn" onclick="location.href='#'" value="ISTP" />
		</div>

		<div>
			<input type="button" id="INFPBtn" onclick="location.href='#'" value="INFP" />
		</div>
</form>
</body>
</html>