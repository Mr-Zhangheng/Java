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
	
	// ���⣺���һ�������ж�����η�������Щ���η����Ⱥ�˳������ν
	// public abstract void show();
	// abstract public void dis();
	// ���ǣ�һ������£����ǻ���д����Ȩ��
}

class B extends A {

	@Override
	public int add(int a, int b) {
		return 0;
	}

	
}
