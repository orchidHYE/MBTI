package com.pro.mbti.infp.domain.board;

import java.util.Date;

public class INFPBoardDTO {
	
	private int infpBoardNo;
	private String memberNick;
	private String infpBoardTitle;
	private String infpBoardDetail;
	private String infpBoardFile;
	private Date infpBoardDate;
	private int infpBoardHit;
	private int infpBoardLike;
	
	public INFPBoardDTO() {};
	
	public INFPBoardDTO(int infpBoardNo, String memberNick, String infpBoardTitle, String infpBoardDetail,
			String infpBoardFile, Date infpBoardDate, int infpBoardHit, int infpBoardLike) {
		this.infpBoardNo = infpBoardNo;
		this.memberNick = memberNick;
		this.infpBoardTitle = infpBoardTitle;
		this.infpBoardDetail = infpBoardDetail;
		this.infpBoardFile = infpBoardFile;
		this.infpBoardDate = infpBoardDate;
		this.infpBoardHit = infpBoardHit;
		this.infpBoardLike = infpBoardLike;
	}
	
	public int getInfpBoardNo() {
		return infpBoardNo;
	}
	public void setInfpBoardNo(int infpBoardNo) {
		this.infpBoardNo = infpBoardNo;
	}
	public String getMemberNick() {
		return memberNick;
	}
	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}
	public String getInfpBoardTitle() {
		return infpBoardTitle;
	}
	public void setInfpBoardTitle(String infpBoardTitle) {
		this.infpBoardTitle = infpBoardTitle;
	}
	public String getInfpBoardDetail() {
		return infpBoardDetail;
	}
	public void setInfpBoardDetail(String infpBoardDetail) {
		this.infpBoardDetail = infpBoardDetail;
	}
	public String getInfpBoardFile() {
		return infpBoardFile;
	}
	public void setInfpBoardFile(String infpBoardFile) {
		this.infpBoardFile = infpBoardFile;
	}
	public Date getInfpBoardDate() {
		return infpBoardDate;
	}
	public void setInfpBoardDate(Date infpBoardDate) {
		this.infpBoardDate = infpBoardDate;
	}
	public int getInfpBoardHit() {
		return infpBoardHit;
	}
	public void setInfpBoardHit(int infpBoardHit) {
		this.infpBoardHit = infpBoardHit;
	}
	public int getInfpBoardLike() {
		return infpBoardLike;
	}
	public void setInfpBoardLike(int infpBoardLike) {
		this.infpBoardLike = infpBoardLike;
	}

	@Override
	public String toString() {
		return "InfpBoardDTO [infpBoardNo=" + infpBoardNo + ", memberNick=" + memberNick + ", infpBoardTitle="
				+ infpBoardTitle + ", infpBoardDetail=" + infpBoardDetail + ", infpBoardFile=" + infpBoardFile
				+ ", infpBoardDate=" + infpBoardDate + ", infpBoardHit=" + infpBoardHit + ", infpBoardLike="
				+ infpBoardLike + "]";
	}
	
}
