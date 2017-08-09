package com.codility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RoatedArray {
	
	public static void main(String[] args) {
		int[] A = {9,3, 9,3,9,7,3}; 
        long[] al=new long[A.length];
		for(int i=0;i<A.length;i++)
		 	al[i]=Long.valueOf(A[i]);
		    oddNumberPair(al);
	}
	 public static int[] roatedArray(int[] A, int K) {
		
		List<Integer> listArray= IntStream.of(A).boxed().collect(Collectors.toList());
		for (int i = 1; i <K; i++) {
			listArray.add(listArray.get(0));
			listArray.remove(0);
			
		}
		 return listArray.stream().mapToInt(i->i).toArray();
     }
	 
	 
	 public static int oddNumberPair(long[] A) {
	int[] result=	 LongStream.of(A).boxed()
		   .collect(Collectors.groupingBy(e->e,Collectors.counting()))
		    .entrySet()
		     .stream().filter(e->(e.getValue()==1)).mapToInt(e->e.getKey().intValue()).toArray();
		 return result[0];
	 }
	 
	 public static int findingMissingElement(long[] A) {
		List<Long> dataList= LongStream.of(A).boxed().sorted().collect(Collectors.toList());
		 for(int i=0;i<dataList.size();i++) {
				Long value= dataList.get(i);
				Long newvalue=Long.sum(value, 1);
			      if(!(newvalue==dataList.get(i+1)))
			      return newvalue.intValue();
			 }
			 
		 return 0;
	 }
	 
	 public static int miniumPositiveInteger(int[] A) {
		 
		 
		return 0;
		 
	 }
}
