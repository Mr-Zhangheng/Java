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
		System.out.println("������");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("������");
	}
}

class Rabbit extends Animal {
	// �൱��Rabbit���������һ�����󷽷���bark
	// ���ǣ�Rabbit����಻�ǳ�����
	
	@Override
	public void bark() {
		
	}
}
