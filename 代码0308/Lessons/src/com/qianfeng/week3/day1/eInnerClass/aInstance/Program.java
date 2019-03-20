package com.qianfeng.week3.day1.eInnerClass.aInstance;

public class Program {
	public static void main(String[] args) {
		// 实例化一个外部类对象
		OutterClass outter = new OutterClass();
		// outter.show();
		
		// 实例化内部类对象
		OutterClass.InnerClass inner = outter.new InnerClass();
		
		outter.name = "outter";
		inner.name = "inner";
		
		
		inner.show("hello world");
	}
}
