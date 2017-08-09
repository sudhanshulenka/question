package com.hackrank;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		if(null!=s && !"".equals(s)) {
			String [] data=s.split("(?=[A-Z])");
			System.out.println(data.length);
		}
	}

}
