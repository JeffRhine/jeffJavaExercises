package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {
	public int[] primeFinder(int num){
		List<Integer> primes= findPrimes(num);//keep this method simple, call another method to do the work
			
		return turnIntegerListIntoIntArray(primes);
		}
	
	private List<Integer> findPrimes(int num){//say num=12
		List<Integer> factors=new ArrayList<>();
		for(int potentialPrime = num/2; potentialPrime > 1;potentialPrime--){//for loop,divides number by to to start with 
			if(num % potentialPrime==0){
				factors.addAll(findPrimes(potentialPrime));//divides 6 into 2 and 3
				factors.addAll(findPrimes(num/potentialPrime));//divides 12 by 6, restarts loop
				return factors;
			}
		}
		factors.add(num);
		return factors;
	}
	
	private int[] turnIntegerListIntoIntArray(List<Integer>primes){
		int[] newArray = new int[primes.size()];
			for(int i=0;i<primes.size();i++){
				newArray[i]=primes.get(i);
				}
			return newArray;
	}
}
