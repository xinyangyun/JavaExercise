package duoxianc;

public class lc1114�����ӡsync {
	public static void main(String[] args) {

	}
	
	private boolean firstFinshed;
	private boolean secondFinshed;
	private Object lock = new Object();

	public lc1114�����ӡsync() {

	}

	public void first(Runnable printFirst) throws InterruptedException {
		synchronized (lock) {
			printFirst.run();
			firstFinshed = true;
			lock.notifyAll();
		}
	}

	public void second(Runnable printSecond) throws InterruptedException {
		synchronized (lock) {
			while(!firstFinshed) {
				lock.wait();
			}
			printSecond.run();
			secondFinshed = true;
			lock.notifyAll();
		}
	}

	public void third(Runnable printThird) throws InterruptedException {
		synchronized (lock) {
			while (!secondFinshed) {
				lock.wait();
			}
			printThird.run();
		}
	}
}
