package com.classes;

import org.springframework.context.annotation.Bean;

//@Configuration
//@ComponentScan(basePackages ="com.classes")
public class ConfigurationClass {
    @Bean
	public College college() {
	return new College();  
  }
}
