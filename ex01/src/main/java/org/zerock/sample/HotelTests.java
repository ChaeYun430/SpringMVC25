package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/WEB-INF/spring/root-context.xml")
@Log4j2
public class HotelTests {
	@Setter(onMethod_ = @Autowired)
	private SampleHotel hotel;
	
	@Test //메서드별로 테스트가 가능한다. import org.junit.test;
	public void testExist() {
		
		assertNotNull(hotel);
		
		log.info(hotel);
		log.info("--------------------");
		log.info(hotel.getChef());
		
		
	}
}
