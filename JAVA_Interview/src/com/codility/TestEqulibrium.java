package com.codility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestEqulibrium {
	
	
	public int solution(int[] A) {
		Stream<Integer> dataStream = IntStream.of(A).boxed();
		List<Integer> dataList = dataStream.filter(e -> (e.intValue() >= A.length)).collect(Collectors.toList());

		if (dataList.isEmpty())
			System.out.println(A.length + " is  Not in equilibrium  ");

		for (int i = 0; i <= A.length; i++) {
			int[] predata=new int[i+1];
			int[] postdata=new int[A.length-predata.length];
			System.arraycopy(A, 0, predata, 0,i+1);
			System.arraycopy(A, i+2, postdata, 0,postdata.length-1);
			int presum=IntStream.of(predata).boxed().mapToInt(Integer::intValue).sum();
			int postsum=IntStream.of(postdata).boxed().mapToInt(Integer::intValue).sum();
			if(presum==postsum)
				return predata.length;
		}
		return 0;

		
	}

	public static void main(String[] args) {
		TestEqulibrium eq = new TestEqulibrium();
		int[] A = { 6, 6, 2, 1, 4, 3,5, 1 };
		eq.solution(A);
	}

}
