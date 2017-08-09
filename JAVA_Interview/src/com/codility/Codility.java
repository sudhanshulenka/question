package com.codility;

public class Codility {

	public static void main(String[] args) {
		int[] A= {1,4,-1,3,2};
		solution(A);
	}

	public static int solution(int[] A) {
		int count=0;
		if (!(A.length == 0)) {
			int indexvalue=A[0];
			count=count+1;
			while(!(indexvalue<=0)) {    
				indexvalue=A[indexvalue];
				count=count+1;
     		}
			System.out.println(count);
		}

		return count;
	}
}
