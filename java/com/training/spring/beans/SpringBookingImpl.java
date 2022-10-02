package com.training.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.basics.FirstBean;

public class SpringBookingImpl {

	BookingService bookingServ;
	
	public void setBookingServ(BookingService bookingServ) {
		this.bookingServ = bookingServ;
	}

	public  void bookVehicle(int customerId,String sourceLocation , String destLoc) {
		try {
			
			try {
				bookingServ.bookVehicle(customerId, sourceLocation, destLoc);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
//			BookingService bookVehicle = new CarBookingServiceImpl();
//			bookingId=bookVehicle.bookVehicle(1001, args[0], args[1]);
//			if(bookingId==null)
//			{
//				bookVehicle = new TwoWheelerBookingServiceImpl();
//				bookingId=bookVehicle.bookVehicle(1001, args[0], args[1]);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
