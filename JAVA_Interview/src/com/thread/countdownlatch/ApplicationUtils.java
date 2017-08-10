package com.thread.countdownlatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationUtils {
	
	
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch=new CountDownLatch(2);
		List<BaseService> services=new ArrayList<>();
		services.add(new NetWorkCheck(latch));
		services.add(new ApplicationService(latch));
		
		ExecutorService exe=Executors.newFixedThreadPool(2);
		for(int i=0;i<services.size();i++) {
			exe.submit(services.get(i));
		}
		latch.await();
	}

}
