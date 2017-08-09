package com.inheritance;

public interface PQR {

	
	default void run() {
		System.out.println(" run method of PQR");
	}
	
	default void sun() {
		System.out.println(" sun method of PQR");
	}
}
