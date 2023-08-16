<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<h2>회원가입 폼</h2>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script src="../resources/member/js/join.js"></script>
</head>
<body>
	<form id="memberJoinForm" action="join" method="post">
		<div>
			<input type="text" id="memberNick" name="memberNick" placeholder="닉네임" required="required">
		</div>
		<div>
			<input type="text" id="memberId" name="memberId" placeholder="아이디" required="required">
		</div>
		<div>
			<input type="password" id="memberPw" name="memberPw" placeholder="비밀번호" required="required">
		</div>
		<div>
			<input type="text" id="memberName" name="memberName" placeholder="이름" required="required">
		</div>
		<div>
			<input type="text" id="memberDate" name="memberDate" placeholder="생년월일" required="required">
		</div>
		<div>
			<input type="text" id="memberTel" name="memberTel" placeholder="전화번호" required="required">
		</div>
		<div>
			<input type="text" id="memberMail" name="memberMail" placeholder="메일" required="required">
		</div>

		<div>
			<input type="button" id="joinBtn" value="가입">
		</div>
	</form>

</body>
</html>