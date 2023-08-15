package com.pro.mbti.intj.controller.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pro.mbti.intj.domain.board.INTJBoardDTO;
import com.pro.mbti.intj.service.board.INTJBoardServiceImpl;
import com.pro.mbti.member.domain.MemberDTO;
import com.pro.mbti.member.domain.User;

@Controller
@RequestMapping("/intj")
public class INTJBoardController {
	@Autowired
	private INTJBoardServiceImpl INTJBoardService;
	
	//게시판 목록 조회
	@RequestMapping(value = "/INTJBoard", method = RequestMethod.GET)
	public void getINTJList(Model model) {
		List<INTJBoardDTO> INTJList = INTJBoardService.selectINTJList();
		model.addAttribute("INTJList",INTJList);
	}
	
	//게시글 작성 -> GET방식 글작성폼으로 이동
		@RequestMapping(value = "/INTJWrite", method = RequestMethod.GET)
		public String getWrite(HttpSession session){
			if(session.getAttribute("memberId") == null) {
				return "redirect:/member/login";
			}else {
				return "redirect:/intj/INTJWrite";
			}	
		}
	
	//게시글 작성 -> POST방식
	@RequestMapping(value = "/INTJWrite", method = RequestMethod.POST)
	public String insertINTJWrite(INTJBoardDTO INTJboardDTO , HttpSession session, RedirectAttributes ra) {
		if(session.getAttribute("memberId") == null)
			return "redirect:/home/main";
		MemberDTO writer = (MemberDTO)session.getAttribute("memberId");
		INTJboardDTO.setMember(writer);
		INTJBoardService.insertINTJWrite(INTJboardDTO);
		ra.addAttribute("getINTJBoardNo",INTJboardDTO.getINTJBoardNo());
		return "redirect:/intj/INTJWrite";
	}
	
}