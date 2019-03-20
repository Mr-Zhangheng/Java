package com.qianfeng.week3.day3.cException;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		Dog xiaoming = new Dog();
		
		try {
			xiaoming.setLegs(0);
		} catch (NumberOfLegException e) {
			e.printStackTrace();
		}
	}
}

// 动物类：有多少条腿
class Dog extends Animal {
	
	private int legs;
	
	public void setLegs(int legs) throws NumberOfLegException {
		if (legs != 4) {
			// 说明这个数值有问题
			NumberOfLegException exception = new NumberOfLegException("狗的腿的数量一定是4个才合法");
			
			throw exception;
		}
		else {
			this.legs = legs;
		}
	}
	
}


// 自定义异常
class NumberOfLegException extends Exception {
	
	/**
	 * 通过一个异常描述信息来实例化一个异常对象
	 * @param message
	 */
	public NumberOfLegException(String message) {
		// 怎么样去设置这个异常信息？
		super(message);
	}
}

