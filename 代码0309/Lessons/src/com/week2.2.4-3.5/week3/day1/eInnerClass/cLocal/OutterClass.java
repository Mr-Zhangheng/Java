package com.qianfeng.week3.day1.eInnerClass.cLocal;

public class OutterClass {

	String name;
	
	public void show() {
		String name1 = null;	// 这个无法访问。
		// 局部内部类
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
