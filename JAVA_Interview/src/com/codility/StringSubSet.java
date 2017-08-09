package com.codility;

public class StringSubSet {


		 public static void main(String args[])
		   {
		   String s="asdsdf";
		   int lenght=s.length();
		   for(int i=0;i<lenght;i++) {
			   for(int j=0;j<lenght-i;j++) {
				  String sub= s.substring(i, j+i);
			      System.out.println(sub);
			   }
		   }
		   
		
		   }
	
}
