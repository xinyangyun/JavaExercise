package atguigu.singleton.type4;


public class SingletonTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����ʽ2���̰߳�ȫ~");
		//����
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);//true
		System.out.println("1:"+instance.hashCode());
		System.out.println("2:"+instance2.hashCode());
	}

}

//����ʽ���̰߳�ȫ��ͬ��������
class Singleton {
	
	private static Singleton Instance;
	
	private Singleton() {
		
	}
	
	//�ṩһ����̬�Ĺ��з�����������ͬ������Ĵ��룬����̰߳�ȫ����
	//������ʽ
	public static synchronized Singleton getInstance() {
		if (Instance == null ) {
			Instance = new Singleton();
		}
		return Instance;
	}
	
	
}
