package com.qianfeng.week2.day3.dOverride;

public class Animal {
	
	protected Object bark() {
		System.out.println("bark~");
		return this;
	}
}

class Dog extends Animal {
	// ����ʵ�ָ����е�bark����
	// �������ʵ�֣����ǵ������ʵ��
	// ע��
	@Override 
	protected Animal bark() {
		System.out.println("������~");
		
		return null;
	}
}

class Cat extends Animal {}


