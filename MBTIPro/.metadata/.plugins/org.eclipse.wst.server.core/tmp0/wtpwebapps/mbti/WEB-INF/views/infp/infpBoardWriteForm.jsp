<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="cPath" value="<%=request.getContextPath()%>"/>  
<!DOCTYPE html>
<html lang="ko">
<head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
 <title>INFPBoardWriteForm</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
 <script>
  //<input type="file" name="imageFileName" id="imageFileName"  class="form-control-file" onchange="readURL(this);"/>
  //file을 선택하면 호출되는 메서드
  //매개변수 obj에는 이벤트가 발생한 객체=>change이벤트가 발생한 input요소객체 저장된다
  function readURL(obj){
	  if (obj.files && obj.files[0]) { //파일이 있드면
	         var reader = new FileReader(); //FileReader()객체생성
	         reader.onload = function (e) {
	        	 //id가 preview인 요소의 src속성값을 설정 =>img src속성값을 파일명으로 적용
	             $('#preview').attr('src', e.target.result);
	         }
	         reader.readAsDataURL(obj.files[0]);
	  } 
  }
 </script>
</head>
<body>
 <%-- WriteBoardController에의해 아래와 같이 모델받을 예정??
 		User user = new User("hongid","1234");
		session.setAttribute("AUTH_USER", user); --%>	 
user=${user.nickname}
 <!-- 내용 -->		    
 <div class="container">
     <!-- page title -->
	 <h2  class="mt-4 mb-3 text-center">게시글 등록</h2>
	 <form action="write" method="post"  enctype="multipart/form-data">
	  <div  class="mb-1">	
	  	<label for="writerName" class="form-label">작성자</label>
	  	<input type="text" name="writerName" id="writerName" class="form-control" value="${user.nickname}"/>
		<%--  <c:if test="${errors.}"><br/><span class="error">작성자를 입력하세요</span></c:if>  --%>
	  </div>
	  <div  class="mb-1">	
	  	<label for="title"  class="form-label">제목</label>
	  	<input type="text" name="title" id="title"  class="form-control" />
	  	 <%-- <c:if test="${errors.title}"><br/><span class="error">제목을 입력하세요</span></c:if> --%>
	  </div>
	  <div  class="mb-1">	
	  	<label for="content"  class="form-label">내용</label>
	  	<textarea name="content" id="content" class="form-control"  rows="5" cols="30"></textarea>
	  	<%-- <c:if test="${errors.content}"><br/><span class="error">내용을 입력하세요</span></c:if> --%>
	  </div>
	  <div  class="mb-1">	
	  	<label for="imageFileName"  class="form-label">이미지</label>
	  	<input type="file" name="imageFileName" id="imageFileName"  class="form-control-file" onchange="readURL(this);"/>
	  	 <%-- <c:if test="${errors.title}"><br/><span class="error">제목을 입력하세요</span></c:if> --%>
	  	<img src="#" id="preview" style="width:150px;"/> 
	  </div>
	  <div>
	 	<button  type="submit" class="btn btn-primary">글쓰기(java용)</button>
	 	<button  type="reset"  class="btn">취소</button>
	  </div> 
	 </form>
 </div>
</body>
</html>