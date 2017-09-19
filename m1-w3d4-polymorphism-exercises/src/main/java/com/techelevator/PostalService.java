package com.techelevator;

public class PostalService implements DeliveryDriver {

	private double ounces;
	private double lbs;
	private boolean firstClass;
	private boolean secondClass;
	private boolean thridClass;
	
	public double calculateRate(double distance,double weight){
		
	}
	
	
	public double getOunces() {
		return ounces;
	}
	public void setOunces(double ounces) {
		this.ounces = ounces;
	}
	public double getLbs() {
		return lbs;
	}
	public void setLbs(double lbs) {
		this.lbs = lbs;
	}
	public boolean isFirstClass() {
		return firstClass;
	}
	public void setFirstClass(boolean firstClass) {
		this.firstClass = firstClass;
	}
	public boolean isSecondClass() {
		return secondClass;
	}
	public void setSecondClass(boolean secondClass) {
		this.secondClass = secondClass;
	}
	public boolean isThridClass() {
		return thridClass;
	}
	public void setThridClass(boolean thridClass) {
		this.thridClass = thridClass;
	}
	
	

}
