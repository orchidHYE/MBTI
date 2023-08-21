<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title>INTJ게시판</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script src="../resources/intj/js/INTJBoard.js"></script>
<link rel="stylesheet" href="../resources/intj/css/INTJBoardCss.css"/>
</head>
<body>
	<form id="insertINTJList" action="INTJBoard" method="POST">
<div class="board_wrap">
 	<div class="board_title">
	  <Strong style="font-size: 30px;">INTJ 게시판</Strong>
	</div>
	<input type="hidden" value="${MemberServiceImpl.loginMember}" name="memberId">
		<div>
		<div class ="board_list_wrap">
		 <div class = "board_list">
		  <div class ="top">
				<div class = "num">번호</div>
				<div class = "writer">글쓴이</div>
				<div class = "title">제목</div>
				<div class = "date">등록일</div>
				<div class = "like">추천</div>
				<div class = "count">조회</div>
		</div>
		</div>
		<div class = "board_list">
		<div class = "middle">
		<c:forEach items="${INTJList}" var="INTJList">
				<div class = "num">${INTJList.INTJBoardNo}</div>
				<div class = "writer">${INTJList.memberNick}</div>
				<div class = "title"><a href="${cPath}/intj/INTJDetail?INTJBoardNo=${INTJList.INTJBoardNo}">${INTJList.INTJBoardTitle}</a></div>
				<div class = "date">
				<fmt:formatDate value="${INTJList.INTJBoardDate}" pattern="yyyy-MM-dd HH:mm:ss"/></div>
				<div class = "like">${INTJList.INTJBoardLike}</div>
				<div class = "count">${INTJList.INTJBoardHit}</div>
				<div class = "board_list"></div>
		</c:forEach>
		</div>
		</div>
		<div class="board_page">
			<a href="#" class="bt first"></a>
			<a href="#" class="bt prev"></a>
			<a href="#" class="num on">1</a>
			<a href="#" class="num">2</a>
			<a href="#" class="num">3</a>
			<a href="#" class="num">4</a>
			<a href="#" class="num">5</a>
			<a href="#" class="bt next"></a>
			<a href="#" class="bt last"></a>
		</div>
			<div class="bt_wrap"></div>
		

		<div>
			
			<input type="button" id="intjwrite" name="intjwrite" onclick="location.href='./INTJWrite'" value="글쓰기">
			</div>
			</div>
			
		</div>
		</div>
	</form>

</body>
</html>