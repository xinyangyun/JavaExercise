package com.snc.strategy.improve;

public class PekingDuck extends Duck{

	
	//���籱��Ѽ���Է��裬���Ƿ��м���һ��
	public PekingDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new BadFlyBehavior();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("~~����Ѽ~~");
	}
	
	
}
