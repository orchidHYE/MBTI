package com.pro.mbti.infp.service.board;

import org.springframework.stereotype.Service;

import com.pro.mbti.infp.domain.board.INFPBoardDTO;
import com.pro.mbti.infp.repository.board.INFPBoardRepository;

@Service
public class INFPBoardServiceImpl implements INFPBoardService {

	private INFPBoardRepository infpBoardRepository;
	
	public int writeINFPBoard(INFPBoardDTO infpBoardDTO) throws Exception {
		int result = infpBoardRepository.insertINFPBoard(infpBoardDTO);
		return result;
	}


}
