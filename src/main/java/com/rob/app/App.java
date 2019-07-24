package com.rob.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.rob.service.impl.JourneyServiceImpl;

@SpringBootApplication
@ComponentScan("com.rob")
public class App extends SpringBootServletInitializer {
	
	static Logger logger = LoggerFactory.getLogger(JourneyServiceImpl.class);
	
	
	public static void main(String[] args) {
		logger.info("spring boot intilization started....");
		SpringApplication.run(App.class, args);
		logger.info("Done....");
	}
	
}
