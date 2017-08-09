package com.hackrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RansomNote {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int m = in.nextInt();
	        int n = in.nextInt();
	        String magazine[] = new String[m];
	        for(int magazine_i=0; magazine_i < m; magazine_i++){
	            magazine[magazine_i] = in.next().trim();
	        }
	        String ransom[] = new String[n];
	        for(int ransom_i=0; ransom_i < n; ransom_i++){
	            ransom[ransom_i] = in.next().trim();
	        }
	        
	      String result=  checkRansom(magazine,ransom);
	       System.out.println(result);
	 }
	 
	public static String checkRansom(String magazine[], String ransom[]) {
		if ((null != magazine && magazine.length > 0) && (null != ransom && ransom.length > 0)) {
			 LinkedList<String> ll = new LinkedList<String>(Arrays.asList(magazine));
			 
			 for (int i = 0; i < ransom.length; i++)
				if ((ll.contains(ransom[i]))) {
					ll.remove(ransom[i]);
					if ((i == ransom.length - 1)) {
						return "Yes";
					} 
				}else
					return "No";
		}
		return null;
	}

}
