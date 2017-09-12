package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {
	HomeworkAssignment sut;
	
	@Before //part of arrange step, works for every test
	public void setUp() throws Exception {
		sut = new HomeworkAssignment(100);
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testConstructor() {
		assertEquals(100,sut.getPossibleMarks());
	}
	@Test
	public void testLetterGradeA() {
		//arrange step, arranging test data
		
		sut.setTotalMarks(100);
		//act
		String grade = sut.getLetterGrade();
		//assert
		assertEquals("A",grade);
	}
	@Test
	public void testLetterGradeF() {
			
		sut.setTotalMarks(50);
	
		String grade = sut.getLetterGrade();
	
		assertEquals("F",grade);
	}
	@Test
	public void testLetterGradeAlow() {
		
		sut.setTotalMarks(90);

		String grade = sut.getLetterGrade();

		assertEquals("A",grade);
	}
	@Test
	public void testLetterGradeB() {
				sut.setTotalMarks(89);
		String grade = sut.getLetterGrade();
		assertEquals("B",grade);
	}
	@Test
	public void testLetterGradeBlow() {		
		sut.setTotalMarks(80);	
		String grade = sut.getLetterGrade();
		assertEquals("B",grade);
	}
	@Test
	public void testLetterGradeC() {
				sut.setTotalMarks(79);
		String grade = sut.getLetterGrade();
		assertEquals("C",grade);
	}
	@Test
	public void testLetterGradeClow() {		
		sut.setTotalMarks(70);	
		String grade = sut.getLetterGrade();
		assertEquals("C",grade);
	}
	@Test
	public void testLetterGradeD() {
				sut.setTotalMarks(69);
		String grade = sut.getLetterGrade();
		assertEquals("D",grade);
	}
	@Test
	public void testLetterGradeDlow() {		
		sut.setTotalMarks(60);	
		String grade = sut.getLetterGrade();
		assertEquals("D",grade);
	}
	@Test
	public void testLetterGradeAPlus() {
		//arrange step, arranging test data
		
		sut.setTotalMarks(101);
		//act
		String grade = sut.getLetterGrade();
		//assert
		assertEquals("A",grade);
	}
	@Test
	public void testLetterGradeFMinus() {
			
		sut.setTotalMarks(-1);
	
		String grade = sut.getLetterGrade();
	
		assertEquals("F",grade);
	}
}
