package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
	        
	        System.out.print("Please enter a number: ");
	        int num = input.nextInt();
	        input.nextLine();
	       
	        
	 
			 int[] fib = new int[num];
	 fib[0] = 0;
	 fib[1] = 1;
	 for(int i =2; i < num; i++){
		 fib[i] = fib[i-1] + fib[i-2];
	 }
	 for (int i=0; i<num; i++){
		 System.out.print(fib[i] + " ");
	 }
	}

}


/*   for (int i = 1; i <= number; i++) {
log(fibonacciRecusion(i) + " ");
}

public static int fibonacciRecusion(int number) {
if (number == 1 || number == 2) {
	return 1;
}

return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); 
}
}private static void log(String number) {
System.out.println(number);

*/


