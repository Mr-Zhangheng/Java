package com.qianfeng.week4.bSet;


import java.util.*;

public class Program2 {
	public static void main(String[] args) {
		
		Set<Person> sets = new HashSet<Person>();
		
		// 
		sets.add(new Person("xiaoming", 10));
		sets.add(new Person("xiaoming", 10));
		
		System.out.println(sets);
	}
	
	
}

class Person {
	public String name;
	public int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println("equals");
		if (other == null) return false;
		if (this == other) return true;
		if (this.getClass() != other.getClass()) return false;
		
		Person another = (Person) other;
		
		return this.name.equals(another.name) && this.age == another.age;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode");
		return Objects.hash(this.name, this.age);
	}
}
