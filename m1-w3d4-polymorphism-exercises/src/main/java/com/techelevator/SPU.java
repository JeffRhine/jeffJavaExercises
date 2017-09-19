package com.techelevator;

public class SPU  implements DeliveryDriver{
	private double rate;
	private boolean nextDay;
	private boolean twoDay;
	private boolean fourDay;
	
	public double calculateRate(double distance,double weight){
		
	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public boolean isNextDay() {
		return nextDay;
	}
	public void setNextDay(boolean nextDay) {
		this.nextDay = nextDay;
	}
	public boolean isTwoDay() {
		return twoDay;
	}
	public void setTwoDay(boolean twoDay) {
		this.twoDay = twoDay;
	}
	public boolean isFourDay() {
		return fourDay;
	}
	public void setFourDay(boolean fourDay) {
		this.fourDay = fourDay;
	}
	

}
