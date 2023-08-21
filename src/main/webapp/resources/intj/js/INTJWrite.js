$(document).ready(function(){
	$("#WriteBtn").on("click",function(){
		let titleObjV = $("#title").val();
		if(titleObjV ==""){
			alert("제목은 필수 입력입니다.")
			$("#title").focus();
			return;
		}
		let detailObjV = $("#detail").val();
		if(detailObjV ==""){
			alert("제목은 필수 입력입니다.")
			$("#detail").focus();
			return;
		}
		$("#INTJBoardWriteForm").submit();
	})
});