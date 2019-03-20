package com.qianfeng.week2.day5.aExercise.exercise2;

/**
 * 交通工具抽象类
 * @author luds
 */
public abstract class TrafficTools {
	/**
	 * 驾驶
	 */
	public abstract void drive();
}

/**
 * 交通工具子类-汽车类
 * @author luds
 */
class Car extends TrafficTools {

	@Override
	public void drive() {
		System.out.println("汽车在马路上行驶");
	}
}

/**
 * 火车类
 * @author luds
 */
class Train extends TrafficTools {

	@Override
	public void drive() {
		System.out.println("火车在铁路上行驶");
	}
}

class Plane extends TrafficTools {

	@Override
	public void drive() {
		System.out.println("飞机在天空中行驶");
	}
}
