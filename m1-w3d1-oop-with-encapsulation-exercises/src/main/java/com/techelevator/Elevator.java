package com.techelevator;

public class Elevator {
private int currentFloor = 1;
private int numberOfFloors;
private boolean doorOpen;


	public Elevator(int totalNumberOfFloors){
		this.numberOfFloors=totalNumberOfFloors;
	}

	public	void openDoor(){
		doorOpen=true;
	}
	public	void closeDoor(){
	    doorOpen=false;
	}
	public	void goUp(int desiredFloor){
		if((doorOpen==false)&&(currentFloor<numberOfFloors)){
			currentFloor++;
		}
		
	}
	public void goDown(int desiredFloor){
		if((doorOpen==false)&&(currentFloor>1)){
			currentFloor--;
		}
	}

public int getCurrentFloor() {
	return currentFloor;
}
public int getNumberOfFloors() {
	return numberOfFloors;
}
public boolean isDoorOpen() {
	return doorOpen;
}


}
