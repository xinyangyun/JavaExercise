package atguigu.singleton.type3;


public class SingletonTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("懒汉式1，线程不安全~");
		//测试
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);//true
		System.out.println("1:"+instance.hashCode());
		System.out.println("2:"+instance2.hashCode());
	}

}

class Singleton {
	
	private static Singleton Instance;
	
	private Singleton() {
		
	}
	
	//提供一个静态的共有方法，当使用到该方法时，才去创建instance
	//即懒汉式
	public static Singleton getInstance() {
		if (Instance == null ) {
			Instance = new Singleton();
		}
		return Instance;
	}
	
	
}
