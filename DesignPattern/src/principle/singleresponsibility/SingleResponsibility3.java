package principle.singleresponsibility;

public class SingleResponsibility3 {
	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.run("����");
		vehicle2.runWater("�ִ�");
		vehicle2.runAir("�ɻ�");
		
	}
}


//��ʽ���ķ���
//1.�����޸ķ���û�ж�ԭ������������޸ģ�ֻ�������˷���
//2.������Ȼû������������������ص�һְ��ԭ�򣬵����ڷ��������ϣ���Ȼ����ѭ��һְ��
class Vehicle2 {
	public void run(String vehicle) {
		System.out.println(vehicle + " �ڹ�·������....");
	}
	
	public void runAir(String vehicle) {
		System.out.println(vehicle + " �����������....");
	}
	
	public void runWater(String vehicle) {
		System.out.println(vehicle + " ��ˮ��������....");
	}
}