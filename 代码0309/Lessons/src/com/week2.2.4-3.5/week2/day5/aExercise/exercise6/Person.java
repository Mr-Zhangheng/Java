package com.qianfeng.week2.day5.aExercise.exercise6;

public class Person implements MyComparable {
	String name;
	int age;
	char gender;
	float height;
	float weight;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", weight="
				+ weight + "]";
	}
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
	
	@Override
	public int compareTo(Object other) {

		if (other instanceof Person) {
			Person o = (Person)other;
			return this.age - o.age;
		}
		
		return 0;
	}
	
	
}
