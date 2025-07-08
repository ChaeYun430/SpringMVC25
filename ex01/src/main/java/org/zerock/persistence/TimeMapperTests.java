package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class TimeMapperTests {
	@Setter(onMethod_=@Autowired)
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		//인터페이스 추상메서드의 어노테이션으로 코드 실행
		log.info("타임메터 테스트 getname :" + timeMapper.getClass().getName());
		log.info("타임메퍼 결과 :" + timeMapper.getTime());
	}
	
	@Test
	public void testGetTime2() {
		//인터페이스 추상메서드 매퍼로 xml 사용함.
		log.info("타임메터2 테스트 getname :" + timeMapper.getClass().getName());
		log.info("타임메퍼2 결과 :" + timeMapper.getTime2());
	}
	
	@Test
	public void testGetTime2log4jdbc() {
		//인터페이스 추상메서드 매퍼로 xml 사용함.
		log.info("타임메퍼2 결과 :" + timeMapper.getTime2());
	}
}
