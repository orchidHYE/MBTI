<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cPath" value="<%=request.getContextPath() %>"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ISTP</title>
</head>
<body>
	<h1>istp 게시판</h1>
	${istpBoardList}
	
	<table id="ISTPBoardTable" border="1" class="">
	 	<thead>
	 		<tr>
	 			<th>번호</th>
	 			<th>제목</th>
	 			<th>작성일</th>
	 			<th>작성자</th>
	 			<th>조회수</th>
	 		</tr>
	 	</thead>
	 	<tbody>
	 	<%-- 게시글이 존재하지 않는 경우 --%>
	 	<c:if test="${empty istpBoardList }">
	 		<tr>
	 			<td colspan="5">게시글이 존재하지 않습니다.</td>
	 		</tr>
	 	</c:if>
	 	
	 	<%-- 게시글이 존재하는 경우, 게시글수만큼 반복 출력 --%>
	 	<c:if test="${not empty istpBoardList }">
	 		<c:forEach var="row" items="${istpBoardList }">
	 		<tr>
	 			<th>${row.ISTPBoardNo }</th>
	 			<th><a href="${cPath}/istp/detail?istpBoardNo=${row.ISTPBoardNo}">${row.ISTPBoardTitle}</a></th>
	 			<th>${row.ISTPBoardDate}</th>
	 			<th>${row.memberNick}</th>
	 			<th>${row.ISTPBoardHit}</th>
	 		</tr>
	 		</c:forEach>
	 	</c:if>
	 	</tbody>
	 </table>
</body>
</html>