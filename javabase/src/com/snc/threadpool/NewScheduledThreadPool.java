package com.snc.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewScheduledThreadPool {
	
	public static void main(String[] args) {
		
		 //����һ�������̳߳أ�֧�ֶ�ʱ������������ִ�С����ӳ�ִ��
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		
		//�ӳ�һ���ÿ�������
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�ӳ�һ���ÿ3��ִ��һ��");
			}
			
		}, 1, 3, TimeUnit.SECONDS);
		
		
	}
	
}
