package com.qianfeng.week3.day2.cBox;

public class Program1 {
	public static void main(String[] args) {
		// װ�䣺�ɻ����������ͣ�ת��Ϊ��װ����
		// int -> Integer
		
		// int a = 10;
		// װ�䣺
		// Integer i = Integer.valueOf(a);
		// Integer i = new Integer(a);
		
		// ���䣺�ɰ�װ���ͣ�ת��Ϊ������������
		// Integer -> int
		
		// Integer i = new Integer(10);
		// ���䣺
		// int a = i.intValue();
		
		
		// int a = Integer.valueOf("123");
		
		// �Զ�װ�����Զ�����
		Integer a = 10;				// �Զ�װ��
		int b = new Integer(20);	// �Զ�����
		
		show(10);
		show(Integer.valueOf(10));
	}
	
	
	public static void show(int a) {
		System.out.println("show(int)");
	}
	
	public static void show(Integer a) {
		System.out.println("show(Integer)");
	}
}
