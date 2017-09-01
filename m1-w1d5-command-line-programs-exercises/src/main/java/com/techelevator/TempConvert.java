package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the Temperature: ");
        double temp = input.nextDouble();
        input.nextLine();
        System.out.print("Is the measurement in (C)elsius or (F)arenheit? ");
        
        String tempType = input.nextLine();
        
        System.out.println(temp + tempType + " is " + doConversion(temp, tempType) +
        		(tempType.toUpperCase().startsWith("C") ? "F" : "C"));
        
	}
	public static double doConversion(double temp, String tempType){		
		
		if(tempType.toUpperCase().startsWith("C")) {
			double resultF = temp * 1.8 + 32;
			return resultF;
		}else {
			double resultC = (temp - 32) / 1.8;
			return resultC;
		}
}
	}


