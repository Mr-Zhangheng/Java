package com.qianfeng.week2.day2.bThis;

public class Person {
	
	String name;
	int age;
	char gender;
	
	void setInfo(String name, int age, char gender) {
		// 就近原则
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	void eat() {
		// System.out.println(this.name + "在吃饭");
		System.out.println(this.name + "在吃蛋");
		
		this.sleep();
	}
	
	void sleep() {}
	
}
