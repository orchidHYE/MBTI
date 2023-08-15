package com.pro.mbti.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//GET이랑 POST가 두개 다 있어야만 실행되는 이유를 찾지 못함.

@Controller
@RequestMapping("/home")
public class MainController {
	
	//메인화면 폼을 보여줌
	@RequestMapping(value ="/main", method = RequestMethod.POST)
	public void mainForm() {
		
	}
	@RequestMapping(value ="/main", method = RequestMethod.GET)
	public void mainForm1() {
		
	}
}
