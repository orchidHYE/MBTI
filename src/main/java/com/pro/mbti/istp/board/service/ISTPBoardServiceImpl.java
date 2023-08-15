package com.pro.mbti.istp.board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.mbti.istp.board.domain.ISTPBoardDTO;
import com.pro.mbti.istp.board.repository.ISTPBoardRepositoryImpl;

@Service
public class ISTPBoardServiceImpl {
	
	@Autowired
	private ISTPBoardRepositoryImpl istpBoardRepositoryImpl;
	
	//게시판 게시판 목록 전체조회
	public List<HashMap<String, Object>> selectISTPBoardList () {
		List<HashMap<String, Object>> istpBoardList = istpBoardRepositoryImpl.selectISTPBoardList();
		return istpBoardList;
	}
	
	//게시글 상세조회
	public ISTPBoardDTO selectISTPBoardDetail (int istpBoardNo) {
		ISTPBoardDTO istpBoardDetail = istpBoardRepositoryImpl.selectISTPBoardDetail(istpBoardNo);
		return istpBoardDetail;
	}
	
	//게시글 조회수 증가
	public int updateISTPBoardHit (int istpBoardNo) {
		return istpBoardRepositoryImpl.updateISTPBoardHit(istpBoardNo);
	}
}
