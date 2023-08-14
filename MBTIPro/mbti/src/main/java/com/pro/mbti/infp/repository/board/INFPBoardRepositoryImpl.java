package com.pro.mbti.infp.repository.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.pro.mbti.infp.domain.board.INFPBoardDTO;

@Repository
public class INFPBoardRepositoryImpl implements INFPBoardRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int insertINFPBoard(INFPBoardDTO infpBoardDTO) throws DataAccessException {
		int result = sqlSession.insert("INFPBoard.insertINFPBoard",infpBoardDTO);
		return result;
	}

}
