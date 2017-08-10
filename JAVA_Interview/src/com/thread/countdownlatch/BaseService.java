package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public abstract class BaseService implements Runnable {

	private CountDownLatch latch;
	private String servicename;
	private boolean serviceup;

	public BaseService(String serviceName, CountDownLatch latch) {
		super();
		this.latch = latch;
		this.servicename = serviceName;
		this.serviceup = false;
	}

	public void verifyService() {
	}

	@Override
	public void run() {
		try {
			verifyService();
			serviceup = true;
		} finally {
			if(null!=latch)
			latch.countDown();
		}
	}

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public boolean isServiceup() {
		return serviceup;
	}

	public void setServiceup(boolean serviceup) {
		this.serviceup = serviceup;
	}

	
}
