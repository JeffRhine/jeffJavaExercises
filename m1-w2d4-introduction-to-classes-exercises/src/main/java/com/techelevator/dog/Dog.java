package com.techelevator.dog;

public class Dog {

private boolean sleeping =false;
private String zzz="Zzzzz...";
private String bark="Woof!";
public boolean isSleeping() {
	return sleeping;
}
public String makeSound(){
	if(isSleeping()==true){
		return zzz;
	}else{
		return bark;
	}
}
public void sleep(){
	this.sleeping=true;
}
public void wakeUp(){
	this.sleeping=false;
}
}
