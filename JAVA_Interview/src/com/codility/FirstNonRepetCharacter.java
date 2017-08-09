package com.codility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepetCharacter {
	
	

	public static void main(String[] args) {
		String s="aasdfdls";
		String[] splitedRecord=s.split("");
	  List<Object> data= Stream.of(splitedRecord)
	   .collect(Collectors.groupingBy(e->e,Collectors.counting()))
	   .entrySet().stream().filter(e->(e.getValue()<=1)).collect(Collectors.toList());     
	  System.out.println(data);
	
	}
	
}
