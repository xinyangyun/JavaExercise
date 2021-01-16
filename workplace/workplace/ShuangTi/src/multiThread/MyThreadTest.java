package multiThread;

public class MyThreadTest {
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		
	}
}
