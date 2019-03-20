package com.qianfeng.week2.day4.aExercise;

public class Program1 {
	public static void main(String[] args) {
		// 实例化一个Student对象
		Student xiaoming = new Student();
		xiaoming.work();		// 
		
		
		// 实例化一个Leader对象
		Leader xiaowang = new Leader();
		xiaowang.work();
		xiaowang.meeting();
		
		
		Worker xiaoqiang = new Worker();
		xiaoqiang.work();
		
	}
}

class Person {
	public String name;
	public int age;
	public char gender;
	public String country;
	
	public void eat() {}
	public void sleep() {}
	public void work() {}
}

class Student extends Person {
	public String school;
	public String id;
	
	@Override
	public void work() {
		System.out.println("学生在学习");
	}
}

class Leader extends Student {
	public String job;
	
	public void meeting() {
		System.out.println("学生干部在开会");
	}
}

class Worker extends Person {
	public int workAge;
	public int company;
	
	@Override
	public void work() {
		System.out.println("搬砖");
	}
}
