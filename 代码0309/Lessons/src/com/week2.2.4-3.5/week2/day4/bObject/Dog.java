package com.qianfeng.week2.day4.bObject;

public class Dog {
	public String name;
	public int age;
	public String color;
	
	@Override
	public String toString() {
		return String.format("Dog [name = %s, age = %d, color = %s]", this.name, this.age, this.color);
	}
}
