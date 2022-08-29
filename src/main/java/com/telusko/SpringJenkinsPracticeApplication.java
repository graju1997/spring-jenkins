package com.telusko;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsPracticeApplication {

	public static Logger log=LoggerFactory.getLogger(SpringJenkinsPracticeApplication.class);

	@PostConstruct
	public void init() {
		log.info("application Started..");
	}
	public static void main(String[] args) {

		 log.info("Application executed..");
		SpringApplication.run(SpringJenkinsPracticeApplication.class, args);
	}

}
