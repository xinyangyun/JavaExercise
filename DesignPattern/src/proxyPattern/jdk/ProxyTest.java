package proxyPattern.jdk;

public class ProxyTest {
	public static void main(String[] args) {
		LiuDeHua ldh = new LiuDeHua();
		StarProxy proxy = new StarProxy();
		proxy.setTarget(ldh);
		Object obj = proxy.CreateProxyedOBJ();
		Star Star = (Star) obj;
		Star.dance("ΑυµΒ»ª");
	}
}
