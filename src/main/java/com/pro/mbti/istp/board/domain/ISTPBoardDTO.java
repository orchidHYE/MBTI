package com.pro.mbti.istp.board.domain;

import java.util.Date;

public class ISTPBoardDTO {
	private int ISTPBoardNo; //글번호
	private String memberNick; //회원 닉네임
	private String ISTPBoardTitle; //글제목
	private String ISTPBoardDetail; //글내용
	private String ISTPBoardFile; //첨부파일
	private Date ISTPBoardDate; //글 등록일
	private int ISTPBoardHit; //조회수
	private int ISTPBoardLike; //추천수
	
	public ISTPBoardDTO() {}

	public ISTPBoardDTO(int iSTPBoardNo, String memberNick, String iSTPBoardTitle, String iSTPBoardDetail,
			String iSTPBoardFile, Date iSTPBoardDate, int iSTPBoardHit, int iSTPBoardLike) {
		ISTPBoardNo = iSTPBoardNo;
		this.memberNick = memberNick;
		ISTPBoardTitle = iSTPBoardTitle;
		ISTPBoardDetail = iSTPBoardDetail;
		ISTPBoardFile = iSTPBoardFile;
		ISTPBoardDate = iSTPBoardDate;
		ISTPBoardHit = iSTPBoardHit;
		ISTPBoardLike = iSTPBoardLike;
	}

	public int getISTPBoardNo() {
		return ISTPBoardNo;
	}

	public void setISTPBoardNo(int iSTPBoardNo) {
		ISTPBoardNo = iSTPBoardNo;
	}

	public String getMemberNick() {
		return memberNick;
	}

	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}

	public String getISTPBoardTitle() {
		return ISTPBoardTitle;
	}

	public void setISTPBoardTitle(String iSTPBoardTitle) {
		ISTPBoardTitle = iSTPBoardTitle;
	}

	public String getISTPBoardDetail() {
		return ISTPBoardDetail;
	}

	public void setISTPBoardDetail(String iSTPBoardDetail) {
		ISTPBoardDetail = iSTPBoardDetail;
	}

	public String getISTPBoardFile() {
		return ISTPBoardFile;
	}

	public void setISTPBoardFile(String iSTPBoardFile) {
		ISTPBoardFile = iSTPBoardFile;
	}

	public Date getISTPBoardDate() {
		return ISTPBoardDate;
	}

	public void setISTPBoardDate(Date iSTPBoardDate) {
		ISTPBoardDate = iSTPBoardDate;
	}

	public int getISTPBoardHit() {
		return ISTPBoardHit;
	}

	public void setISTPBoardHit(int iSTPBoardHit) {
		ISTPBoardHit = iSTPBoardHit;
	}

	public int getISTPBoardLike() {
		return ISTPBoardLike;
	}

	public void setISTPBoardLike(int iSTPBoardLike) {
		ISTPBoardLike = iSTPBoardLike;
	}

	@Override
	public String toString() {
		return "ISTPBoardDTO [ISTPBoardNo=" + ISTPBoardNo + ", memberNick=" + memberNick + ", ISTPBoardTitle="
				+ ISTPBoardTitle + ", ISTPBoardDetail=" + ISTPBoardDetail + ", ISTPBoardFile=" + ISTPBoardFile
				+ ", ISTPBoardDate=" + ISTPBoardDate + ", ISTPBoardHit=" + ISTPBoardHit + ", ISTPBoardLike="
				+ ISTPBoardLike + "]";
	}
	
}
