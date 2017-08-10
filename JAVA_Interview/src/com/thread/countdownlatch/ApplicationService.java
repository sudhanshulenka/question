package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class ApplicationService extends BaseService {

	public ApplicationService(CountDownLatch latch) {
		super(" Application service", latch);
	}

	public void verifyService() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(this.getServicename() + " is up");
	}

}
