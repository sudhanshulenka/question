package com.codility;

public class BinaryGap {

	public static void main(String[] args) {
		String data = Integer.toBinaryString(1041);
		String[] binarydata = data.split("1");
		int max = 0;
		for (int i = 0; i < binarydata.length; i++) {
			if (max < binarydata[i].length()) {
				max = binarydata[i].length();
			}
		}
		System.out.println(max);
	}
	

}
