package principle.inversion;

public class DependecyInversion {
	public static void main(String[] args) {
		Person person = new Person();
		person.recive(new Email());
	}
}

//���person������Ϣ�Ĺ���
//��ʽһ����
//1.�򵥣��Ƚ������뵽
//2.������ǻ�ȡ�Ķ�����΢�ţ����ŵȣ��������࣬ͬʱPersonsҲҪ������Ӧ�Ľ��շ�����
//3.���˼·������һ������Ľӿ�IReceiver,��ʾ�����ߣ�����Person����ӿ�IRceiver����������
// ��ΪEamil,WeiXin�ȵ����ڽ��յķ�Χ���Ǹ���ʵ��IReceiver�ӿھ�ok���������Ǿͷ���������תԭ�� 

class Person {
	public void recive(Email email) {
		System.out.println(email.getInfo());
	}
}

class Email {
	public String getInfo() {
		return "�����ʼ���Ϣ��hello��world";
	}
}
