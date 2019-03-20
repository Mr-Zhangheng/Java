package com.qianfeng.week2.day2.cConstructor;

public class Cat {
	
	Cat() {
		System.out.println("Cat类的无参构造方法被执行了");
	}
	
	{
		System.out.println("代码段B被执行了");
	}
	
	{
		System.out.println("代码段A被执行了");
	}
	
	// 静态代码段
	static {
		System.out.println("静态代码段A被执行了");
	}
	
	static {
		System.out.println("静态代码段B被执行了");
	}
	
	static int a;
	static void test() {}
	
}
