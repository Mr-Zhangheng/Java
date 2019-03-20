package com.qianfeng.week4.aList;

import java.util.*;

/**
 * 对集合中元素进行排序，两个常用的接口：
 * Comparator
 * Comparable
 * @author luds
 */

public class SortDemo {
	public static void main(String[] args) {
		
		LinkedList<Person> list = new LinkedList<>();
		
		Collections.addAll(list, new Person("xiaoming", 10), new Person("laowang", 20), new Person("laotie", 30), new Person("laodi", 15));
		
		// list.sort((p1, p2) -> p1.age - p2.age);

		Collections.sort(list);
		
		for (Person person : list) {
			System.out.println(person);
		}
	}
}


class Person implements Comparable<Person> {
	public String name;
	public int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	/**
	 * 自定义一个两个Person对象进行比较的规则
	 * 哪两个对象在比较？
	 * this, o
	 */
	public int compareTo(Person o) {
		
		return this.age - o.age;
	}
}

