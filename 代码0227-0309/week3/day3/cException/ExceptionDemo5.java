package com.qianfeng.week3.day3.cException;

import java.text.ParseException;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		Person xiaoming = new Person();
		
		xiaoming.age = 200;
		
		// xiaoming.show();
	}
}

class Animal {
	protected int age;
	
	public void show() throws ParseException {
		
		if (age > 0 && age < 500) {
			System.out.println(this.age);
		}
		else {
			throw new ArrayIndexOutOfBoundsException("Animal: 年龄不合法");
		}
	}
}

class Person extends Animal {
	
	@Override
	public void show() throws ParseException {
		if (age > 0 && age < 150) {
			System.out.println(this.age);
		}
		else {
			throw new ArrayIndexOutOfBoundsException("Person: 年龄不合法");
		}
	}
}