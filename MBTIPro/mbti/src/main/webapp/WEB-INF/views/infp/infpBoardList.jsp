<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="cPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>INFP Board List</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script>
</script>
</head>
<body>
	<div class="container">
	<h2 class="mt-5 mb-4">INFP Board</h2>
		<div>총 게시글 수 : ${boardPage.total}		/			현재 페이지 :  ${nowPage}</div>
		<table class="table table-hover">
			<thead class="thead-light">
				<tr>
					<th scope="col">번호</th>
					<th scope="col">제목</th>
					<th scope="col">작성자</th>
					<th scope="col">작성날짜</th>
				</tr>
			</thead>
		<tbody>
				<%-- <c:if test="게시글 없다">게시글이 없는 경우 --%>
			<c:if test="${boardPage.hasNoArticles()}">
				<tr>
					<td colspan="4">게시글이 존재하지 않습니다. 첫번째 작성자가 되어보세요.</td>
				</tr>
				</c:if> 
			<%-- <c:forEach></c:forEach> 반복문 이용 1페이지당 출력할 게시글 수 만큼 반복 출력 시작 --%>
			<%-- <c:forEach var="변수명" items="배열명 또는 컬렉션명"> --%>	
				<c:forEach var="board" items="${boardPage.content}"> 
				<tr>
					<td>${board.number}</td>
					<td><a href="read.do?no=${board.number}&pageNo=${nowPage}">${board.title}</a></td>
					<td>${board.writerId}</td>
					<td>${board.writeDate}</td>
				</tr>
				</c:forEach>
				<tr>
					<td colspan="4" ><a href="<%=request.getContextPath() %>/board/write.do" class="btn btn-outline-dark btn-sm">게시판 글쓰기</a></td>
				</tr>
			<%--<c:forEach></c:forEach> 반복문 이용 내용출력 끝 --%>
		</tbody>
		</table>
		<%--pagenation 출력 부분 --%>
		<%-- <c:if> 이용하여 노출여부가 달라짐 --%>
		<!--  nav 요소를 이용하여 pagenation을 감싼다 -->
 		<nav aria-label="Page navigation" >
		  <ul class="pagination justify-content-center" style="margin:0 0">
			<c:if test="${boardPage.startPage>5}">
  		      <li class="page-item"><a class="page-link" href="list.do?pageNo=${boardPage.startPage-5}">&lt;&lt;pre</a></li>
			</c:if>		
			<c:forEach var="pNo" begin="${boardPage.startPage}" end="${boardPage.endPage}" step="1">
  		     <li class="page-item"><a class="page-link" href="list.do?pageNo=${pNo}">${pNo}</a></li>
			</c:forEach>			
			<c:if test="${boardPage.endPage<boardPage.totalPages}">
  		     <li class="page-item"><a class="page-link" href="list.do?pageNo=${boardPage.startPage+5}">next&gt;&gt;</a></li>
			</c:if> 
  		  </ul>		
		</nav>
	</div>	
</body>
</html>