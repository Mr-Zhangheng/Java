package com.qianfeng.week2.day4.bObject;

public class Person extends Object {
	public String name;
	public int age;
	public char gender;
	
	public Dog dog;
	
	/**
	 * @param name
	 * @param age
	 * @param gender
	 */
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	/**
	 * 
	 */
	public Person() {
		super();
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (this == other)
			return true;
		if (this.getClass() != other.getClass())
			return false;
		
		// this和other都不是null, 且this和other类型相同
		Person a = (Person)other;
		
		return this.name.equals(a.name) && this.age == a.age && this.gender == a.gender;
	}
	
	@Override
	public String toString() {
		// Person: [name = xiaoming, age = 10, gender = 男]
		return String.format("Person: [name = %s, age = %d, gender = %c, dog = %s]", this.name, this.age, this.gender, this.dog);
	}
	
	
	
	
}
