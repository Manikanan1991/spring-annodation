package com.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("college")
public class College {
	@Value("${College.name}")
	String name;
	String college_name="Asan College";
	public void show() {
		System.out.println("Calling show method");
		System.out.println("Colleage Name"+name);
	}

}
