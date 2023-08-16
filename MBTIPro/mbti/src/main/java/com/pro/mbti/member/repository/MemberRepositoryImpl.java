package com.pro.mbti.member.repository;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.pro.mbti.member.domain.MemberDTO;


@Repository
public class MemberRepositoryImpl implements MemberRepository {
	@Autowired
	private SqlSession sqlSession;
	
	//회원가입
	@Override
	public int insertMember(MemberDTO memberDTO) throws DataAccessException {
		return sqlSession.insert("member.insertMember", memberDTO);
	}
	
	//로그인
	@Override
	public boolean loginMember(MemberDTO memberDTO) throws DataAccessException {
		String name = sqlSession.selectOne("member.loginMember", memberDTO);
		return (name == null) ? false : true;
	}
	
	//로그인정보
	@Override
	public MemberDTO viewMember(MemberDTO memberDTO) throws DataAccessException {
		return sqlSession.selectOne("member.viewMember", memberDTO);
	}
}
