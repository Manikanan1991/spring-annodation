package com.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(basePackages ="com.classes")
@PropertySource("classpath:college-info.properties")
public class ConfigurationClass {
    @Bean
	public College college() {
	return new College();  
  }
}
