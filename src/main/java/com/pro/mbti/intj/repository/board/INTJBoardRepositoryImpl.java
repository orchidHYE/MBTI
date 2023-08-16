package com.pro.mbti.intj.repository.board;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.pro.mbti.intj.domain.board.INTJBoardDTO;

@Repository
public class INTJBoardRepositoryImpl implements INTJBoardRepository {
	@Autowired
	private SqlSession sqlSession;
	
	//게시글 목록
	@Override
	public List<INTJBoardDTO> selectINTJList() throws DataAccessException {
		List<INTJBoardDTO> INTJList = sqlSession.selectList("INTJBoard.selectINTJBoardList");
		return INTJList;
	}
	
	//게시글 작성
	@Override
	public void insertINTJWrite(INTJBoardDTO INTJboardDTO){
		sqlSession.insert("INTJBoard.insertINTJBoardList", INTJboardDTO);
	}
}
