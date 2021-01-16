package proxyPattern.cglib;

import proxyPattern.jdk.LiuDeHua;
import proxyPattern.jdk.Star;
import proxyPattern.jdk.StarProxy;

public class CglibTest {
	public static void main(String[] args) {
		int times = 1000000;
		
		LiuDeHua ldh = new LiuDeHua();
		StarProxy proxy = new StarProxy();
		proxy.setTarget(ldh);
		
		long time1 = System.currentTimeMillis();
		Star star = (Star) proxy.CreateProxyedOBJ();
		long time2 = System.currentTimeMillis();
		System.out.println("jdk创建时间："+(time2 - time1));
		
		CglibProxy proxy2 = new CglibProxy();
		long time3 = System.currentTimeMillis();
		Star star2 = (Star) proxy2.CreateProxyedObj(LiuDeHua.class);
		long time4 = System.currentTimeMillis();
		System.out.println("cglib创建时间："+(time4 - time3));
		
		long time5 = System.currentTimeMillis();
		for (int i = 1; i <= 3000; i++) {
			star.sing("ss");
			star.dance("ss");
		}
		long time6 = System.currentTimeMillis();
		System.out.println("jdk执行时间"+(time6-time5));
		
		long time7 = System.currentTimeMillis();
		for (int i = 1; i <= 3000; i++) {
			star2.sing("ss");
			star2.dance("ss");
		}
		long time8 = System.currentTimeMillis();
		System.out.println("jdk执行时间"+(time6-time5));
		System.out.println("cglib执行时间"+(time8-time7));
		
		
	}
}
