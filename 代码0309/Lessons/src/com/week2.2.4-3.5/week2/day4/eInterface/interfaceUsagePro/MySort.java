package com.qianfeng.week2.day4.eInterface.interfaceUsagePro;

import java.util.Comparator;

public class MySort implements Comparator {

	@Override
	// 在这个方法中，可以去定制一个用来比较指定类型的两个元素的规则
	// == 0: o1 == o2
	// > 0: o1 > o2
	// < 0: o1 < o2
	public int compare(Object o1, Object o2) {
		
		if (o1 instanceof Person && o2 instanceof Person) {
			// 做向下转型，来比较年龄
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			
			/*
			if (p1.age > p2.age) {
				return 1;
			}
			else if (p1.age < p2.age) {
				return -1;
			}
			else {
				return 0;
			}
			*/
			
			return p1.age - p2.age;
		}
		
		return 0;
	}
	
}
