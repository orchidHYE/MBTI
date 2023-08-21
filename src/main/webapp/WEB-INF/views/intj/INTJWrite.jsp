<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<link rel="stylesheet" href="../resources/intj/css/INTJWriteCss.css"/>
<script src="../resources/intj/js/INTJWrite.js"></script>
</head>
<body>
	<form id="INTJBoardWriteForm" action="INTJWrite" method="POST" enctype="multipart/form-data">
		<div class="board_wrap">
			<div class=" board_title">
				<strong>INTJ게시판</strong>
			</div>
			<div class="board_write_wrap">
			<div class="board_write">
			<div class="title">
				<dl>
					<dt>제목</dt>
					<dd><input type="text" id="title" name="title" /></dd>
				</dl>
			</div>
			
			<div class="info">
				<dl>
					<dt>작성자</dt>
					<dd><input type="text" id="writerName" name="writerName" value="${AUTH_USER.nickname}"/></dd>
				</dl>
				<dl>	
					<dt>첨부파일</dt>
					<dd><input type="file" multiple="multiple" name="file"/></dd>
				</dl>
			</div>
			
			<div class="cont">
				<textarea id="detail" placeholder="내용 입력" name="detail"></textarea>
			</div>
		  </div>
		  <div class="bt_wrap">
		 		<input type="submit" id="WriteBtn" name="WriteBtn" value="등록" />
		 		<input type="button" id="W" name="" value="취소" />
		  </div>
		</div>
	</div>
  </form>
 </body>
</html>