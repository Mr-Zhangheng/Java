package com.qianfeng.week3.day1.eInnerClass.aInstance;

public class Program {
	public static void main(String[] args) {
		// ʵ����һ���ⲿ�����
		OutterClass outter = new OutterClass();
		// outter.show();
		
		// ʵ�����ڲ������
		OutterClass.InnerClass inner = outter.new InnerClass();
		
		outter.name = "outter";
		inner.name = "inner";
		
		
		inner.show("hello world");
	}
}
