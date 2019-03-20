package com.qianfeng.week3.day1.eInnerClass.aInstance;

public class OutterClass {
	
	public String name;
	
	public class InnerClass {
		
		public String name;
		
		public void show(String name) {
			System.out.println("InnerClass Show");
			
			
			System.out.println(name);					// 参数
			System.out.println(this.name);				// 内部类属性
			System.out.println(OutterClass.this.name);	// 外部类属性
		}
	}
	
	public void show() {
		System.out.println("OutterClass Show");
		
		// 实例化内部类对象
		// this.new InnerClass();
	}
}
