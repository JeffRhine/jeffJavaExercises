package com.techelevator;

public class HomeworkAssignment {
private  int totalMarks;
private int possibleMarks;
private String submitterName;


public HomeworkAssignment(int possibleMarks) {
	this.possibleMarks=possibleMarks;		
}
public int grade;
public String getLetterGrade() {
	grade = (totalMarks * 100/possibleMarks);
	if(grade >= 90){
		return "A";
	}else if((grade < 90) && (grade >= 80)){
		return "B";
	}else if((grade < 80) && (grade >= 70)) {
		return "C";
	}else if((grade < 70) && (grade >= 60)) {
			return "D";
	}else{
		return "F";
	}
	

	
}
public int getTotalMarks() {
	return totalMarks;
}
public void setTotalMarks(int totalMarks) {
	this.totalMarks = totalMarks;
}
public String getSubmitterName() {
	return submitterName;
}
public void setSubmitterName(String submitterName) {
	this.submitterName = submitterName;
}
public int getPossibleMarks() {
	return possibleMarks;
}


}

