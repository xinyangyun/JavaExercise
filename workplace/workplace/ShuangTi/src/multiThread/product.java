package multiThread;

public class product {
	private String item;
	int i = 0;
	
	
	public void setItem() {
		this.item = i+"";
		System.out.println("������"+item);
		i++;
	}
	
	public void getItem() {
		System.out.println("������"+item);
	}
}
