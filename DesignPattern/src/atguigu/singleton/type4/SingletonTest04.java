package atguigu.singleton.type4;


public class SingletonTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("懒汉式2，线程安全~");
		//测试
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);//true
		System.out.println("1:"+instance.hashCode());
		System.out.println("2:"+instance2.hashCode());
	}

}

//懒汉式（线程安全，同步方法）
class Singleton {
	
	private static Singleton Instance;
	
	private Singleton() {
		
	}
	
	//提供一个静态的共有方法，加入了同步处理的代码，解决线程安全问题
	//即懒汉式
	public static synchronized Singleton getInstance() {
		if (Instance == null ) {
			Instance = new Singleton();
		}
		return Instance;
	}
	
	
}
