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
	else if(((ints%5)==0)||(ints.toString().contains("5"))){
		words.add("Buzz");
	}
	else if(((ints%3)==0)||(ints.toString().contains("3"))){
		words.add("Fizz");
	}
	else {
		words.add(ints.toString());

		}
		
		
	
		
	System.out.println(words);
	}return words;
	
	
	}

}
