package com.qianfeng.week3.day1.eInnerClass.aInstance;

public class OutterClass {
	
	public String name;
	
	public class InnerClass {
		
		public String name;
		
		public void show(String name) {
			System.out.println("InnerClass Show");
			
			
			System.out.println(name);					// ����
			System.out.println(this.name);				// �ڲ�������
			System.out.println(OutterClass.this.name);	// �ⲿ������
		}
	}
	
	public void show() {
		System.out.println("OutterClass Show");
		
		// ʵ�����ڲ������
		// this.new InnerClass();
	}
}
