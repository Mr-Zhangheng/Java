package com.qianfeng.week3.day4.cGeneric;

public class Person<E> {
	// ���ڣ���������о�������һ�����ͣ�����������E
	
	public E element;
	
	public void show(E e) {
		
	}
}

/**
 * ��������ж�����һ������E��������������ͣ��������ж���ķ��ͽ��и�����
 */
class Woman<T> extends Person<T> {
	
}

class Man extends Person<String> {
	
}
