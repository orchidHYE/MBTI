package com.pro.mbti.intj.service.board;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.pro.mbti.intj.domain.board.INTJBoardDTO;

public interface INTJBoardService {
	//게시글 목록 조회
	public List<INTJBoardDTO> selectINTJList() throws DataAccessException;
	
	//게시글 작성
	
	public int insertINTJWrite(INTJBoardDTO INTJboardDTO) throws DataAccessException;
	//게시물 상세내용 보기
	public INTJBoardDTO read(int INTJBoardNo) throws DataAccessException;
}
