package atguigu.singleton.type7;


public class SingletonTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ʹ�þ�̬�ڲ�����ɵ���ģʽ");
		//����
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);//true
		System.out.println("1:"+instance.hashCode());
		System.out.println("2:"+instance2.hashCode());
	}

}

//��̬�ڲ�����ɣ��Ƽ�ʹ��
class Singleton {
	
	private static volatile Singleton Instance;
	
	private Singleton() {
		
	}
	
	//дһ����̬�ڲ��࣬��������һ����̬������Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
		
	}
	
	//�ṩһ����̬�Ĺ��з�����ֱ�ӷ���SingletonInstance.INSTANCE
	
	public static synchronized Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
	
}
