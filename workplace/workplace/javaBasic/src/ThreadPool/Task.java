package ThreadPool;

public class Task implements Runnable{

	private int nov;
	
	public Task(int i) {
		this.nov = i;
	}
	
	@Override
	public void run() {
		
		System.out.println("ִ�е�ǰ������߳��ǣ�"+Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("��������"+nov+ "����ִ��...");
	}

}
