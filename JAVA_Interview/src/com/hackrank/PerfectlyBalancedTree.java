package com.hackrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PerfectlyBalancedTree {

	public static void main(String[] args) {
		PerfectlyBalancedTree eq = new PerfectlyBalancedTree();
		//int[] A = { 6, 6, 2, 1, 4, 3, 5, 1 };
		int[] A = { 5,20, 10, 4, 50,100,20 };
		solution(A,12);
	}

	private static void solution(int[] a,int marginOfError) {
		if(null!=a && a.length>0) {
		int indexCount = 0;
		// Java 8 to do
		// List<Integer> dataList =
		// IntStream.of(a).boxed().sorted().collect(Collectors.toList());
		List<Integer> dataList = new ArrayList<>(a.length);
		for (int i = 0; i < a.length; i++) {
			dataList.add(a[i]);
		}
		Collections.sort(dataList);
		List<Integer> leftsideArray = new LinkedList<>();
		leftsideArray.add(dataList.get(indexCount));
		dataList.remove(indexCount);
		List<Integer> rightsideArray = new LinkedList<>();

			while (!dataList.isEmpty()) {
				int data = dataList.remove(indexCount);
				if (!(leftsideArray.contains(data) || rightsideArray.contains(data))) {
					int leftarraySum = sumListData(leftsideArray);
					int rightarraySum = sumListData(rightsideArray);
					if (marginOfError > 0) {
						if ((rightarraySum - leftarraySum) - marginOfError -leftsideArray.size()< 0) {
							rightsideArray.add(data);
						} else {
							leftsideArray.add(data);
						}
					} else {
						if ((rightarraySum - leftarraySum) < 0) {
							rightsideArray.add(data);
						} else {
							leftsideArray.add(data);
						}
					}
				}
			}
		System.out.println( "Perfectly Balanced "+leftsideArray+"on left side ;"+rightsideArray+" on right side");
		}
	}
	
	public static Integer sumListData(List<Integer> dataList) {
		if (!dataList.isEmpty()) {
			Integer sum = 0;
			for (int i = 0; i < dataList.size(); i++) {
				sum += dataList.get(i);
			}
			return sum;
		}
		return 0;
	}

}
