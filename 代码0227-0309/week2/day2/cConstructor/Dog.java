package com.qianfeng.week2.day2.cConstructor;

public class Dog {
	Dog() {
		System.out.println("Dog的无参构造方法被执行了");
	}
	
	String name;
	
	Dog(String name) {
		this.name = name;
	}
}
