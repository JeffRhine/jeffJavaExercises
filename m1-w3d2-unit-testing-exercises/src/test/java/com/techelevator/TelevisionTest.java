package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {
	Television sut;

	@Before
	public void setUp() throws Exception {
		sut = new Television();
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testConstructor() {
		assertEquals(3,sut.getCurrentChannel());
		assertEquals(2,sut.getCurrentVolume());
		assertEquals(false,sut.isOn());
	}
	@Test
	public void testOn() {
		sut.turnOn();
		assertEquals(true,sut.isOn());
	}

	@Test
	public void testCurrentChannel() {
		sut.turnOn();
		sut.changeChannel(5);
		assertEquals(5,sut.getCurrentChannel());
	}
	@Test
	public void testChangeChannelUp() {
		sut.turnOn();
		sut.channelUp();
		assertEquals(4,sut.getCurrentChannel());
	}
	@Test
	public void testChangeChannelUp18() {
		sut.turnOn();
		sut.changeChannel(18);
		sut.channelUp();
		assertEquals(3,sut.getCurrentChannel());
	}
	@Test
	public void testChangeChannelDown() {
		sut.turnOn();
		sut.changeChannel(5);
		sut.channelDown();
		assertEquals(4,sut.getCurrentChannel());
	}
	@Test
	public void testChangeChannelDown18() {
		sut.turnOn();
		sut.channelDown();
		assertEquals(18,sut.getCurrentChannel());
	}
	@Test
	public void testChangeVolumeUp() {
		sut.turnOn();
		sut.raiseVolume();
		assertEquals(3,sut.getCurrentVolume());
	}
	@Test
	public void testChangeVolumeUp10() {
		sut.turnOn();
		sut.raiseVolume();
		sut.raiseVolume();
		sut.raiseVolume();
		sut.raiseVolume();
		sut.raiseVolume();
		sut.raiseVolume();
		sut.raiseVolume();
		sut.raiseVolume();
		sut.raiseVolume();
		assertEquals(10,sut.getCurrentVolume());
	}
	@Test
	public void testChangeVolumeDown() {
		sut.turnOn();	
		sut.lowerVolume();
		assertEquals(1,sut.getCurrentVolume());
	}
	@Test
	public void testChangeVolumeDown0() {
		sut.turnOn();
		sut.lowerVolume();
		sut.lowerVolume();
		sut.lowerVolume();
		assertEquals(0,sut.getCurrentVolume());
	}
	@Test
	public void testVolume() {
		sut.turnOn();		
		assertEquals(2,sut.getCurrentVolume());
	}
}
