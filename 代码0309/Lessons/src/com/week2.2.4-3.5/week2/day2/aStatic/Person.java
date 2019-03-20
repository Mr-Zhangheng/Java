package com.qianfeng.week2.day2.aStatic;

public class Person {
	String name;
	int age;
	
	static int count;
	
	void show() {
		// 在非静态方法中可以直接访问非静态的成员 
		name = "xiaoming";
		age = 10;
		show();
		// 在非静态方法中可以直接访问非静态的成员
		count = 1;
		display();
	}
	static void display() {
		// 静态方法中可以直接访问静态的成员
		count = 1;
		// 静态方法中不能直接访问非静态的成员
		// age = 10;
		// show();
	}
}
