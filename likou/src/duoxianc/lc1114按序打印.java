package duoxianc;

public class lc1114�����ӡ {
	public static void main(String[] args) {

	}

	public lc1114�����ӡ() {

	}

	
	volatile int count = 1;
	public void first(Runnable printFirst) throws InterruptedException {
		
		printFirst.run();
		count++;
	}

	public void second(Runnable printSecond) throws InterruptedException {
		while (count!=2);
		printSecond.run();
		count++;
	}

	public void third(Runnable printThird) throws InterruptedException {
		while (count!=3);
		printThird.run();
	}
}
