package duoxianc;

public class lc1115交替打印FooBar {
	
	
	public static void main(String[] args) {
		
		lc1115交替打印FooBar test = new lc1115交替打印FooBar(3);
		try {
			test.foo(() -> System.out.print("foo"));
			test.bar(() -> System.out.println("bar"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//无锁
	
	private int n;

    public lc1115交替打印FooBar(int n) {
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
