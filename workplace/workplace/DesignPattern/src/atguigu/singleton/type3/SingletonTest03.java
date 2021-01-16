package atguigu.singleton.type3;


public class SingletonTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����ʽ1���̲߳���ȫ~");
		//����
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
	
	//�ṩһ����̬�Ĺ��з�������ʹ�õ��÷���ʱ����ȥ����instance
	//������ʽ
	public static Singleton getInstance() {
		if (Instance == null ) {
			Instance = new Singleton();
		}
		return Instance;
	}
	
	
}
