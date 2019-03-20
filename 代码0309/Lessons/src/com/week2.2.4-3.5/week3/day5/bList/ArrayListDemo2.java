package com.qianfeng.week3.day5.bList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		Random random = new Random();
		// 实例化一个集合，存储20个Person对象。
		ArrayList<Person> list = new ArrayList<>();
		// 添加
		for (int i = 0; i < 20; i++) {
			list.add(new Person("xiaoming" + i + "号", random.nextInt(20) + 10, random.nextInt(30) + 150, random.nextInt(20) + 60));
		}
		// 公斤改成市斤
		list.forEach(ele -> ele.weight *= 2);
		// sort(): 对集合中的元素进行排序。
		/*
		list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.weight - o2.weight;
			}
		});
		*/
		list.sort((p1, p2) -> p1.weight - p2.weight);
		for (Person xiaoming : list) {
			System.out.println(xiaoming);
		}
	}
}
class Person {
	public String name;
	public int age;
	public int height;
	public int weight;
	/**
	 * @param name
	 * @param age
	 * @param height
	 * @param weight
	 */
	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}