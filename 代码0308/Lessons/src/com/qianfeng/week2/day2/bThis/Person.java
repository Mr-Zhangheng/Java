package com.qianfeng.week2.day2.bThis;

public class Person {
	
	String name;
	int age;
	char gender;
	
	void setInfo(String name, int age, char gender) {
		// �ͽ�ԭ��
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	void eat() {
		// System.out.println(this.name + "�ڳԷ�");
		System.out.println(this.name + "�ڳԵ�");
		
		this.sleep();
	}
	
	void sleep() {}
	
}
