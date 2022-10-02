package com.training.spring.basics;

public class FirstBean {
	String firstprop;
	String secondprop;
	
	public String getFirstprop() {
		return firstprop;
	}
	public void setFirstprop(String firstprop) {
		this.firstprop = firstprop;
		 System.out.println("This is called inside Setter Method: ");
	}

	
	
	public String getSecondprop() {
		return secondprop;
	}
	public void setSecondprop(String secondprop) {
		this.secondprop = secondprop;
		System.out.println("Inside Setter Method of Second Property ");
	}
	
	public FirstBean() 
	{
		System.out.println(firstprop);
	}
	public FirstBean(String dependentprop) {
		this.firstprop=dependentprop;
		
		System.out.println("In Constructor of FirstBean with Arguments..Value set is "+dependentprop);
	}
	
	 public void displayValue() {

	        System.out.println("\n \n This is value of First Property " + firstprop);
	        System.out.println("This is  value of Second Property: " + secondprop);

	        }

}
