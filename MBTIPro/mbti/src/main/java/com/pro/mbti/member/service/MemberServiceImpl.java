package com.pro.mbti.member.service;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.pro.mbti.member.domain.MemberDTO;
import com.pro.mbti.member.repository.MemberRepositoryImpl;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberRepositoryImpl memberRepository;
	
	
	//회원가입
	@Override
	public int inserMember(MemberDTO memberDTO) throws DataAccessException{
		return memberRepository.insertMember(memberDTO);
	}
	
	//로그인체크
	@Override
	public boolean loginMember(MemberDTO memberDTO) throws DataAccessException{
		boolean result = memberRepository.loginMember(memberDTO);
		return result;
	}
	//로그인 정보
	@Override
	public MemberDTO viewMember(MemberDTO memberDTO) {
		return memberRepository.viewMember(memberDTO);
	}
}
