package com.qianfeng.week2.day3.bExtends;

public class Program2 {
	public static void main(String[] args) {
		Man m = new Man();
		
		// ʵ����һ��Human����
		Human h = new Human("as");
		
	}
}

class Human {
	String name;
	int age;
	char gender;
	float height;
	float weight;
	
	
	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param height
	 * @param weight
	 */
	public Human(String name, int age, char gender, float height, float weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}



	public Human(String name) {
		this.name = name;
	}
}

class Man extends Human {
	Man() {
		// �����������ֶ����ø����еĹ��췽��
		super("xiaoming");
	}
}


class Woman extends Human {
	Woman(String name) {
		super(name);
	}
	
	Woman() {
		super("");
	}
}
