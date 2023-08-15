package com.pro.mbti.member.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.mbti.member.domain.MemberDTO;
import com.pro.mbti.member.service.MemberServiceImpl;

@Controller
@RequestMapping("/member")
public class loginController {
	@Autowired
	private MemberServiceImpl memberservice;
	
	//로그인폼보여줌
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginForm() {
	}
	
	//로그인처리
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {
		//1.파라미터 받기
		System.out.println(memberDTO);
		session.setAttribute("MemberDTO", memberDTO);
		//2.비즈니스 로직
		boolean loginMember = memberservice.loginMember(memberDTO, session);
		ModelAndView mv = new ModelAndView();
		//3.Model
		
		//4.View
		if(loginMember == true) {
			mv.setViewName("redirect:/home/main");
		} else {
			mv.setViewName("redirect:/member/login");
		}
		return mv;
	}
}
