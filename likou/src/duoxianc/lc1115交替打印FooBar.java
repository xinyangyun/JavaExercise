package duoxianc;

public class lc1115�����ӡFooBar {
	
	
	public static void main(String[] args) {
		
		lc1115�����ӡFooBar test = new lc1115�����ӡFooBar(3);
		try {
			test.foo(() -> System.out.print("foo"));
			test.bar(() -> System.out.println("bar"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//����
	
	private int n;

    public lc1115�����ӡFooBar(int n) {
        this.n = n;
    }
    
    volatile boolean permitFoo = true;

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n;) {
            if (permitFoo) {
            	printFoo.run();
            	i++;
            	permitFoo = false;
            }else {
            	Thread.yield();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n;) {
            if (!permitFoo) {
            	printBar.run();
            	i++;
            	permitFoo = true;
            }else {
            	Thread.yield();
            }
        }
    }
	
}
