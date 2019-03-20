package com.qianfeng.week2.day2.dFengzhuang;

public class Person {
	String name;
	private int age;
	
	
	
	public void setAge(int age) {
		if (age >= 0 && age <= 150) {
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	
	Person() {}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
