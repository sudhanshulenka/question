package com.hackrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BirthdayCake {
	
	public static void main(String[] args) {
		int[] ar= {3,2,1,3};
		List<Long> candelList=new ArrayList<>();
		for(int index=0;index<ar.length;index++) {
			candelList.add(Long.valueOf(ar[index]));
		}
		Long count= candelList.stream()
		 .collect(Collectors.groupingBy(e->e,Collectors.counting()))
		 .entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
	 System.out.println(count);
	 
	 Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     //int[] ar = new int[n];
     for(int ar_i = 0; ar_i < n; ar_i++){
         ar[ar_i] = in.nextInt();
     }
	
	}

}
