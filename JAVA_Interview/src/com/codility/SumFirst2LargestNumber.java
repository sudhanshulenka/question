package com.codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.hackrank.ArraySum;

public class SumFirst2LargestNumber {

	
	public static void main(String[] args) {
		int[] ar= {4,2,1,3};
		int[] ar1= new int[3];
		int[] ar2= new int[2];
		int[] arr= new int[5];
	
		int max=IntStream.of(ar).max().getAsInt();
		int max2=IntStream.of(ar).filter(e->(e!=max)).max().getAsInt();
	     System.out.println(max+max2);
	
	     List<Integer> dataList= IntStream.of(ar).boxed().collect(Collectors.toList());
	     System.out.println(dataList);
	     Collections.sort(dataList);
	     System.out.println(dataList);
	
	     System.arraycopy(ar, 0, arr, 0, 2);
	     arr[2]=4;
	     System.arraycopy(ar,2, arr,3,2);

	
	}
}
