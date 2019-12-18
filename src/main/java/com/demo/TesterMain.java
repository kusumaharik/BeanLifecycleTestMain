package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Restaurant res = ctx.getBean(Restaurant.class);
		res.dispRes();
		
		((AbstractApplicationContext)ctx).registerShutdownHook();

	}

}
