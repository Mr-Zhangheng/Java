package com.qianfeng.week2.day5.bLambda.interfaceDefault;

public interface USB {

	void transportData();
	
	/**
	 * �������������һ��Ĭ�ϵ�ʵ�֡�
	 */
	default void charge() {
		System.out.println("���");
	}
}
