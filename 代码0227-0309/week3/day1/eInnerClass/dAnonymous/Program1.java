package com.qianfeng.week3.day1.eInnerClass.dAnonymous;

public class Program1 {
	public static void main(String[] args) {
		// �������ܲ���ʵ��������
		// �ǲ���ʵ������һ������������أ�
		// ���ǣ�
		// ʵ������һ��Animal��������󣬲�������һ������ת�͵�Animal����
		Animal animal = new Animal() {
			@Override
			public void bark() {
				System.out.println("������");
			}
		};
		
		
	}
}

abstract class Animal {
	public abstract void bark() ;
}
