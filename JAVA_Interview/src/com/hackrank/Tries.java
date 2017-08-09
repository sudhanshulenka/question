package com.hackrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Tries {
	
	public static void main(String[] args) {
		
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	    	List<String> words=new ArrayList<>();
	        for(int a0 = 0; a0 < n; a0++){
	        	 List<Integer> wordcount=new ArrayList<>();
	            String op = in.next();
	            String contact = in.next();
	          
	            if(op.equals("add")) {
	            	words.add(contact);
	            }
	            if(op.equals("find")) {
	            	words.forEach(wor->{
	            		int count=0;
	            		if(wor.startsWith(contact)) {
	            			count=1;
	            		}
	            	/*	int count=0;
	            		countcheck(contact, wor,count);*/
	            		wor=wor.replace(contact, " "+contact);
	            		count=count+wor.split(" ").length-1;
	            		wordcount.add(count);
	            	});

	            	int sum=wordcount.stream().mapToInt(e->e.intValue()).sum();
	                System.out.println(sum);
	            }
	        }
	        }

	private static void countcheck(String contact, String wor,int count) {
		if(wor.contains(contact)) {
			count=count+1;
			wor=wor.replace(contact, "99999");
		}
		countcheck(contact,wor,count);
	}

}
