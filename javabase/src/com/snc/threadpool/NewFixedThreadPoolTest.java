package com.snc.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPoolTest {
	
	public static void main(String[] args) {
		//����һ�������ù̶��������̳߳�
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 10; i++) {
			
			fixedThreadPool.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName() + "���ڱ�ִ��");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			});
			
		}
		
	}
	
}
