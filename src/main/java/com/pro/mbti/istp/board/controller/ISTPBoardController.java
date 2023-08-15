package com.pro.mbti.istp.board.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pro.mbti.istp.board.domain.ISTPBoardDTO;
import com.pro.mbti.istp.board.service.ISTPBoardServiceImpl;

@Controller
@RequestMapping("/istp")
public class ISTPBoardController {
	
	@Autowired
	private ISTPBoardServiceImpl istpBoardServiceImpl;
	
	//게시판 게시판 목록 전체조회
	@RequestMapping("/list")
	public void selectISTPBoardList (Model model) {
		List<HashMap<String, Object>> istpBoardList = istpBoardServiceImpl.selectISTPBoardList();
		model.addAttribute("istpBoardList", istpBoardList);
	}
	
	//게시글 상세조회
	@RequestMapping("/detail")
	public String selectISTPBoardDetail (Model model, @RequestParam int istpBoardNo) {
		int istpBoardHit = istpBoardServiceImpl.updateISTPBoardHit(istpBoardNo);
		ISTPBoardDTO istpBoardDetail = istpBoardServiceImpl.selectISTPBoardDetail(istpBoardNo);
		model.addAttribute("istpBoardHit", istpBoardHit);
		model.addAttribute("istpBoardDetail", istpBoardDetail);
		
		return "/istp/detail";
	}	
}
