package com.qianfeng.week2.day3.bExtends;

public class Program {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "";
		a.age = 10;
		a.gender = 'a';
		a.eat();
		a.sleep();
		a.walk();
		
		
		Monkey m = new Monkey();
		m.eat();
		m.name = "";
		m.age = 10;
	}
}

class Animal {
	String name;
	int age;
	char gender;
	
	void eat() {}
	void sleep() {}
	void walk() {}
}

class Monkey extends Animal {
	String color;
	
	void fight() {}
}

class Tiger extends Animal {
	
}

class Wolf extends Animal {
	
}