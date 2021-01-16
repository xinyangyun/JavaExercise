package com.snc.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutorTest {
	
	public static void main(String[] args) {
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 10; i++) {
			final int index = i;
			singleThreadExecutor.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						//�������������൱��˳��ִ�и�������
						System.out.println(Thread.currentThread().getName()+"���ڱ�ִ�У���ӡ��ֵ�ǣ�"+index);
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			});
		}
		
	}
	
}
