package com.qianfeng.week2.day4.aExercise;

public class Program1 {
	public static void main(String[] args) {
		// ʵ����һ��Student����
		Student xiaoming = new Student();
		xiaoming.work();		// 
		
		
		// ʵ����һ��Leader����
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
		System.out.println("ѧ����ѧϰ");
	}
}

class Leader extends Student {
	public String job;
	
	public void meeting() {
		System.out.println("ѧ���ɲ��ڿ���");
	}
}

class Worker extends Person {
	public int workAge;
	public int company;
	
	@Override
	public void work() {
		System.out.println("��ש");
	}
}
