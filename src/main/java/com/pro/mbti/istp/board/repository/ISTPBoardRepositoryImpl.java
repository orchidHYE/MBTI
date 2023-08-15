package com.pro.mbti.istp.board.repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pro.mbti.istp.board.domain.ISTPBoardDTO;

@Repository
public class ISTPBoardRepositoryImpl {
	
	@Autowired
	private SqlSession sqlSession;
	
	//게시판 목록 전체조회
	public List<HashMap<String, Object>> selectISTPBoardList () {
		List<HashMap<String, Object>> istpBoardList = sqlSession.selectList("ISTP.selectISTPBoardList");
		return istpBoardList;
	}
	
	//게시글 상세조회
	public ISTPBoardDTO selectISTPBoardDetail (int istpBoardNo) {
		ISTPBoardDTO istpBoardDetail = sqlSession.selectOne("ISTP.selectISTPBoardDetail", istpBoardNo);
		return istpBoardDetail;
	}
	
	//게시글 조회수 증가
	public int updateISTPBoardHit (int istpBoardNo) {
		return sqlSession.update("ISTP.updateISTPBoardHit", istpBoardNo);
	}
}
