package com.codility;

public class RoatedDegree {
	
	public static void main(String[] args) {
		 int[][] matrix = { {1,  2,  3,  4},
				            {5,  6,  7,  8},
				            {9,  10, 11, 12},
				            {13, 14, 15, 16}
				           };
		 
		/*ANS : {{13,9,5,1},  00 ->03 ,10->02,20->01,30->00
		        {14,10,6,2},
		        {15,11,7,3},
		        {16,12,8,4}}*/
		 
		 rotateMatrixInplaceotherway(matrix);
	}

	
	private static void rotateMatrixInplaceotherway(int[][] matrix) {
		System.out.println(matrix[3][0]);
		int[][] swapedmatrix=new int[matrix.length][matrix.length]; 
		
		for(int i=0;i<matrix.length;i++) {
			
			for(int j=0;j<matrix.length;j++) {
				
			}
		}
	}
	
	
	private static void rotateMatrixInplace(int[][] matrix) {
	        int length = matrix.length-1;
	        for (int i = 0; i <= (length)/2; i++) {
	        	for (int j = i; j < length-i; j++) {
	        		int p1 = matrix[i][j];
	        		int p2 = matrix[j][length-i];
	        		int p3 = matrix[length-i][length-j];
	        		int p4 = matrix[length-j][i];
	        		
	        		matrix[j][length-i] = p1;
	        		matrix[length-i][length-j] = p2;
	        		matrix[length-j][i] = p3;
	        		matrix[i][j] = p4;
	        	}
	        }
	        System.out.println(matrix);
	}

}
