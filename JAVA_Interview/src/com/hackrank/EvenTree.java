package com.hackrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EvenTree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();
        int parent = 0, child = 0;
        int count = 0;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
        for(int i=1; i<=n; i++ )
            map.put(i, new ArrayList<Integer>());
        for(int i=0; i<e; i++) {
            child = s.nextInt();
            parent = s.nextInt();
            map.get(parent).add(child);            
        }
        for(int i=2; i<=n; i++) {
        	if(map.get(i).size() % 2 == 1)
        		count++;
        }
        System.out.println(count);
        s.close();
    }
	

}
