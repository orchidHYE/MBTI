<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title>Insert title here</title>
<h2>로그인 폼 페이지</h2>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<link rel="stylesheet" href="../resources/intj/css/INTJBoardCss.css"/>
<script src="../resources/member/js/login.js"></script>
</head>
<body>
	<form id="memberloginForm" action="login" method="post">
 
		<div>
			<input type ="text" id="memberId" name="memberId"required="required" />
		</div>
		<div>	
			<input type ="password" id="memberPw" name="memberPw"required="required" />
		</div>
		
		<div>
			<input type="button" id="loginBtn" value="로그인"/>
		</div>
		</div>
	</form>
</body>
</html>