package com.ubs;

public  class AbstractA {


	public static void main(String[] args) throws InterruptedException {
	
		AbstractA ab=new AbstractA();
	     	synchronized (ab) {
	     		ab.wait();
				ab.notifyAll();
				//ab.notify();

			}
	}

}
