package com.qianfeng.week3.day1.eInnerClass.dAnonymous;

public class Program1 {
	public static void main(String[] args) {
		// 抽象类能不能实例化对象？
		// 是不是实例化了一个抽象类对象呢？
		// 不是！
		// 实例化了一个Animal的子类对象，并且做了一个向上转型到Animal类型
		Animal animal = new Animal() {
			@Override
			public void bark() {
				System.out.println("汪汪汪");
			}
		};
		
		
	}
}

abstract class Animal {
	public abstract void bark() ;
}
