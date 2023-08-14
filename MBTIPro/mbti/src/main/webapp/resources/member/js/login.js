$(document).ready(function(){
	$("#loginBtn").on("click",function(){
		let memberidObjV = $("#memberId").val();
		if(memberidObjV ==""){
			alert("아이디를 입력해주세요.");
			$("#memberId").focus();
			return;
		}
		
		let memberPwObjV = $("#memberPw").val();
		if(memberPwObjV ==""){
			alert("비밀번호를 입력해주세요.");
			$("#memberPw").focus();
			return;
		}
		$("#memberloginForm").submit();
	})
});