package com.techelevator;

public class Television {
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	public void turnOff(){
		isOn=false;
	}
	public void turnOn(){
		isOn=true;
	}
	public void changeChannel(int newChannel){
		if(isOn==true){
		this.currentChannel=newChannel;
		}
	}
	public void channelUp(){
		if((isOn==true)&&(currentChannel<18)){
			currentChannel++;
		}else if (isOn==true){
			currentChannel=3;
		}
	}
	public void channelDown(){
		if((isOn==true)&&(currentChannel>3)){
			currentChannel--;
		}else if(isOn==true){
			currentChannel=18;
		}
	}
	public void raiseVolume(){
		if((isOn==true)&&(currentVolume<10)){
			currentVolume++;
		}else if(isOn==true){
			currentVolume=10;
		}
	}
	public void lowerVolume(){
		if((isOn==true)&&(currentVolume>1)){
			currentVolume--;
		}else if(isOn==true){
			currentVolume=0;
		}
	}
	
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	

}
