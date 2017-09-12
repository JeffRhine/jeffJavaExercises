package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SmartPhoneTest {
	SmartPhone sut;
	@Before
	public void setUp() throws Exception {
		sut = new SmartPhone("0123456789","Verizon");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructor() {
		assertEquals("0123456789",sut.getPhoneNumber());
		assertEquals("Verizon",sut.getCarrier());
	}
	@Test
	public void test7DigitPhoneCall() {
		sut.Call("1234567", 5);
		assertEquals(false,sut.isOnCall());
	}
	@Test
	public void testBatteryRecharge() {
		sut.Call("0123456789", 5);
		sut.RechargeBattery();
		assertEquals(100,sut.getBatteryCharge());
	}
	@Test
	public void testBatteryDead() {
		sut.Call("0123456789", 101);	
		assertEquals(100,sut.getBatteryCharge());
	}
	@Test
	public void testMultipleCalls() {
		sut.Call("0123456789", 45);	
		sut.Call("0123456789", 45);	
		sut.Call("0123456789", 5);	
		assertEquals(5,sut.getBatteryCharge());
	}
	
}
