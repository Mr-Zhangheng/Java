package com.qianfeng.week2.day4.eInterface.interfaceUsagePro;

import java.util.Arrays;
import java.util.Random;

public class Program {
	public static void main(String[] args) {
		// ʵ����10��Person���󣬲������Ǵ���һ�������У�����������е�10��Person�������������򣨰�������������
		
		Random random = new Random();
		
		Person[] persons = new Person[10];
		for (int i = 0; i < persons.length; i++) {
			Person xiaoming = new Person("xiaoming" + i + "��", random.nextInt(30) + 1);
			
			persons[i] = xiaoming;
		}
		
		System.out.println("����ǰ--------------------------");
		for (Person xiaoming : persons) {
			System.out.println(xiaoming);
		}
		
		
		// Arrays.sort(persons);
		
		// Comparator c = new MySort();
		
		Arrays.sort(persons, new MySort());
		
		System.out.println("�����--------------------------");
		for (Person xiaoming : persons) {
			System.out.println(xiaoming);
		}
	}
}
