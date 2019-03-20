package com.qianfeng.week3.day1.eInnerClass.dAnonymous;

public class Program3 {
	public static void main(String[] args) {
		Dog[] dogs = null;
		
		
		MyArrays.sort(dogs, new MyComparator() {

			@Override
			public int compare(Dog dog1, Dog dog2) {
				return 0;
			}
		});
		
	}
}

class MyArrays {
	public static void sort(Dog[] array, MyComparator c) {
		Dog temp = null;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (c.compare(array[j], array[j+1]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}

class Dog {
	public String name;
	public int age;
}

interface MyComparator {
	int compare(Dog dog1, Dog dog2);
}
