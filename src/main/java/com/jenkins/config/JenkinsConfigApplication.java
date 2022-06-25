package com.jenkins.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class JenkinsConfigApplication {

	@PostConstruct
	public  init(){
		log.info("Application has been started --------");
	}
	public static void main(String[] args) {
		log.info("Application executed --------");
		SpringApplication.run(JenkinsConfigApplication.class, args);
	}
}
