package com.telusko;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsPracticeApplicationTests {

	public static Logger log=LoggerFactory.getLogger(SpringJenkinsPracticeApplicationTests.class);

	@Test
	void contextLoads() {
		
		log.info("Test Info Started...");
	}

}
