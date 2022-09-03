package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.classes.College;
import com.classes.ConfigurationClass;

@SpringBootApplication
public class SpringAnnodationDemo1Application {
	public static void main(String[] args) {
		//ApplicationContext applicationContext = SpringApplication.run(SpringAnnodationDemo1Application.class, args);
		//ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
	 ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ConfigurationClass.class);
		System.out.println("Bean is initialized");
		College  call= (College) applicationContext.getBean(College.class);
		
		call.show();
	System.out.println();
		//commit remote
		
		
	}

}
