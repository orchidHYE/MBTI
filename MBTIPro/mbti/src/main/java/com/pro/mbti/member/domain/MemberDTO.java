package com.pro.mbti.member.domain;

import java.util.Date;

public class MemberDTO {
	private String memberNick;
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberDate;
	private String memberTel;
	private String memberMail;
	
	public MemberDTO() {
	}

	public MemberDTO(String memberNick, String memberId, String memberPw, String memberName, String memberDate,
			String memberTel, String memberMail) {
		this.memberNick = memberNick;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberDate = memberDate;
		this.memberTel = memberTel;
		this.memberMail = memberMail;
	}

	public String getMemberNick() {
		return memberNick;
	}

	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberDate() {
		return memberDate;
	}

	public void setMemberDate(String memberDate) {
		this.memberDate = memberDate;
	}

	public String getMemberTel() {
		return memberTel;
	}

	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}

	public String getMemberMail() {
		return memberMail;
	}

	public void setMemberMail(String memberMail) {
		this.memberMail = memberMail;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberNick=" + memberNick + ", memberId=" + memberId + ", memberPw=" + memberPw
				+ ", memberName=" + memberName + ", memberDate=" + memberDate + ", memberTel=" + memberTel
				+ ", memberMail=" + memberMail + "]";
	}

	
	
	
	
}
