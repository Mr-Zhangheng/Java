package com.qianfeng.week2.day4.dAbstract;

public abstract class Animal {
	
	public String name;
	public int age;
	
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void bark();
}

class Dog extends Animal {
	public void bark() {
		System.out.println("汪汪汪");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("喵喵喵");
	}
}

class Rabbit extends Animal {
	// 相当于Rabbit这个类中有一个抽象方法，bark
	// 但是，Rabbit这个类不是抽象类
	
	@Override
	public void bark() {
		
	}
}
