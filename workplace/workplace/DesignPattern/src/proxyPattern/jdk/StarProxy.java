package proxyPattern.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy implements InvocationHandler{
	
	//目标类，也就是被代理的类
	private Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//这里可以做增强
		System.out.println("收钱");
		
		//分发target的所有方法
		Object result = method.invoke(target, args);
		
		System.out.println("dddd");
		
		return result;
	}
	
	public Object CreateProxyedOBJ() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

}
