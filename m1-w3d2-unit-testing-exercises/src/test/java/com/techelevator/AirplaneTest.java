package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
	Airplane sut;

	@Before
	public void setUp() throws Exception {
		sut = new Airplane("000001",25,40);
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testConstructor() {
		assertEquals("000001",sut.getPlaneNumber());
		assertEquals(25,sut.getAvailableFirstClassSeats());
		assertEquals(40,sut.getAvailableCoachSeats());
	}
	@Test
	public void testOverbook1st() {
		sut.reserveSeats(true,45);
		boolean result = sut.getBookedFirstClassSeats()>45; 
		assertEquals(false,result);
	}
	@Test
	public void testOverbookCoach() {
		sut.reserveSeats(false,45);
		boolean result = sut.getBookedFirstClassSeats()>45; 
		assertEquals(false,result);
	}
	@Test
	public void testCountBookedSeats() {
		sut.reserveSeats(true,15);		
		int result = sut.getTotalFirstClassSeats()-sut.getBookedFirstClassSeats(); 
		assertEquals(10,result);
	}
	@Test
	public void testCountBookedCoachSeats() {
		sut.reserveSeats(false,15);		
		int result = sut.getTotalCoachSeats()-sut.getBookedCoachSeats(); 
		assertEquals(25,result);
	}
	@Test
	public void testCountSeats() {			
		int result = sut.getTotalFirstClassSeats()-sut.getBookedFirstClassSeats(); 
		assertEquals(25,result);
	}
	@Test
	public void testCountCoachSeats() {		
		int result = sut.getTotalCoachSeats()-sut.getBookedCoachSeats(); 
		assertEquals(40,result);
	}
}
