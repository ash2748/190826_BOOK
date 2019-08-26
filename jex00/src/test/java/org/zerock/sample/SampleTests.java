package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

/*@RunWith : 현재 테스트 코드가 스프링을 실행하는 역할로 인식하도록 해줌. 스프링에서 JUnit테스트시 필수*/
/*@ContextConfigration : 자동으로 만들어줄 애플리케이션 컨텍스트의 설정파일 위치 지정*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class SampleTests {

	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	/*@Test : JUnit 테스트 대상을 표시*/
	@Test
	public void testExist() {
		/*@assertNotNull : restaurant가 변수가 null이 아닌 경우에만 테스트가 성공한다는 것을 의미*/ 
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("---------------------------------");
		log.info(restaurant.getChef());
	}
}
