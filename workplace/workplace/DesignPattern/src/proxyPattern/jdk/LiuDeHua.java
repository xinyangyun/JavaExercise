package proxyPattern.jdk;

public class LiuDeHua implements Star{

	@Override
	public String sing(String name) {
		
		System.out.println("����һ������ˮ");
		
		return "����";
	}

	@Override
	public String dance(String name) {
		
		System.out.println("���ĵ�����");
		
		return "����";
	}
	
}
