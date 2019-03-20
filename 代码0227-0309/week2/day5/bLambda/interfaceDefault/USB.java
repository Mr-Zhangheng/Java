package com.qianfeng.week2.day5.bLambda.interfaceDefault;

public interface USB {

	void transportData();
	
	/**
	 * 这个方法可以有一个默认的实现。
	 */
	default void charge() {
		System.out.println("充电");
	}
}
