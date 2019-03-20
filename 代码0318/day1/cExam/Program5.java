package com.qianfeng.week5.day1.cExam;

import java.util.LinkedList;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String message = scanner.nextLine();
		
		Student xiaoming = new Student(message);
		
		
		LinkedList<Student> list = new LinkedList<>();
		
		// add
		
		list.sort((s1, s2) -> s1.getAll() - s2.getAll());
		
		
		
		scanner.close();	
	}
}

class Student {
	public String name;
	public int java;
	public int hadoop;
	public int spark;
	
	
	private int all;
	
	
	public Student(String message) {
		
		String[] msgs = message.split(",");
		
		this.name = msgs[0];
		this.java = Integer.valueOf(msgs[1]);
		this.hadoop = Integer.valueOf(msgs[2]);
		this.spark = Integer.valueOf(msgs[3]);
		
	}
	
	public Student(String name, int java, int hadoop, int spark) {
		this.name = name;
		this.java = java;
		this.hadoop = hadoop;
		this.spark = spark;
		
		this.all = this.java + this.hadoop + this.spark;
	}
	
	public int getAll() {
		return this.all;
	}
}
