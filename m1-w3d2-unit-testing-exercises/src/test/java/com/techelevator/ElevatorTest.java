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
	public void testMovingWhenOpen() {
		sut.isMoving();
		sut.OpenDoor();	
		assertEquals(false,sut.GoUp(0));
	}
	@Test
	public void testUpOverTop() {
		sut.GoUp(11);
		assertEquals(false,sut.GoUp(0));
	}
	@Test
	public void testUp() {
		sut.CloseDoor();
		sut.GoUp(10);
		assertEquals(10,sut.getCurrentLevel());
	}
	@Test
	public void testDown(){
		sut.CloseDoor();
		sut.GoUp(10);
		sut.GoDown(5);
		assertEquals(5,sut.getCurrentLevel());
	}
}
