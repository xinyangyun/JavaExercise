package com.snc.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPoolTest {
	public static void main(String[] args) {
		
		//����һ���̳߳�
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		
		for (int i = 0; i <10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cachedThreadPool.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//��ӡ����ִ�еĻ�����Ϣ
					System.out.println(Thread.currentThread().getName() + "���ڱ�ִ��");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			});
			
		}
		
	}
}
