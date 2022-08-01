package com.org.auto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.org.auto")
public class AppConfig {
	
	@Bean(name = "fictionWriter")
	public Writer FictionaWriter() {
		return new FictionWriter();
	}
	
	@Bean(name="pul")
	public Writer TechnichalWriter() {
		return new TechnichalWriter();
	}

}
