package com.qianfeng.week2.day3.dOverride;

public class Animal {
	
	protected Object bark() {
		System.out.println("bark~");
		return this;
	}
}

class Dog extends Animal {
	// 重新实现父类中的bark方法
	// 用子类的实现，覆盖掉父类的实现
	// 注解
	@Override 
	protected Animal bark() {
		System.out.println("汪汪汪~");
		
		return null;
	}
}

class Cat extends Animal {}


