package com.qianfeng.week4.bSet;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		// TreeSet: 是一个采用二叉树结构来存储元素的一个集合。在这个集合中：
		// 1. Set接口的实现类，排重。
		// 2. TreeSet是一个自带排序的集合。
		/*TreeSet<Integer> set = new TreeSet<>();
		Collections.addAll(set, 10, 10, 20, 30, 8, 9, 10, 20, 25, 0, 9, 0, -1, 100);
		System.out.println(set);*/
		
		// 
		/*
		TreeSet<Dog> sets = new TreeSet<>();
		
		sets.add(new Dog("xiaobai", 10));
		sets.add(new Dog("xiaohei", 7));
		sets.add(new Dog("dahuang", 6));
		sets.add(new Dog("wangcai", 3));
		
		System.out.println(sets);
		*/
		
		TreeSet<Dog> sets = new TreeSet<Dog>((d1, d2) -> d1.age - d2.age);
		
		sets.add(new Dog("xiaobai", 10));
		sets.add(new Dog("xiaohei", 7));
		sets.add(new Dog("dahuang", 6));
		sets.add(new Dog("wangcai", 3));
		
		System.out.println(sets);
	}
}
class Dog {
	public String name;
	public int age;
	/**
	 * @param name
	 * @param age
	 */
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
/*	@Override
	public int compareTo(Dog o) {
		return this.age - o.age;
	}*/
	
	
}