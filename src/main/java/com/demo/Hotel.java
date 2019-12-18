package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Hotel {
	
	void hello() {
		System.out.println("hello hotel");
	}
	
	@PostConstruct
	void init() {
		System.out.println("init hotel");
	}

	@PreDestroy
	void destroy() {
		System.out.println("destroy hotel");
	}
}
