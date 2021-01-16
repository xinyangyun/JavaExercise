package com.snc.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		//ģ�������Ҫ1��
		Thread.sleep(1000);
		
		return 2;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//ʹ�� 
		ExecutorService executor = Executors.newCachedThreadPool();
		Task task = new Task();
		Future<Integer> resutlt = executor.submit(task);
		System.out.println(resutlt.get());
	}

}
