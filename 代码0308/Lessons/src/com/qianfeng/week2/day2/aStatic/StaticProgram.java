package com.qianfeng.week2.day2.aStatic;

public class StaticProgram {
	
	void nineninetable() {}
	
	public static void main(String[] args) {
		// name age
		// 实例化一个Person对象
		Person xiaoming = new Person();
		xiaoming.name = "xiaoming";
		xiaoming.age = 10;
		xiaoming.count = 10;
		
		// Person.count = 10;
		
		Person xiaobai = new Person();
		xiaobai.name = "xiaobai";
		xiaobai.age = 20;
		xiaobai.count = 20;
		
		
		System.out.println(xiaoming.name);	// xiaoming	
		System.out.println(xiaobai.name);	// xiaobai
		
		System.out.println(xiaoming.age);	// 10
		System.out.println(xiaobai.age);	// 20 
		
		System.out.println(xiaoming.count);	// 20
		System.out.println(xiaobai.count);	// 20	
		
		// System.out.println(Person.name);
		
		xiaoming.show();
		//Person.show();
		
		xiaoming.display();
		Person.display();
		
	}
}
