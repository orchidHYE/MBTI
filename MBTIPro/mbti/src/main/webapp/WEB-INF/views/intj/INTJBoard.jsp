<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INTJ게시판</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script src="../resources/intj/js/INTJBoard.js"></script>
</head>
<body>
	<form id="insertINTJWrite" action="INTJBoard" method="POST">
	<input type="hidden" value="${MemberServiceImpl.loginMember}" name="memberId">
		<table>
			<thead>
				<tr>
					<td>번호</td>
					<td>글쓴이</td>
					<td>제목</td>
					<td>등록일</td>
					<td>추천</td>
					<td>조회</td>
				</tr>
			</thead>

			<tbody>
				<tr>
					<c:forEach items="${INTJBoard}" var="INTJBoard">
						<tr>
							<td>"${INTJBoard.INTJBoardNo}</td>
							<td>"${INTJBoard.memberNick}</td>
							<td>"${INTJBoard.INTJBoardTitle}</td>
							<td>"${INTJBoard.INTJBoardDate}</td>
							<td>"${INTJBoard.INTJBoardLike}</td>
							<td>"${INTJBoard.INTJBoardHit}</td>
					</c:forEach>
				</tr>
			</tbody>
		</table>

		<div>
			<input type="button" id="intjwrite" name="intjwrite" onclick="location.href='./INTJWrite'" value="글쓰기">
		</div>
	</form>

</body>
</html>