<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script src="../resources/intj/js/INTJWrite.js"></script>
</head>
<body>
	<form id="INTJBoardListForm" action="INTJWrite" method="POST">
		<label>제목</label>
		<input type ="text" id="title" name="title"><br/>
		<label>작성자</label>
		<input type ="text" id="" name=""><br/>
		<label>내용</label>
		<input type ="text" id="" name=""><br/>
	</form>
</body>
</html>