package com.qianfeng.week2.day3.cPremission.sub;

public class Animal {
	// ֻ���ڵ�ǰ���н��з���
	private String name;
	int age;
	protected char gender;
	public float height;
	
	void show() {
		this.name = "";
		this.age = 10;
		this.gender = 'a';
		this.height = 10;
	}
}

class Person extends Animal {
	void display() {
		// this.name = "";
		this.age = 20;
		this.gender = 'b';
		this.height = 10;
	}
}
