package com.training.spring.annotations;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessagingClient {

	public static void main(String[] args) {
	try {
		
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.register(SMSMessagingService.class);
		context.register(MessagingWrapper.class);
		context.refresh();
		MessagingWrapper msgWrapper = context.getBean(MessagingWrapper.class);
		
		msgWrapper.sendMessageUsingAnyService("hello Students..");
		
	} catch (Exception e) {
		// TODO: handle exception
	}

	}

}
