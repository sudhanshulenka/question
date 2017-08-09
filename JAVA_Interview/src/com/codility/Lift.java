package com.codility;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lift {
	
	
	
	public int solution(int[] A, int[] B, int M, int X, int Y) {
		
		int maxcapacity = M;
		List<Integer> peopeleList = IntStream.of(A).boxed().collect(Collectors.toList());
		Queue<Integer> peopeleQueueList = new LinkedList<>(peopeleList);
		List<Integer> liftMovement = IntStream.of(B).boxed().collect(Collectors.toList());

		int liftmovementCount = 1;
		Integer totalweight = 0;
		Integer lastElement = 0;
		List<Integer> liftinElement = new ArrayList();
		while (!peopeleQueueList.isEmpty()) {
			if (totalweight <= Y) {
				lastElement = peopeleQueueList.remove();
				liftinElement.add(lastElement);
			} else {
				totalweight = 0;
				lastElement=0;
				peopeleQueueList.add(lastElement);
				liftinElement.remove(liftinElement.size() - 1);
				liftmovementCount = liftmovementCount + processLiftMovement(liftMovement, liftinElement, maxcapacity);
				liftinElement= new ArrayList();
			}
			totalweight = lastElement + totalweight;
		}
		
		if(!liftinElement.isEmpty() && peopeleQueueList.isEmpty()) {
			liftmovementCount = liftmovementCount + processLiftMovement(liftMovement, liftinElement, maxcapacity);
			liftinElement= new ArrayList();
		}

		return liftmovementCount;

	}

	private Integer processLiftMovement(List<Integer> liftMovement, List<Integer> liftinElement, int maxcapacity) {

		if (liftinElement.size() <= maxcapacity) {
		return liftMovement.stream().distinct().sorted().collect(Collectors.toList()).size()+1;

		} else {
			System.out.println(" Lifet over capacity");
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] A= {40,40,100,80,20};
		int[] B= {3,3,2,2,3};
		int M=3;
		int X=5;
		int Y=200;
		Lift lift=new Lift();
		lift.solution(A, B, M, X, Y);
	}

}
