package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	Elevator sut;
	@Before
	public void setUp() throws Exception {
		sut = new Elevator(1,10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructor() {
		assertEquals(1,sut.getShaftNumber());
		assertEquals(10,sut.getNumberOfLevels());
	}
	@Test
	public void testUpWhenOpen() {
		sut.isMoving();
		sut.OpenDoor();	
		assertEquals(false,sut.isDoorOpen());
	}
	@Test
	public void testUpOverTop() {
		sut.GoUp(11);
		assertEquals(10,sut.getNumberOfLevels());
	}
	@Test
	public void testDown() {
		sut.GoDown(5);
		assertEquals(5,sut.getNumberOfLevels());
	}
}
