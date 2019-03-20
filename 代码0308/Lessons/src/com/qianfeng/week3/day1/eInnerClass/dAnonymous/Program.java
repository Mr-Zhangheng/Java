package com.qianfeng.week3.day1.eInnerClass.dAnonymous;

public class Program {
	public static void main(String[] args) {
		// 这一句话：
		// 1. 实例化了一个Person类的子类对象
		// 2. 将这个子类对象做了一个向上转型，到Person类型。
		Person xiaoming = new Person() {
			// 此时，这里是一个匿名类
			// 这个类和Person的关系：是Person的子类
			@Override
			public void show() {
				System.out.println("匿名内部类中的Show方法");
			}
		};
		
	}
}

class Person {
	public void show() {
		System.out.println("Person Show");
	}
}
