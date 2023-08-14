package com.pro.mbti.infp.repository.board;

import org.springframework.dao.DataAccessException;

import com.pro.mbti.infp.domain.board.INFPBoardDTO;

public interface INFPBoardRepository {

	public int insertINFPBoard(INFPBoardDTO infpBoardDTO) throws DataAccessException;

}
