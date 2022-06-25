package com.jenkins.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class JenkinsConfigApplicationTests {

	@Test
	void contextLoads() {
			log.info("Execuring the test --------");
			assertEquals(true, true);
		}
}
