package com.hackrank;

import java.util.Scanner;
import java.util.stream.Stream;

public class BigSort {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] unsorted = new String[n];
	        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	            unsorted[unsorted_i] = in.next();
	        }

         Stream.of(unsorted)
                    .parallel()
                    .sorted((s1, s2) -> {
                        if (s1.length() != s2.length()) {
                            return s1.length() - s2.length();
                        } else {
                            for (int i = 0; i < s1.length(); i++) {
                                if (s1.charAt(i) != s2.charAt(i)) {
                                    return s1.charAt(i) - s2.charAt(i);
                                }
                            }
                        }
                        return 0;
                    })
                    .forEachOrdered(System.out::println);
    
	    }
	 

}
