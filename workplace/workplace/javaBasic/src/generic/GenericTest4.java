package generic;


/**
 * 
 * ���ͷ���
 * @author CXTX1112
 *
 * @param <T>
 */
public class GenericTest4<T> {

	
	//�ڷ�������������һ�����ͷ�����ʹ�÷���E�����ַ���E����Ϊ�������͡�����������T��ͬ��Ҳ���Բ�ͬ��
    //���ڷ��ͷ�����������ʱ�����������<E>����˼�ʹ�ڷ������в�δ�������ͣ�������Ҳ�ܹ���ȷʶ���ͷ�����ʶ��ķ���
	public <E> void show_1(E t) {
		System.out.println(t.toString());
	}
	
	
	//�ڷ�������������һ�����ͷ�����ʹ�÷���T��ע�����T��һ��ȫ�µ����ͣ������뷺������������T����ͬһ������
	public <E> void show_2(E t) {
		System.out.println(t.toString());
	}
	
	
}
