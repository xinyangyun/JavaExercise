package com.snc.strategy;



public abstract class Duck {
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void display();//��ʾѼ����Ϣ 
	
	public void quack() {
		System.out.println("Ѽ�Ӹ¸½�~~");
	}
	
	public void swim() {
		System.out.println("Ѽ�ӻ���Ӿ~~");
	}
	
	public void fly() {
		System.out.println("Ѽ�ӻ����~~");
	}
	
}
