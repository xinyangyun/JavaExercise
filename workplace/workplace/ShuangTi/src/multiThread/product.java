package multiThread;

public class product {
	private String item;
	int i = 0;
	
	
	public void setItem() {
		this.item = i+"";
		System.out.println("生产者"+item);
		i++;
	}
	
	public void getItem() {
		System.out.println("消费者"+item);
	}
}
