package com.qianfeng.week3.day1.eInnerClass.dAnonymous;

public class Program {
	public static void main(String[] args) {
		// ��һ�仰��
		// 1. ʵ������һ��Person����������
		// 2. ����������������һ������ת�ͣ���Person���͡�
		Person xiaoming = new Person() {
			// ��ʱ��������һ��������
			// ������Person�Ĺ�ϵ����Person������
			@Override
			public void show() {
				System.out.println("�����ڲ����е�Show����");
			}
		};
		
	}
}

class Person {
	public void show() {
		System.out.println("Person Show");
	}
}
