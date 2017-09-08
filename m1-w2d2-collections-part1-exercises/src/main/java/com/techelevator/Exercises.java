package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order 
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"] 
	 */
	public List<String> array2List(String[] stringArray) {
//		String[] str = new String[stringArray.size()];
//		str = stringArray.toArray(str);
		
   	List<String>str = new ArrayList<String>();
    	for(int i =0;i<stringArray.length;i++){
       	str.add(stringArray[i]);
	
    	}		return str;
		
    	}

		
	
	
	/*
	 Given a list of Strings, return an array containing the same Strings in the same order 
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
//		List<String>str = new ArrayList<String>(stringList);
		String[] str = new String[stringList.size()];
	
   	for(int i =0;i<stringList.size();i++){
   		str[i]=stringList.get(i);
   	}
//       	
		return str;
    	}		
		
    	
	
	




	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order 
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray) {
	   	List<String>str = new ArrayList<String>();
    	for(int i = 0;i<stringArray.length;i++){
    		if(stringArray[i].length()!=4){
       	str.add(stringArray[i]);
    		}
    	}		return str;
	}
//	for (String element:thisIsAStringArray) {
//	    if ( element.equals( stringToSearch )) {
//	        found = true;

	/*
	 Given a List of Strings, return a new list in reverse order of the original. One obvious solution is to
	 simply loop through the original list in reverse order, but see if you can come up with an alternative
	 solution. (Hint: Think LIFO (i.e. stack))
	 reverseList( ["purple", "green", "blue", "yellow", "green" ])  -> ["green", "yellow", "blue", "green", "purple" ]
	 reverseList( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"} )
		-> ["way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle"]
	 */
	public List<String> reverseList(List<String> stringList) {
		
		List<String> str = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();
		stack.addAll(stringList);
		for(int i =0;i<stringList.size();i++){
		 
		str.add(i,stack.pop());
		}
		return str;
	}
//	List<String> str = new ArrayList<String>();
//	Stack<String> stack = new Stack<String>();
//   	for(int i =0;i<stringList.size();i++){
//   		stack.push(stringList.get(i));
//   	}while(!stack.isEmpty()){
//       	str=stack.pop();
//		
//    	}	return str;	
//	Stack<Integer> stack = new Stack<Integer>();
//	stack.push(45);
//	stack.push(23);
//	stack.push(44);
//	
//	while(!stack.isEmpty()){//stack.size() >=1 means the same thing
//		System.out.println(stack.pop());

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {

		List<Double> int1= new ArrayList<>();
		
		double[] answer = new double[intArray.length];
		for(int i = 0; i < intArray.length; i++) {
		 answer[i]=intArray[i];
		  answer[i] = (answer[i] / 2);
		  int1.add(answer[i]);
		}
		return int1;
		
	}
//	double[] doubles = new double[ints.length];
//	for(int i=0; i<ints.length; i++) {
//	    doubles[i] = ints[i];
//	}
//	return normal;
//	double[] normal = new double[v.length];
//	for(int a = 0; a < v.length; a++)
//	{
//	  normal[a] = v[a]/sum;
//	}
//	List<Double> list = Arrays.asList(doubleArray);
	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
	 */
	public Integer findLargest(List<Integer> integerList) {
		
//		List<Integer> array = new ArrayList<Integer>();		
				int max=0;
//			 max = Collections.max(array);  
		for(Integer i :integerList){
			if(i>max){
				max=i;
			}
		}
			 return max;
	}

//	for(int i=0; i<array.size();i++){
	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]  
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		List<Integer> odd= new ArrayList<Integer>();
		for(int i = 0;i<integerArray.length;i++){
			if(integerArray[i]%2!=0){
				odd.add(integerArray[i]);
			}			
		}
		return odd;
	}
	
	/* 
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in 
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
//		if(Arrays.asList(integerList).contains(intToFind)){
//			return true;
		   int numCount = 0;

		    for (int x : integerList) {
		        if (x == intToFind){
		        	numCount++;
		        }
		    }if (numCount>=2){
		    	return true;
		    }return false;

		    
		}
		
	
//	public boolean contains(final String[] array, final String key) {
//	    return Arrays.asList(array).contains(key);
	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
    should be replaced by the String "Fizz", any multiple of 5 should be replaced by the String "Buzz",
    and any multiple of both 3 and 5 should be replaced by the String "FizzBuzz"
    ** INTERVIEW QUESTION **	 
    
    fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
	 
	 HINT: To convert an integer x to a string you can call x.toString() in your code (e.g. if x = 1 then x.ToString() equals "1")
	 */
//	List<List> listOfMixedTypes = new ArrayList<List>();
//
//	ArrayList<String> listOfStrings = new ArrayList<String>();
//	ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
//
//	listOfMixedTypes.add(listOfStrings);
//	listOfMixedTypes.add(listOfIntegers);
	public List<String> fizzBuzzList(Integer[] integerArray) {
		
		
	List<String> words= new ArrayList<String>();
	for(Integer ints:integerArray){
		
	if ((ints%15)==0) {
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
	System.out.println(words);
	}return words;
	
	}
//	List<Integer> odd= new ArrayList<Integer>();
//	for(int i = 0;i<integerArray.length;i++){
//		if(integerArray[i]%2!=0){
//			odd.add(integerArray[i]);
//		}			
//	}
//	List<String> a=Arrays.toString(integerArray);
//	for(int i = 0;i<integerArray.length;i++){
//		if(integerArray[i]%15==0){
//			a.replace(integerArray[i],"FizzBuzz");
//		}
//	return a;
//}
	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
			Set<String> set=new HashSet<String>(stringList);
			List<String> list = new ArrayList<String>(set);
		return list;
	}
//		System.out.println("Unique gas count: " + uniqueGas.size());
//	Set<String> set = new HashSet<String>(stringList);
//	Collection<String> odd = new HashSet<String>(stringList);
//	  Set<String> s = new HashSet<String>();
//	  List<String> set= new ArrayList<String>(s);
//        for (String a : stringList){
//               s.add(a);
//}
	 

	
//		for(int i =0;i<stringList.size();i++){
//			set[i]=stringList.get(i);
//					    	}		return set;
//		HashSet<String> set = new HashSet<String>();
	
//	Collection<Type> noDups = new HashSet<Type>(c);
	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		 for ( int i = 0; i < listTwo.size(); i++ ) {
		        listOne.add( Math.min( i*2+1, listOne.size()), listTwo.get( i ));
	    }
	
		return listOne;
	}
//		  
		
	

	/*
	 Given a list of Integers representing seat numbers, group them into ranges 1-10, 11-20, and 21-30.
	 (Any seat number less than 1, or greater than 30 is invalid, and can be ignored.) Preserve the order
	 in which the seat number entered their associated group. Return a list of the grouped Integers 1-10,
	 11-20, and 21-30. (Hint: Think multiple queues)
	 boardingGate( [1, 13, 43, 22, 8, 11, 30, 2, 4, 14, 21] ) -> [1, 8, 2, 4, 13, 11, 14, 22, 30, 21]
	 boardingGate( [29, 19, 9, 21, 11, 1, 0, 25, 15, 5, 31] ) -> [9, 1, 5, 19, 11, 15, 29, 21, 25]
	 boardingGate( [0, -1, 44, 31, 17, 7, 27, 16, 26, 6] ) -> [7, 6, 17, 16, 27, 26]
	 */
	public List<Integer> boardingGate(List<Integer> seatNumberList) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		Queue<Integer> queue3 = new LinkedList<Integer>();
		List<Integer> queueAll=new ArrayList<Integer>();
		for(int i : seatNumberList){
			if(i<1||i>30){
				queue.add(i);	
		}
			if (i>=1&&i<11){
				queue1.add(i);
			}if(i>10&&i<21){
				queue2.add(i);
			}if(i>20&&i<31){
				queue3.add(i);
			}
			
		}queueAll.addAll(queue1);
		queueAll.addAll(queue2);
		queueAll.addAll(queue3);
		return queueAll;
	}

}
//while(queue.peek() != null) {  //.peek looks at first element
//	System.out.println(queue.poll()); // .poll removes first element and returns it