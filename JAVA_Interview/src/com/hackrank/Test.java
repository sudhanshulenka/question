package com.hackrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
	
	public static void main(String[] args) {
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
		  List<Integer> primenumbers =numbers.stream()
                  .filter(Test::isPrime)
                  .collect(Collectors.toList());
		  System.out.println(primenumbers);
	}
	public static boolean isPrime(int number) {
	    return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0); 
	}

	
	
	
}
