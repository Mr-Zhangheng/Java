package com.qianfeng.week3.day1.aExercise.exercise2;

public class Program {
	public static void main(String[] args) {
		
		Person[] persons = new Person[10];
		
		// xxx
		
		// MyArrayTools.sort(persons, new SortByAge());
		
		MyArrayTools.sort(persons, (p1, p2) -> {  
			return p1.height - p2.height;
		});
		
		MyArrayTools.sort(persons, (p1, p2) -> p1.height - p2.height);
	}
}
