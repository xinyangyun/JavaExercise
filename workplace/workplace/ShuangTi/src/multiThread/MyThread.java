package multiThread;

public class MyThread implements Runnable {
	private int i = 10;

	@Override
	synchronized public void run() {
		while (true) {
			if (i > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "   " + i);
				i--;
			} else {
				break;
			}
		}

//		while (true) {
//			synchronized (this) {
//				if (i > 0) {
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + "   " + i);
//					i--;
//				} else {
//					break;
//				}
//			}
//		}
	}

//	public static void main(String[] args) {
//		MyThread myThread = new MyThread();
//
//		Thread thread = new Thread(myThread);
//		Thread thread2 = new Thread(myThread);
//		thread.start();
//		thread2.start();
//	}

}
