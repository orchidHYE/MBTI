package com.pro.mbti.istp.comment.domain;

import java.util.Date;

public class ISTPCommentDTO {
	private int ISTPCommentNo; //댓글번호
	private int ISTPBoardNo; //게시글번호
	private String ISTPCommentId; //댓글작성자id
	private String ISTPCommentDetail; //댓글내용
	private Date ISTPCommentDate; //댓글 작성일자
	
	public ISTPCommentDTO() {}

	public ISTPCommentDTO(int iSTPCommentNo, int iSTPBoardNo, String iSTPCommentId, String iSTPCommentDetail,
			Date iSTPCommentDate) {
		super();
		ISTPCommentNo = iSTPCommentNo;
		ISTPBoardNo = iSTPBoardNo;
		ISTPCommentId = iSTPCommentId;
		ISTPCommentDetail = iSTPCommentDetail;
		ISTPCommentDate = iSTPCommentDate;
	}

	public int getISTPCommentNo() {
		return ISTPCommentNo;
	}

	public void setISTPCommentNo(int iSTPCommentNo) {
		ISTPCommentNo = iSTPCommentNo;
	}

	public int getISTPBoardNo() {
		return ISTPBoardNo;
	}

	public void setISTPBoardNo(int iSTPBoardNo) {
		ISTPBoardNo = iSTPBoardNo;
	}

	public String getISTPCommentId() {
		return ISTPCommentId;
	}

	public void setISTPCommentId(String iSTPCommentId) {
		ISTPCommentId = iSTPCommentId;
	}

	public String getISTPCommentDetail() {
		return ISTPCommentDetail;
	}

	public void setISTPCommentDetail(String iSTPCommentDetail) {
		ISTPCommentDetail = iSTPCommentDetail;
	}

	public Date getISTPCommentDate() {
		return ISTPCommentDate;
	}

	public void setISTPCommentDate(Date iSTPCommentDate) {
		ISTPCommentDate = iSTPCommentDate;
	}

	@Override
	public String toString() {
		return "ISTPCommentDTO [ISTPCommentNo=" + ISTPCommentNo + ", ISTPBoardNo=" + ISTPBoardNo + ", ISTPCommentId="
				+ ISTPCommentId + ", ISTPCommentDetail=" + ISTPCommentDetail + ", ISTPCommentDate=" + ISTPCommentDate
				+ "]";
	}

}
