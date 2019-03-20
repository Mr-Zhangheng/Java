package com.qianfeng.week2.day4.dAbstract;

public class Program {
	public static void main(String[] args) {
		Dog xiaoming = new Dog();
		xiaoming.bark();
		
		Cat xiaoli = new Cat();
		xiaoli.bark();
		
		xiaoming.name = "";
		xiaoli.age = 10;
		
		/*
		Animal animal = new Animal();
		animal.bark();
		*/	
	}
}

abstract class A {
	
	public abstract int add(int a, int b);
	
	// public final abstract void show();
	
	// private abstract void show();
	
	// 题外：如果一个方法有多个修饰符，则这些修饰符的先后顺序无所谓
	// public abstract void show();
	// abstract public void dis();
	// 但是，一般情况下，我们会先写访问权限
}

class B extends A {

	@Override
	public int add(int a, int b) {
		return 0;
	}

	
}
