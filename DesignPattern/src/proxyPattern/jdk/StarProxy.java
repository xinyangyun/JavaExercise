package proxyPattern.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy implements InvocationHandler{
	
	//Ŀ���࣬Ҳ���Ǳ��������
	private Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//�����������ǿ
		System.out.println("��Ǯ");
		
		//�ַ�target�����з���
		Object result = method.invoke(target, args);
		
		System.out.println("dddd");
		
		return result;
	}
	
	public Object CreateProxyedOBJ() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

}
