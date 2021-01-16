package proxyPattern.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{
	
	
	public Object CreateProxyedObj(Class<?> clazz) {
		
		Enhancer enhancer = new Enhancer();
		
		enhancer.setSuperclass(clazz);
		
		enhancer.setCallback(this);
		
		return enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		
		System.out.println(" ’«Æ");
		
		return arg3.invokeSuper(arg0, arg2);
	}

}
