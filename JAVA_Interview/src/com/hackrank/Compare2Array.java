package com.hackrank;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Compare2Array {
	
	public static void main(String[] args) {
		int [] arrayone= {3,5,6,2,4};
		int [] arraytwo= {9,7,4,3,6};
		
		for(Integer b1:arraytwo)
			IntStream.of(arrayone).boxed().filter(a1-> (a1.compareTo(b1) ==0)).forEach(System.out::println);
	        List<Integer> sortedList=IntStream.of(arrayone).boxed().sorted().collect(Collectors.toList());
	        Integer max= IntStream.of(arrayone).boxed().max(Integer::compare).get();
        System.out.println(sortedList);
	  System.out.println(max);
	}
	
	

}
