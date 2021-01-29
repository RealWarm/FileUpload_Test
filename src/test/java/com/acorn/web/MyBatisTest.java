package com.acorn.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MyBatisTest {

	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
//		log.info(sqlFactory);
		System.out.println("+++++++++ " + sqlFactory);
	}//test
	
	
	
}//end class
