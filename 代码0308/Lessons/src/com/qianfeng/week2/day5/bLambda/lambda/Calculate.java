package com.qianfeng.week2.day5.bLambda.lambda;

public interface Calculate {
	/**
	 * ���������������ּ���Ľ��
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