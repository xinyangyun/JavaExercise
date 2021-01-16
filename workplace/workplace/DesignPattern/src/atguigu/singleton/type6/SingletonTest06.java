package atguigu.singleton.type6;


public class SingletonTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("双重检查，线程安全~");
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
	
	private static volatile Singleton Instance;
	
	private Singleton() {
		
	}
	
	//提供一个静态的共有方法，加入了同步处理的代码，解决线程安全问题,同时解决懒加载问题
	//同时保证了效率，推荐使用
	public static synchronized Singleton getInstance() {
		if (Instance == null ) {
			synchronized (Singleton.class) {
				if (Instance == null) {
					Instance = new Singleton();
				}
			}
		}
		return Instance;
	}
	
	
}
