package com.qianfeng.week3.day4.cGeneric;

public class Program2 {
	public static void main(String[] args) {
		show(123);
	}
	
	
	// 在方法中定义一个泛型T，这个T的使用范围仅限于当前的方法
	// 包括：形参列表，返回值，方法体
	public static <T> T show(T t) {
		System.out.println(t);
		return t;
	}
}
