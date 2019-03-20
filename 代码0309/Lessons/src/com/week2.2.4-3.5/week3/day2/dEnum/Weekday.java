package com.qianfeng.week3.day2.dEnum;

public enum Weekday {
	Monday(0), Tuesday(1), Wednesday(2), Thursday(3), Friday(4), Saturday(5) {
		@Override
		public void show() {
			System.out.println("星期六");
		}
		
		@Override
		public int getValue() {
			return 666;
		}
	}, Sunday(6);
	
	// 如果需要在枚举中写属性、方法...需要在最后一个枚举常量后， 加上一个分号作为结束
	private int value;
	
	// 1. 在枚举中写构造方法, 枚举中的构造方法，一般情况下我们会做成私有的
	private Weekday(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void show() {
		System.out.println("hello world");
	}
	
}
