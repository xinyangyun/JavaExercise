package multiThread;

public class Tiket2 extends Thread {

	private int i = 10;

	@Override
	public void run() {
		while (i > 0) {
			System.out.println("всоъЁл..."+ i);
			i--;
		}
	}

}
