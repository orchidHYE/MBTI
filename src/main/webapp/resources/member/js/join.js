$(document).ready(function(){
	$("#joinBtn").on("click",function(){
		let memberNickObjV = $("#memberNick").val();
		if(memberNickObjV ==""){
			alert("NickName은 필수입력입니다");
			$("#memberNick").focus();
			return;
		}
		let memberidObjV = $("#memberId").val();
		if(memberidObjV ==""){
			alert("id는 필수입력입니다");
			$("#memberId").focus();
			return;
		}
		let memberPwObjV = $("#memberPw").val();
		if(memberPwObjV ==""){
			alert("password는 필수입력입니다");
			$("#memberPw").focus();
			return;
		}	
		let memberNameObjV = $("#memberName").val();
		if(memberNameObjV ==""){
			alert("이름은 필수입력입니다");
			$("#memberName").focus();
			return;
		}	
		let memberDateObjV = $("#memberDate").val();
		if(memberDateObjV ==""){
			alert("생년월일은 필수입력입니다");
			$("#memberDate").focus();
			return;
		}	
		let memberTelObjV = $("#memberTel").val();
		if(memberTelObjV ==""){
			alert("전화번호는 필수입력입니다");
			$("#memberTel").focus();
			return;
		}	
		let memberMailObjV = $("#memberMail").val();
		if(memberMailObjV ==""){
			alert("이메일은 필수입력입니다");
			$("#memberMail").focus();
			return;
		}	
		$("#memberJoinForm").submit();
	})
});