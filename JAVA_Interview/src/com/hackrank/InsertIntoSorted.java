package com.hackrank;

import java.util.Arrays;
import java.util.Scanner;

public class InsertIntoSorted {
	
	
	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] unsorted = new int[n];
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.nextInt();
	        }
	        int i=unsorted.length-1;
	     while(i>0) {
	        int data1=unsorted[i];
	        int data2=unsorted[i-1];
	        if(data1<data2) {
	        	unsorted[i]= data2;
	        }
	        i=i-1;
	        System.out.println(Arrays.asList(unsorted));
	     }
	}

}
