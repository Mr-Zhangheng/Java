package com.qianfeng.week2.day5.bLambda.lambda;

public interface Calculate {
	/**
	 * 返回两个整型数字计算的结果
	 * @param a
	 * @param b
	 * @return
	 */
	int calculate(int a, int b);
	
	default void show() {
		System.out.println("aaa");
	}
}

interface Demo {
	void add(int a);
}