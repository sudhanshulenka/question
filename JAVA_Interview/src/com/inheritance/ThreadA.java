package com.inheritance;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ThreadA extends Thread{

	
	 public void run() {
	        System.out.println("Hello from a ThreadA!");
	    }

	    public static void main(String args[]) {
	    	ZoneId zone1 = ZoneId.of("America/Los_Angeles");
	    	  DateTimeFormatter datetimeformat= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
	    	  LocalDateTime now = LocalDateTime.now(zone1);
	    	String date=  datetimeformat.format(now);
	    	 System.out.println(date);
	    }
}
