package com.training.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class MessagingWrapper {

	
	MessagingService messagingSrv;
	
	
	   public MessagingWrapper( @Qualifier("MessagingService") MessagingService messagingSrv) {
	       this.messagingSrv = messagingSrv;
	   }

	public void setMessagingSrv(MessagingService messagingSrv) {
		System.out.println(" Messaging Service");
		this.messagingSrv = messagingSrv;
	}
	public void sendMessageUsingAnyService(String messageText)
	{
		messagingSrv.sendMessage(messageText);
	}
	
	
}
