package syncandlock;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class TestPark {
	static ReentrantLock reentrantLock = new ReentrantLock();

	public static void main(String[] args) {
		Thread t1 = new Thread() {

			@Override
			public void run() {
				testsync();
			};
		};
		t1.setName("t1");

		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main ---------  1");
		LockSupport.unpark(t1); //½ÐÐÑÏß³Ì

	}

	public static void testsync() {

		System.out.println("t1 -------------- 1");		
		
		LockSupport.park();
		
		System.out.println("t1 -------------- 2");

	}
}
