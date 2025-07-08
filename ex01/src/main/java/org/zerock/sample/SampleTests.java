package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/WEB-INF/spring/root-context.xml")
@Log4j2
public class SampleTests {
	@Setter(onMethod_ = @Autowired)
	private Restaurant restaurant; 
	
	@Test //메서드별로 테스트가 가능한다. import org.junit.test;
	public void testExist() {
		
		assertNotNull(restaurant); //객체가 null인지를 판단한다. null이 아니어야만  테스트가 성공
		
		log.info(restaurant);
		log.info("---------------");
		log.info(restaurant.getChef());
	}
}
