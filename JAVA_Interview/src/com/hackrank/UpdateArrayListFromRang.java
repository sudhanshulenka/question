package com.hackrank;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UpdateArrayListFromRang {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  arrysize = sc.nextInt();
		int[] arryObject=new int[arrysize];
		int  operationCount = sc.nextInt();
	    int[] elements=new int[operationCount];
	    
	    for(int arr_i=0; arr_i < operationCount; arr_i++){
	    	elements[0] = sc.nextInt();
	    	elements[1] = sc.nextInt();
	    	elements[2] = sc.nextInt();
	    	   for(int i=elements[0]-1;i<=elements[1]-1;i++) {
	    		   arryObject[i]=arryObject[i]+elements[2];   
	    	   }
	    }
	     List<Integer> list = IntStream.of(arryObject).boxed().collect(Collectors.toList()); 
	     Integer max= list.stream().max(Integer::compare).get(); 
	     System.out.println(max);
	}

}
