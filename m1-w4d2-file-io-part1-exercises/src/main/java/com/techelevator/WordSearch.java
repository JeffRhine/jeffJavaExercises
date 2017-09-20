package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in a word:");
		String userInput=input.nextLine();
		System.out.println("Is this entry case sensitive? (Y)es or (N)o?");
		String userInput2=input.nextLine();
		
		File inputFile = new File("/Users/jeffrhine/workspace/exercises/m1-w4d2-file-io-part1-exercises/alices_adventures_in_wonderland.txt");
//		System.out.println(inputFile.exists());

		if(userInput2.equalsIgnoreCase("y")){
			int lineCount=0;
			try(Scanner input2 = new Scanner(inputFile)){
				while(input2.hasNextLine()){
					String line = input2.nextLine();
					lineCount++;
					if(line.contains( userInput )){

						System.out.println(lineCount+") "+line);
					}
				}
			}
		}else if(userInput2.equalsIgnoreCase("n")){
			int lineCount=0;
			try(Scanner input2 = new Scanner(inputFile)){
				while(input2.hasNextLine()){
					String line = input2.nextLine();
					lineCount++;
					if(line.toLowerCase().contains(userInput.toLowerCase())){

						System.out.println(lineCount+") "+line);
					}
				}


			}
		}
	}
}
