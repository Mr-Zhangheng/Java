package com.qianfeng.week2.day4.eInterface.interfaceUsagePro;

public class Person {
	public String name;
	public int age;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * 
	 */
	public Person() {
		super();
	}
	
	
}
