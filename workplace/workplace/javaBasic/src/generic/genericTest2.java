package generic;

import java.util.ArrayList;
import java.util.List;

public class genericTest2 {
	public static void main(String[] args) {

		
		List<String> stringArrayList = new ArrayList<String>();
		List<Integer> integerArrayList = new ArrayList<Integer>();
		
		Class classStringArrayList = stringArrayList.getClass();
		Class classIntegerArrayList = integerArrayList.getClass();
		
		//�ڱ���֮��ĳ�����ȡȥ���ͻ��Ĵ�ʩ��Ҳ����˵java�еķ��ͣ�ֻ�ڱ���׶���Ч���ڱ�������У���ȷУ�鷺�ͽ����
		//�Ὣ���͵������Ϣ�����������ڶ��������뿪�����ı߽紦������ͼ�������ת���ķ�����Ҳ����˵��������Ϣ������뵽����ʱ�׶Ρ�
		//�����������߼��Ͽ��Կ����Ƕ����ͬ�����ͣ�ʵ���϶�����ͬ�Ļ������͡�
		if (classStringArrayList.equals(classIntegerArrayList)) {
			System.out.println("���Ͳ���,������ͬ");
		}
	}

}
