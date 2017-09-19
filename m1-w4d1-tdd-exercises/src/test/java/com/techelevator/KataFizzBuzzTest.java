package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class KataFizzBuzzTest {
	KataFizzBuzz sut;
	@Before
	public void setUp() {
		sut = new KataFizzBuzz();
	}
	@Test
	public void testOne(){
		List<String> answer = sut.fizzBuzz(new Integer[]{3});   //fizzBuzz(new Integer[]{3});
		assertEquals("Fizz", answer.get(0));
	}
	@Test
	public void testTwo(){
		List<String> answer = sut.fizzBuzz(new Integer[]{5});
		assertEquals("Buzz", answer.get(0));
	}
	@Test
	public void testThree(){
		List<String> answer = sut.fizzBuzz(new Integer[]{15});
		assertEquals("FizzBuzz", answer.get(0));
	}
	@Test
	public void testFour(){
		List<String> answer = sut.fizzBuzz(new Integer[]{1});
		assertEquals("1", answer.get(0));
	}
	@Test
	public void testZero(){
		List<String> answer = sut.fizzBuzz(new Integer[]{0});
		assertEquals("", answer.get(0));
	}
	@Test
	public void test101(){
		List<String> answer = sut.fizzBuzz(new Integer[]{101});
		assertEquals("", answer.get(0));
	}
	
	@Test
	public void test52(){
		List<String> answer = sut.fizzBuzz(new Integer[]{52});
		assertEquals("Buzz", answer.get(0));
	}
	@Test
	public void test37(){
		List<String> answer = sut.fizzBuzz(new Integer[]{37});
		assertEquals("Fizz", answer.get(0));
	}
}
//public List<String> fizzBuzzList(Integer[] integerArray) {
//	
//	
//List<String> words= new ArrayList<String>();
//for(Integer ints:integerArray){
//	
//if ((ints%15)==0) {
//	words.add("FizzBuzz");
//}
//else if((ints%5)==0){
//	words.add("Buzz");
//}
//else if((ints%3)==0){
//	words.add("Fizz");
//}
//else {
//	words.add(ints.toString());
//}
//System.out.println(words);
//}return words;
//
//}