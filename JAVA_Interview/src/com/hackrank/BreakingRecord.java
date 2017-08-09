package com.hackrank;

import java.util.Scanner;

public class BreakingRecord {

	static int[] getRecord(int[] s) {
		int[] result=new int[2];

		int maxelement = 0;
		int lowestelemnt = 0;
		for (int i = 0; i < s.length; i++) {
			if (i == 0) {
				maxelement = s[i];
				lowestelemnt = s[i];
			}

			if (s[i] > maxelement) {
				result[0] = result[0] + 1;
				maxelement=s[i];
			}

			if (s[i] < lowestelemnt) {
				result[1] = result[1] + 1;
				lowestelemnt=s[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int[] result = getRecord(s);
		String separator = "", delimiter = " ";
		for (Integer val : result) {
			System.out.print(separator + val);
			separator = delimiter;
		}
		System.out.println("");
	}

}
