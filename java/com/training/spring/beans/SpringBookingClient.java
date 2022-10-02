package com.training.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBookingClient {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			SpringBookingImpl bookingServ = (SpringBookingImpl) context.getBean("BookingServiceImplementation");
			bookingServ.bookVehicle(1001, args[0], args[1]);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
