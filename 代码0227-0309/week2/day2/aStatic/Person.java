package com.qianfeng.week2.day2.aStatic;

public class Person {
	String name;
	int age;
	
	static int count;
	
	void show() {
		// �ڷǾ�̬�����п���ֱ�ӷ��ʷǾ�̬�ĳ�Ա 
		name = "xiaoming";
		age = 10;
		show();
		// �ڷǾ�̬�����п���ֱ�ӷ��ʷǾ�̬�ĳ�Ա
		count = 1;
		display();
	}
	static void display() {
		// ��̬�����п���ֱ�ӷ��ʾ�̬�ĳ�Ա
		count = 1;
		// ��̬�����в���ֱ�ӷ��ʷǾ�̬�ĳ�Ա
		// age = 10;
		// show();
	}
}
