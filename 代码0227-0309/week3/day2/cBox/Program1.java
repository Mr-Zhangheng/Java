package com.qianfeng.week3.day2.cBox;

public class Program1 {
	public static void main(String[] args) {
		// 装箱：由基本数据类型，转型为包装类型
		// int -> Integer
		
		// int a = 10;
		// 装箱：
		// Integer i = Integer.valueOf(a);
		// Integer i = new Integer(a);
		
		// 拆箱：由包装类型，转型为基本数据类型
		// Integer -> int
		
		// Integer i = new Integer(10);
		// 拆箱：
		// int a = i.intValue();
		
		
		// int a = Integer.valueOf("123");
		
		// 自动装箱与自动拆箱
		Integer a = 10;				// 自动装箱
		int b = new Integer(20);	// 自动拆箱
		
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
