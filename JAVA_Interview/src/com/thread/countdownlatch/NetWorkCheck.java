package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class NetWorkCheck extends BaseService {

	public NetWorkCheck(CountDownLatch latch) {
		super("Network Service", latch);
	}
	
	public void verifyService() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(this.getServicename()+" is up");
	}

}
