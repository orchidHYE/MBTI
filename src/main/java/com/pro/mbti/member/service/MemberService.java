package com.pro.mbti.member.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.dao.DataAccessException;

import com.pro.mbti.member.domain.MemberDTO;

public interface MemberService {
	//회원가입
	public int inserMember(MemberDTO memberDTO) throws DataAccessException;
	
	//로그인체크
	public boolean loginMember(MemberDTO memberDTO, HttpSession session) throws DataAccessException;
	
	//로그인정보
	public MemberDTO viewMember(MemberDTO memberDTO);
}
