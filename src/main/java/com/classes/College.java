package com.classes;

import org.springframework.stereotype.Component;

@Component("college")
public class College {
	public void show() {
		System.out.println("Calling show method");
	}

}
