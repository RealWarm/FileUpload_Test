package com.acorn.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.acorn.domain.MemberVO;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.acorn.mapper.MemberMapper";

	@Override
	public String getTime() {		
		log.info("MemberDAOImpl :: public String getTime() invoked!!");
		return sqlSession.selectOne(namespace + ".getTime");
	}//getTime

	@Override
	public void insertMember(MemberVO vo) {
		log.info("MemberDAOImpl :: public void insertMember(MemberVO vo) { invoked!!");
		sqlSession.insert(namespace + ".insertMember", vo);		
	}//insertMember

	@Override
	public MemberVO readMember(String userid) throws Exception {
		
		return null;
	}

	@Override
	public MemberVO redWithPW(String userid, String userpw) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}//end class
