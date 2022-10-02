package com.training.spring.aop;

import java.util.logging.Logger;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class MessageLogger {
	
	private Logger logger = Logger.getLogger(MessageLogger.class.getName());
	
	
	
	
}
