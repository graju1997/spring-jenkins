package com.telusko;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsPracticeApplicationTests {

	public static Logger log=LoggerFactory.getLogger(SpringJenkinsPracticeApplicationTests.class);

	@Test
	 contextLoads() {
		
		log.info("Test Info Started...");
		log.info("..............Test Info Started in contextLoads()...........");
		log.info("..............Test Info Started in contextLoads() 2 to check build triggers...........");
		log.info("..............Test Info Started in contextLoads() 3 to check pipeline in dev and uat,prod...........");

	}

}
