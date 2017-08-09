package com.inheritance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
	

	
	public static void main(String[] args) {
		/*String[] data= {"RAM","RAM","X", "X", "Y", "z"};
		List<String> numbers = Arrays.asList(data);
		Map<String, Long> counts =
				numbers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		String  max=counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println(max);*/
	

		/*List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
		Set<Integer> duplicated = numbers.stream()
				                .filter(n -> numbers.stream()
				                 .filter(x -> x == n).count() > 1).collect(Collectors.toSet());
	    System.out.println(duplicated);*/
	   
		/* Optional<String> optional=Optional.empty();
	    List<Integer> numbers = null;
	    Optional.ofNullable(numbers);
	    System.out.println(numbers.toString());*/
	    
	    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
	  Integer max=  numbers.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
	    System.out.println(max);
	    
	    List<Integer> skips= numbers.stream().skip(2).collect(Collectors.toList());
	    System.out.println(skips);
	    
	    long count=numbers.stream().filter(i -> Collections.frequency(numbers, i) >1).count();
	    System.out.println(count);
	}
	


}
