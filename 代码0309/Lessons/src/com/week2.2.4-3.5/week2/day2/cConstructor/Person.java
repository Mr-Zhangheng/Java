package com.qianfeng.week2.day2.cConstructor;

public class Person {
	String name = "laowang";
	int age = 20;
	
	float height;
	float weight;
	char gender;
	
	Person(String name, int age, char gender, float height, float weight) {
		// �������������Ĺ��췽��������name��age���и�ֵ
		// �ؼ���this��ͨ��this()�����ñ����������Ĺ��췽��
		// ��һ�仰�����ǵ�һ��
		this(name, age);
		
		
		System.out.println("��������Ĺ��췽��������");
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		
	}
	
	
	/**
	 * �������һ�����췽������Ϊ�������û�в��������Խ��� �޲ι���
	 */
	Person() {
		System.out.println("Person����޲ι��췽����������");
		this.name = "xiaoming";
		this.age = 10;
	}
	
	Person(String name, int age) {
		this();
		System.out.println("Person����вι��췽����������");
		this.name = name;
		this.age = age;
	}
	
	/*
	// �����������춼���вι���
	Person(int age) {}
	Person(String name) {}
	Person(String name, int age) {}
	*/
}
