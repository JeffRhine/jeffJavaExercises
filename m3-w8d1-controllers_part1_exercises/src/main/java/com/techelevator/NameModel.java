package com.techelevator;

import org.springframework.web.bind.annotation.RequestParam;

public class NameModel {

	private String firstName;
	private String lastName;
	private String mI;
	private boolean fml;
	private boolean fl;
	private boolean lmf;
	private boolean lf;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getmI() {
		return mI;
	}
	public void setmI(String mI) {
		this.mI = mI;
	}
	public boolean isFml() {
		return fml;
	}
	public void setFml(boolean fml) {
		this.fml = fml;
	}
	public boolean isFl() {
		return fl;
	}
	public void setFl(boolean fl) {
		this.fl = fl;
	}
	public boolean isLmf() {
		return lmf;
	}
	public void setLmf(boolean lmf) {
		this.lmf = lmf;
	}
	public boolean isLf() {
		return lf;
	}
	public void setLf(boolean lf) {
		this.lf = lf;
	}
	
}
