package com.training.spring.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Qualifier("MessagingService")
@Service
public class SMSMessagingService implements MessagingService
{
	public void sendMessage(String messageContent) {
		System.out.println("Sending Message.."+messageContent);
	}
	
}
