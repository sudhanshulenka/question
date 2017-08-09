package com.hackrank;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAppreance {

	public static void main(String[] args) {
		int[] numbers = { 10, 1, 11, 11, 11, 23, 11, 37, 51, 37, 37, 2 };
		getLargestNumberWithPrimeOccurences(numbers, 10);
	}

	static int getLargestNumberWithPrimeOccurences(int[] inputArray, int minOccurence) {
		int data = 0;
		if (inputArray.length <= 100) {
			Map<Integer, Integer> primeNumber = new HashMap<>();
			IntStream.of(inputArray).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
					.forEach((e -> {
						isPrime(e.getValue().intValue());
						primeNumber.put(e.getKey(), e.getValue().intValue());
					}));

			try {
				data = primeNumber.entrySet().stream().filter(e -> (e.getValue().intValue() > minOccurence))
						.max(Map.Entry.comparingByKey()).get().getKey();
			} catch (NoSuchElementException ex) {
				data = -1;
			}
		}
		return data;
	}

	public static boolean isPrime(int number) {
		return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
	}
}
