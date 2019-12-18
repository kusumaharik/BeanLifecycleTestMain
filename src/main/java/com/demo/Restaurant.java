package com.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean, DisposableBean {
	
	private Hotel hotel;

	void dispRes() {
		System.out.println("hello restaurant");
		hotel.hello();
	}
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy restaurant");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init restaurant");
		
	}

	@PostConstruct
	public void initMeth() {
		System.out.println("initAnnMeth restaurant");
	}
	
	@PreDestroy
	public void destroyMeth() {
		System.out.println("destroyAnnMeth restaurant");
	}
	
	public void destroyXMLMeth() {
		System.out.println("destroyXMLMeth restaurant");
	}
	
	public void initXMLMeth() {
		System.out.println("initXMLMeth restaurant");
	}
}
