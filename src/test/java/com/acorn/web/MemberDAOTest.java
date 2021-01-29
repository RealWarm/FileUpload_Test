package com.acorn.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acorn.domain.MemberVO;
import com.acorn.persistence.MemberDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() {
		log.info(dao.getTime());
	}//testTime
	
	@Test
	public void testInsertMember() {
		
		MemberVO vo = new MemberVO();
		vo.setUserid("user046");
		vo.setUserpw("user00");
		vo.setUsername("정훈");
		vo.setEmail("wjdgns@naver.com");
		
		dao.insertMember(vo);
		
		
	}//testInsert
	
	
	
	
	

}//end class
