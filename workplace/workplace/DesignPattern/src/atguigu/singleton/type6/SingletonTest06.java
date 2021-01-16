package atguigu.singleton.type6;


public class SingletonTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("˫�ؼ�飬�̰߳�ȫ~");
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
	
	private static volatile Singleton Instance;
	
	private Singleton() {
		
	}
	
	//�ṩһ����̬�Ĺ��з�����������ͬ������Ĵ��룬����̰߳�ȫ����,ͬʱ�������������
	//ͬʱ��֤��Ч�ʣ��Ƽ�ʹ��
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
