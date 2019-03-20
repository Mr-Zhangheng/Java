package com.qianfeng.week3.day1.dTemplateMode;

/**
 * 做饮料
 * @author luds
 */
public abstract class DoSomeDrink {
	
	/**
	 * 1. 烧开水
	 */
	protected void boilWater() {
		System.out.println("1.烧开水");
	}
	
	/**
	 * 2. 加佐料
	 */
	protected abstract void addSomething();
	
	/**
	 * 3. 将开水倒进杯子
	 */
	protected void addWater() {
		System.out.println("3.将开水倒进杯子里");
	}
	
	/**
	 * 做饮料
	 */
	public void doDrink() {
		boilWater();
		addSomething();
		addWater();
	}
}
