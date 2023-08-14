package com.pro.mbti.infp.controller.board;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.pro.mbti.infp.domain.board.INFPBoardDTO;
import com.pro.mbti.infp.service.board.INFPBoardService;
import com.pro.mbti.member.domain.User;


@Controller
@RequestMapping("/infp")
public class INFPBoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(INFPBoardController.class);
	//필요한 의존 객체의 “타입"에 해당하는 빈을 찾아 주입
	@Autowired
	private INFPBoardService infpBoardService;
	
	//글 등록 폼
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public ModelAndView writeBoardForm(ModelAndView mv, HttpServletRequest request, HttpSession session) {
		session = request.getSession();
		User user = (User)session.getAttribute("AUTH_USER");
		if(user==null) {
			mv.setViewName("/member/login");
		} else {
			mv.addObject("user", user);
			mv.setViewName("/infp/infpBoardWriteForm");
		}
		return mv;
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public ModelAndView writeINFPBoard(ModelAndView mv, MultipartHttpServletRequest request,INFPBoardDTO infpBoardDTO) throws Exception {
		infpBoardDTO.setMemberNick(request.getParameter("writerName"));
		infpBoardDTO.setInfpBoardTitle(request.getParameter("title"));
		infpBoardDTO.setInfpBoardDetail(request.getParameter("content"));
		
		//이미지 파일 업로드
		/*
		MultipartFile mf = request.getFile("imageFileName");
		String path = request.getRealPath("upload/img");
		String fileName = mf.getOriginalFilename();
		File uploadFile = new File(path+"//"+fileName);
		try {
			mf.transferTo(uploadFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/		
		infpBoardDTO.setInfpBoardFile(request.getParameter("imageFileName"));
		System.out.println("infpBoardDTO = "+infpBoardDTO);
		int result = infpBoardService.writeINFPBoard(infpBoardDTO);
		if(result!=1) { 		
			mv.setViewName("redirect:/infp/infpBoardWriteForm");
		} else {		
			mv.setViewName("redirect:/infp/sucess");
		} 
			return mv; 
	}

}
