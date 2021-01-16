package com.snc.strategy.improve;



/**
 * @author wangshunmin
 * @ddd ����ģʽ
 */
public abstract class Duck {
	
	//���ԣ����Խӿ�
	FlyBehavior flyBehavior;
	//��������<->
	QuackBehavior quackBehavior;
	
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
		
		//�Ľ�
		if (flyBehavior != null) {
			flyBehavior.fly();
		}
		
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
