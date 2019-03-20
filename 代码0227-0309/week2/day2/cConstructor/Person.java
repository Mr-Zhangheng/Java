package com.qianfeng.week2.day2.cConstructor;

public class Person {
	String name = "laowang";
	int age = 20;
	
	float height;
	float weight;
	char gender;
	
	Person(String name, int age, char gender, float height, float weight) {
		// 调用两个参数的构造方法，来对name和age进行赋值
		// 关键字this：通过this()来调用本类中其他的构造方法
		// 这一句话必须是第一句
		this(name, age);
		
		
		System.out.println("五个参数的构造方法调用了");
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		
	}
	
	
	/**
	 * 这个就是一个构造方法，因为这个方法没有参数，所以叫做 无参构造
	 */
	Person() {
		System.out.println("Person类的无参构造方法被调用了");
		this.name = "xiaoming";
		this.age = 10;
	}
	
	Person(String name, int age) {
		this();
		System.out.println("Person类的有参构造方法被调用了");
		this.name = name;
		this.age = age;
	}
	
	/*
	// 以下三个构造都是有参构造
	Person(int age) {}
	Person(String name) {}
	Person(String name, int age) {}
	*/
}
