package com.hackrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		int[] numbers = { 10, 1, 11, 11, 11, 23, 11, 37, 51, 37, 37, 2 };
		getLargestNumberWithPrimeOccurences(numbers, 1);
	}

	static int getLargestNumberWithPrimeOccurences(int[] inputArray, int minOccurence) {
		int data = 0;
		if (inputArray.length <= 100) {
			Map<Integer, Integer> dataCount = new HashMap<>();
			Map<Integer, Integer> primeCount = new HashMap<>();
			for (int i = 0; i < inputArray.length; i++) {

				Integer count = dataCount.get(inputArray[i]);
				if (null == count) {
					count = 1;
				} else {
					count = count + 1;
				}
				dataCount.put(inputArray[i], count);
			}
			for (Map.Entry<Integer, Integer> mapdata : dataCount.entrySet()) {
				isPrime(mapdata.getValue());
				if (mapdata.getValue() > minOccurence) {
					primeCount.put(mapdata.getKey(), mapdata.getValue());
				}
			}
			if (!primeCount.isEmpty()) {
				data = Collections.max(primeCount.keySet());
			} else {
				data = -1;
			}
		}
		return data;
	}

	static boolean isPrime(Integer n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
     
}
