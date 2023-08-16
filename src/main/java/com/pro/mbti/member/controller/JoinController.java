package com.pro.mbti.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.mbti.member.domain.MemberDTO;
import com.pro.mbti.member.service.MemberServiceImpl;

@Controller
@RequestMapping("/member")
public class JoinController {
	@Autowired
	private MemberServiceImpl memberservice;
	
	//회원가입 - 폼을 보여주는 get방식
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void joinForm() {
	}
	
	//회원가입처리 - DB에 등록 POST방식
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public ModelAndView join(ModelAndView mv, MemberDTO memberDTO) {
		//1.파라미터 받기 
		System.out.println(memberDTO);
		//2.비즈니스로직
		int insertMember = memberservice.inserMember(memberDTO);
		//3.Model
		//4.View
		if(insertMember == 1) {
			mv.setViewName("redirect:/member/login");
		} else {
			mv.setViewName("redirect:/member/join");
		}
		return mv;
	}
	
	
}
