<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form id="INTJBoardReadForm" action="read" method="post">
		<table>
		<tbody>
			<tr>
				<td>
					<label for="no">글 번호</label><input type="text" id="no" name="no" value="${read.INTJBoardNo}"/>
				</td>
			</tr>	
			<tr>
				<td>
					<label for="title">제목</label><input type="text" id="title" name="title" value="${read.INTJBoardTitle}"/>
				</td>
			</tr>	
			<tr>
				<td>
					<label for="content">내용</label><textarea id="content" name="content"><c:out value="${read.INTJBoardDetail}" /></textarea>
				</td>
			</tr>
			<tr>
				<td>
					<label for="writer">작성자</label><input type="text" id="writer" name="writer" value="${read.memberNick}" />
				</td>
			</tr>
			<tr>
				<td>
					<label for="Date">작성날짜</label>
					<fmt:formatDate value="${read.INTJBoardDate}" pattern="yyyy-MM-dd"/>					
				</td>
			</tr>		
		</tbody>			
	</table>
	</form>
</body>
</html>