package com.qianfeng.week2.day4.eInterface.interfaceUsagePro;

import java.util.Arrays;
import java.util.Random;

public class Program {
	public static void main(String[] args) {
		// 实例化10个Person对象，并将它们存入一个数组中，对这个数组中的10个Person对象做升序排序（按照年龄做升序）
		
		Random random = new Random();
		
		Person[] persons = new Person[10];
		for (int i = 0; i < persons.length; i++) {
			Person xiaoming = new Person("xiaoming" + i + "号", random.nextInt(30) + 1);
			
			persons[i] = xiaoming;
		}
		
		System.out.println("排序前--------------------------");
		for (Person xiaoming : persons) {
			System.out.println(xiaoming);
		}
		
		
		// Arrays.sort(persons);
		
		// Comparator c = new MySort();
		
		Arrays.sort(persons, new MySort());
		
		System.out.println("排序后--------------------------");
		for (Person xiaoming : persons) {
			System.out.println(xiaoming);
		}
	}
}
