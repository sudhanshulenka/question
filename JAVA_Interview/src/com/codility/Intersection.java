package com.codility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Intersection {
	
	public static void main(String[] args) {
		int arr1[] = {1, 3, 4, 5, 7};
		int arr2[] = {2, 3, 5, 6};
		int[] arr=new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arr, 0, arr1.length);
		System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
	    List<Object> data=  IntStream.of(arr).boxed()
	   .collect(Collectors.groupingBy(e->e,Collectors.counting()))
	   .entrySet().stream().filter(e->(e.getValue()>1)).collect(Collectors.toList());
	   System.out.println(data);
	

	}

}
