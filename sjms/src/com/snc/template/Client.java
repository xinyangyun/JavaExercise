package com.snc.template;

public class Client {
	
	public static void main(String[] args) {
		//�����춹����
		System.out.println("---------�����춹����----------");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		
		System.out.println("---------������������----------");
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
		
	}
	
}
