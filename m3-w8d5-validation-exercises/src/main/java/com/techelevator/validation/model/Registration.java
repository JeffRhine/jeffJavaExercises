package com.techelevator.validation.model;


import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotBlank(message="First Name is required") @Length(max=20,message="Too many characters")
	private String firstName;
	
	@NotBlank(message="Last Name is required") @Length(max=20,message="Too many characters")
	private String lastName;
	
	@NotBlank(message="Email is required") @Email(message="Must be valid Email Address")
	private String email;
	
	@NotBlank(message="Email is required") 
	private String confirmEmail;
	
	@NotBlank(message="Password is required") @Length(min=8, message="Password must be at least 8 characters")
	private String password;
	
	@NotBlank(message="Password is required") 
	private String confirmPassword;
	
	@DateTimeFormat(pattern="mm/dd/yyyy")
	private Date birthDate;
	
	@NotNull(message="Number of Tickets is required") @Min(value=1, message="Minimum of 1 ticket required") @Max(value=10,message="Maximum of 10 ticket allowed")
	private Integer numTickets;

	private boolean emailMatch;
	@AssertTrue(message="Email must match")
	public boolean isEmailMatching(){
		if(confirmEmail != null){
	return email.equals(confirmEmail);	 
		}else{
	return false;   
		}
	}

	private boolean passwordMatch;
	@AssertTrue(message="Passwords must match")
	public boolean isPasswordMatching(){
		if(confirmPassword != null){
	return password.equals(confirmPassword);
		}else{
			return false;
		}
}

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getConfirmEmail() {
	return confirmEmail;
}

public void setConfirmEmail(String confirmEmail) {
	this.confirmEmail = confirmEmail;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getConfirmPassword() {
	return confirmPassword;
}

public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}

public Date getBirthDate() {
	return birthDate;
}

public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

public Integer getNumTickets() {
	return numTickets;
}

public void setNumTickets(Integer numTickets) {
	this.numTickets = numTickets;
}

public boolean isEmailMatch() {
	return emailMatch;
}

public void setEmailMatch(boolean emailMatch) {
	this.emailMatch = emailMatch;
}

public boolean isPasswordMatch() {
	return passwordMatch;
}

public void setPasswordMatch(boolean passwordMatch) {
	this.passwordMatch = passwordMatch;
}



}
