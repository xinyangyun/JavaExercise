package com.snc.strategy.improve;

public class WildDuck extends Duck{
	
	//������������FlyBehavior�Ķ���
	public WildDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new GoodFlyBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("����ҰѼ ");
	}
	
}
