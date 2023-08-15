package com.pro.mbti.intj.service.board;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.pro.mbti.intj.domain.board.INTJBoardDTO;

public interface INTJBoardService {
	//게시글 목록 조회
	public List<INTJBoardDTO> selectINTJList() throws DataAccessException;
	
	//게시글 작성
	public void insertINTJWrite(INTJBoardDTO INTJboardDTO) throws DataAccessException;
}
