package com.pro.mbti.intj.domain.board;

import java.util.Arrays;
import java.util.Date;

import com.pro.mbti.member.domain.MemberDTO;

public class INTJBoardDTO {
	private int INTJBoardNo;
	private String memberNick;
	private String INTJBoardTitle;
	private String INTJBoardDetail;
	private String[] INTJBoardFile;
	private Date INTJBoardDate;
	private int INTJBoardHit;
	private int INTJBoardLike;
	private MemberDTO memberDTO;
	
	public INTJBoardDTO() {
	}
	
	public void setMember(MemberDTO memberDTO) {
		this.memberDTO=memberDTO;
	}

	public INTJBoardDTO(int INTJBoardNo, String memberNick, String INTJBoardTitle, String INTJBoardDetail,
			String[] INTJBoardFile, Date INTJBoardDate, int INTJBoardHit, int INTJBoardLike, MemberDTO memberDTO) {
		this.INTJBoardNo = INTJBoardNo;
		this.memberNick = memberNick;
		this.INTJBoardTitle = INTJBoardTitle;
		this.INTJBoardDetail = INTJBoardDetail;
		this.INTJBoardFile = INTJBoardFile;
		this.INTJBoardDate = INTJBoardDate;
		this.INTJBoardHit = INTJBoardHit;
		this.INTJBoardLike = INTJBoardLike;
		this.memberDTO = memberDTO;
	}

	public MemberDTO getmemberDTO() {
		return memberDTO;
	}
	
	public int getINTJBoardNo() {
		return INTJBoardNo;
	}

	public void setINTJBoardNo(int INTJBoardNo) {
		this.INTJBoardNo = INTJBoardNo;
	}

	public String getMemberNick() {
		return memberNick;
	}

	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}

	public String getINTJBoardTitle() {
		return INTJBoardTitle;
	}

	public void setINTJBoardTitle(String INTJBoardTitle) {
		this.INTJBoardTitle = INTJBoardTitle;
	}

	public String getINTJBoardDetail() {
		return INTJBoardDetail;
	}
	
	public MemberDTO setmemberDTO() {
		return memberDTO;
	}

	public void setINTJBoardDetail(String INTJBoardDetail) {
		this.INTJBoardDetail = INTJBoardDetail;
	}

	public String[] getINTJBoardFile() {
		return INTJBoardFile;
	}

	public void setINTJBoardFile(String[] INTJBoardFile) {
		this.INTJBoardFile = INTJBoardFile;
	}

	public Date getINTJBoardDate() {
		return INTJBoardDate;
	}

	public void setINTJBoardDate(Date INTJBoardDate) {
		this.INTJBoardDate = INTJBoardDate;
	}

	public int getINTJBoardHit() {
		return INTJBoardHit;
	}

	public void setINTJBoardHit(int INTJBoardHit) {
		this.INTJBoardHit = INTJBoardHit;
	}

	public int getINTJBoardLike() {
		return INTJBoardLike;
	}

	public void setINTJBoardLike(int INTJBoardLike) {
		this.INTJBoardLike = INTJBoardLike;
	}

	@Override
	public String toString() {
		return "INTJBoardDTO [INTJBoardNo=" + INTJBoardNo + ", memberNick=" + memberNick + ", INTJBoardTitle="
				+ INTJBoardTitle + ", INTJBoardDetail=" + INTJBoardDetail + ", INTJBoardFile="
				+ Arrays.toString(INTJBoardFile) + ", INTJBoardDate=" + INTJBoardDate + ", INTJBoardHit=" + INTJBoardHit
				+ ", INTJBoardLike=" + INTJBoardLike + ", memberDTO=" + memberDTO + "]";
	}
	

	
	
	
}
