package com.pro.mbti.member.repository;

import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.pro.mbti.member.domain.MemberDTO;

public interface MemberRepository {
	public int insertMember(MemberDTO memberDTO) throws DataAccessException;
	
	public boolean loginMember(MemberDTO memberDTO) throws DataAccessException;
	
	public MemberDTO viewMember(MemberDTO memberDTO) throws DataAccessException;
	
	
}
