package com.qianfeng.week4.day4.eObjectStream;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name;
	public int age;
	public char gender;
	public float height;
	public float weight;
	
	public Dog pet;
	
	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param height
	 * @param weight
	 */
	public Person(String name, int age, char gender, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	/**
	 * 
	 */
	public Person() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", weight="
				+ weight + ", pet=" + pet + "]";
	}
}

class Dog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name;
	public int age;
	
	public Gender gender;
	/**
	 * @param name
	 * @param age
	 */
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}


enum Gender {
	Male, Female
}









