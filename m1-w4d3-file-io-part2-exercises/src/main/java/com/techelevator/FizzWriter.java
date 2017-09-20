package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzWriter {


	public static void main(String[] args) throws FileNotFoundException {

		//		File fizzBuzz = new File("fizzBuzz.txt");
		try(  PrintWriter out = new PrintWriter( "fizzBuzz.txt" )  ){
			for(int i = 1; i <= 300; i++){
				if ((i%15)==0) {
					out.println("FizzBuzz");
				}
				else if(((i%5)==0)||(Integer.toString(i).contains("5"))){
					out.println("Buzz");
				}
				else if(((i%3)==0)||(Integer.toString(i).contains("3"))){
					out.println("Fizz");
				}
				else {
					out.println(Integer.toString(i));
				}	
			}
		}
		         
	}
}





