package com.qianfeng.week3.day1.aExercise.exercise2;

public class SortByAge implements MyComparator {

	@Override
	public int compare(Person p1, Person p2) {
		
		return p1.age - p2.age;
	}
}
