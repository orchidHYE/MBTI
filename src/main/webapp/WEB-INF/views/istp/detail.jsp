<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cPath" value="<%=request.getContextPath() %>"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>${istpBoardDetail.ISTPBoardTitle }</title>
</head>
<body>
	${istpBoardDetail }
</body>
</html>