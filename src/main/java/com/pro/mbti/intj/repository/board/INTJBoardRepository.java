package com.pro.mbti.intj.repository.board;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.pro.mbti.intj.domain.board.INTJBoardDTO;

public interface INTJBoardRepository {
	
	//전체 게시판 목록
	public List<INTJBoardDTO> selectINTJList() throws DataAccessException;
	//게시글 작성
	public void insertINTJWrite(INTJBoardDTO INTJboardDTO) throws DataAccessException;
}
