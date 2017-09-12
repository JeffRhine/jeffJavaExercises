package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	Employee sut;
	@Before
	public void setUp() throws Exception {
		sut = new Employee(1000, "Jeff", "Rhine", 45000);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFullName() {
		String answer = sut.getFullName();
		assertEquals("Rhine, Jeff",answer);
	}
	@Test
	public void testAnnualRaise1() {
		sut.raiseSalary(10.0);
		assertEquals(49500,sut.getAnnualSalary(),0.01);
	}
	@Test
	public void testAnnualRaise2() {
		sut.raiseSalary(15.0);
		assertEquals(51750,sut.getAnnualSalary(),0.01);
	}
	@Test
	public void testAnnualRaise3() {
		sut.raiseSalary(0.0);
		assertEquals(45000,sut.getAnnualSalary(),0.01);
	}
	@Test
	public void testConstructor() {
		assertEquals(1000,sut.getEmployeeId());
		assertEquals("Rhine, Jeff",sut.getFullName());
		assertEquals(45000,sut.getAnnualSalary(),.001);
	}
}
