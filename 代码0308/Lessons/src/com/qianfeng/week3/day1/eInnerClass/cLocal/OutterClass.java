package com.qianfeng.week3.day1.eInnerClass.cLocal;

public class OutterClass {

	String name;
	
	public void show() {
		String name1 = null;	// ����޷����ʡ�
		// �ֲ��ڲ���
		class InnerClass {
			String name;
			
			public void show(String name) {
				System.out.println(this.name);
				System.out.println(OutterClass.this.name);
				
				System.out.println(name);
				System.out.println(name1);
			}
		}
	}
	
	
}
