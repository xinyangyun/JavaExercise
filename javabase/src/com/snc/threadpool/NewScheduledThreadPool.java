package com.snc.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewScheduledThreadPool {
	
	public static void main(String[] args) {
		
		 //创建一个定长线程池，支持定时及周期性任务执行——延迟执行
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		
		//延迟一秒后每三秒进行
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("延迟一秒后每3秒执行一次");
			}
			
		}, 1, 3, TimeUnit.SECONDS);
		
		
	}
	
}
