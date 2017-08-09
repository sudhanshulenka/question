package com.hackrank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class Conver24HourFormat {
	
	public static void main(String[] args) throws Exception {
		String s="07:05:45 PM";
		   SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
	       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
	       Date date = parseFormat.parse(s);
		String result=displayFormat.format(date);
		System.out.println(result);
	
	}

}
