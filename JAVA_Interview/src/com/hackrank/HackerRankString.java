package com.hackrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class HackerRankString {

	static final String check = "hackerrank";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		List<StringBuilder> dataString = new LinkedList<>();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			StringBuilder st=new StringBuilder(s);
			dataString.add(st);
		}

	     String checked[] = check.split("");
	    
		for (int i = 0; i < dataString.size(); i++) {
			StringBuilder data = dataString.get(i);
			int dataLength = data.length();
			for (int j = 0; j < checked.length; j++) {
				int index = data.indexOf(checked[j]);
				if (index < 0) {
					break;
				} else {
					data.deleteCharAt(index);
				}
			}
			if (dataLength - data.length() == check.length()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	/*	dataString.stream().forEach((e) -> {
			List<String> checklist = new LinkedList<>(Arrays.asList(checked));
			Stream.of(e).forEach((st) -> {
				checklist.remove(st);
			});
			if (checklist.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		});
*/
	}
}
