package com.hackrank;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {
	
	
	public static void main(String[] args) {
		int[] ar=new int[6];
		List<Integer> data=new ArrayList<>();
		for(int i=0;i<ar.length;i++) {
			data.add(ar[i]);
		}
		
    int sumresult=data.stream().mapToInt(e->e.intValue()).sum();
   List<Integer> result=new ArrayList<>();
   
   if(0!= Integer.compare(0, 1)) {
    	  result.add(1);
      }
   result.add(1);
  
	}
	
	
	
	
  
}
