package ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadModel {
	public static void main(String[] args) {
		final ThreadPoolExecutor pool = new ThreadPoolExecutor(2 , 3, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5),Executors.defaultThreadFactory());
		
		for (int i = 0; i < 7; i++) { 
			pool.execute(new Task(i));
		}
		
		pool.shutdown();
		
	}
}
