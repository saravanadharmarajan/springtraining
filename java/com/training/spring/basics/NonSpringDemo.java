package com.training.spring.basics;

public class NonSpringDemo {

	public static void main(String[] args) {
		
		try {
			
			FirstBean firstbean =new FirstBean("Training");
			//firstbean.setSecondprop("Spring Training");
			firstbean.displayValue();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
