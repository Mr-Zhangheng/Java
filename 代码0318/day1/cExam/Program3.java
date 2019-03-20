package com.qianfeng.week5.day1.cExam;

import java.util.TreeSet;

public class Program3 {
	public static void main(String[] args) {
		
		TreeSet<Employee> set = new TreeSet<>((e1, e2) -> {
			if (e1.age != e2.age)
				return e1.age - e2.age;
			else if(e1.workAge != e2.workAge) 
				return e2.workAge - e1.workAge;
			else
				return e2.salary - e1.salary;
		});
		
	}
}

class Employee {
	public String name;
	
	public int age;
	public int workAge;
	public int salary;
}
