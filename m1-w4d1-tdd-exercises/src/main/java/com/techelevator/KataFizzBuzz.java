package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class KataFizzBuzz {
	

	public List<String> fizzBuzz(Integer[] integerArray) {
		
		
	List<String> words= new ArrayList<String>();
	for(Integer ints:integerArray){
		if(ints<1 || ints>100){
			words.add("");
		}
		else if ((ints%15)==0) {
		words.add("FizzBuzz");
	}
	else if((ints%5)==0){
		words.add("Buzz");
	}
	else if((ints%3)==0){
		words.add("Fizz");
	}
	else {
		words.add(ints.toString());
	}
//		for(String word:words){
//			if(word.matches("5")){
//				words.add("Buzz");
//			}else if(word.matches("3")){
//				words.add("Fizz");
//			}
//		}
	System.out.println(words);
	}return words;
	
	
	}
//	while ( n > 0 ) {
//		   digit = n % 10;
//		   // check the digit
//		   n = n / 10;
//		}
////	public String fizzBuzz(String words) {
//
////		Integer[] intArray= new Integer[] {};
//		List<Integer> intArray= new ArrayList<>();
//		for(Integer ints:intArray){
//
//		if ((ints%15)==0) {
//		words.add("FizzBuzz");
//		}
//		else if((ints%5)==0){
//		words.add("Buzz");
//		}
//		else if((ints%3)==0){
//		words.add("Fizz");
//		}
//		else {
//		words.add(ints.toString());
//		}
//		System.out.println(words);
//		}return words;
//
//		}
//	public List<String> fizzBuzz(ArrayList<String> words) {
//		
//	
//
//		int initialSize = 100;
//		 List<Integer>integerArray = new ArrayList<Integer>(initialSize);
//		for (int i = 1; i <= initialSize; i++)
//		{
//		   integerArray.add(i);
//		 
//		}
//	
////	List<String> words= new ArrayList<String>();
//	
//	
//	for(Integer ints:integerArray){
//	
//	if ((ints%15)==0) {
//	words.add("FizzBuzz");
//	}
//	else if((ints%5)==0){
//	words.add("Buzz");
//	}
//	else if((ints%3)==0){
//	words.add("Fizz");
//	}
//	else {
//	words.add(ints.toString());
//	}
//	System.out.println(words);
//	}return words;
//	
//	
//	}
}
