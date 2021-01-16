package generic;

public class Generic<T> {

	private T key;

	public Generic(T key) {
		this.key = key;
	}

	public T getKey() {
		return key;
	}

	public void showKeyValue(Generic<Number> obj) {
		System.out.println("∑∫–Õ≤‚ ‘£¨key is " + obj.getKey());
	}
	
	public void showKeyValue1(Generic<? extends Number> obj) {
		System.out.println("∑∫–Õ≤‚ ‘£¨key is " + obj.getKey());
	}

	
	
}
