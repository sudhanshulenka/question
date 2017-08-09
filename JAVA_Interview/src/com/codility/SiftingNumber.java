package com.codility;

public class SiftingNumber {

	
	public static void main(String[] args) {
		int sifted=getBitSwapCount(10,20);
		System.out.println(sifted);
	}
	
	static int  getBitSwapCount(int x, int y) {
		int count = 0;
		for(int z = x^y; z!=0; z = z>> 1)
		{
		   count += z & 1;
		}
		return count; 
		}
}
