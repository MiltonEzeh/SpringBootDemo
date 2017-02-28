package com.milton.ezeh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AnotherSpringBootDemoApplication {

	public static void main(String[] args) {
		
		//Start application. Set up a servlet container and host application within it.
		// Steps
		// 1. Sets up default configuration
		// 2. Starts Spring application context (which is a container for all your code)
		// 3. Performs class path scan (looks for classes/beans to add for container to manage)
		// 4. Starts Tomcat Server (comes with spring boot)
		SpringApplication.run(AnotherSpringBootDemoApplication.class, args);
	}
}
