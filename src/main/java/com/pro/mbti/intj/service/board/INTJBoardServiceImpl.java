package com.pro.mbti.intj.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.pro.mbti.intj.domain.board.INTJBoardDTO;
import com.pro.mbti.intj.repository.board.INTJBoardRepositoryImpl;

@Service
public class INTJBoardServiceImpl implements INTJBoardService {
	@Autowired
	private INTJBoardRepositoryImpl INTJBoardRepository;

	// 게시글 목록 조회
	@Override
	public List<INTJBoardDTO> selectINTJList() throws DataAccessException{
		List<INTJBoardDTO> INTJList = INTJBoardRepository.selectINTJList();
		return INTJList;
	}
	
	//게시글 작성
	@Override
	public int insertINTJWrite(INTJBoardDTO INTJboardDTO){
		int result = INTJBoardRepository.insertINTJWrite(INTJboardDTO);
		return result;
	}
	
	//게시글 상세보기
	public INTJBoardDTO read(int INTJBoardNo) {
		return INTJBoardRepository.read(INTJBoardNo);
	}
}
