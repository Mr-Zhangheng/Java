package com.qianfeng.week2.day2.cConstructor;

public class Cat {
	
	Cat() {
		System.out.println("Cat����޲ι��췽����ִ����");
	}
	
	{
		System.out.println("�����B��ִ����");
	}
	
	{
		System.out.println("�����A��ִ����");
	}
	
	// ��̬�����
	static {
		System.out.println("��̬�����A��ִ����");
	}
	
	static {
		System.out.println("��̬�����B��ִ����");
	}
	
	static int a;
	static void test() {}
	
}
