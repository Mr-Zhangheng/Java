package com.qianfeng.week3.day1.dTemplateMode;

/**
 * ������
 * @author luds
 */
public abstract class DoSomeDrink {
	
	/**
	 * 1. �տ�ˮ
	 */
	protected void boilWater() {
		System.out.println("1.�տ�ˮ");
	}
	
	/**
	 * 2. ������
	 */
	protected abstract void addSomething();
	
	/**
	 * 3. ����ˮ��������
	 */
	protected void addWater() {
		System.out.println("3.����ˮ����������");
	}
	
	/**
	 * ������
	 */
	public void doDrink() {
		boilWater();
		addSomething();
		addWater();
	}
}
