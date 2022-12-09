package com.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	public  static Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	@Test
	public void contextLoads() {
		logger.info("Test case executing ... ");
	}

}
