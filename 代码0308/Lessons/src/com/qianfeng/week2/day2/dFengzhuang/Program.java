package com.qianfeng.week2.day2.dFengzhuang;

public class Program {
	public static void main(String[] args) {
		
		// ʵ����һ��Person����	
		Person xiaoming = new Person();
		xiaoming.name = "xiaoming";
		
		xiaoming.setAge(1000);
		System.out.println(xiaoming.getAge());	// 0
	}
}
