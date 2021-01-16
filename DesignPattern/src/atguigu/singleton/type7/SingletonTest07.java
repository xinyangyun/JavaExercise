package atguigu.singleton.type7;


public class SingletonTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("使用静态内部类完成单例模式");
		//测试
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);//true
		System.out.println("1:"+instance.hashCode());
		System.out.println("2:"+instance2.hashCode());
	}

}

//静态内部类完成，推荐使用
class Singleton {
	
	private static volatile Singleton Instance;
	
	private Singleton() {
		
	}
	
	//写一个静态内部类，该类中有一个静态的属性Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
		
	}
	
	//提供一个静态的共有方法，直接返回SingletonInstance.INSTANCE
	
	public static synchronized Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
	
}
