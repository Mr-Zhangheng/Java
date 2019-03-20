package com.qianfeng.week2.day5.aExercise.exercise6;

import java.util.Random;

public class Progrm {
	public static void main(String[] args) {
		
		// 1. 实例化一个数组，存储10个Person
		Person[] array = new Person[10];
		
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			array[i] = new Person("xiaoming", random.nextInt(30) + 1, '男', random.nextInt(30) + 150, random.nextInt(30) + 50);
		}
		
		for (Person p : array) {
			System.out.println(p);
		}
		
		System.out.println("--------------------------------------------");
		
		
		MyArrays.sort(array);
		
		for (Person p : array) {
			System.out.println(p);
		}
		
				
		/*
		MyArrays.sort(array, new MySortByAge());
		
		for (Person p : array) {
			System.out.println(p);
		}
		System.out.println("--------------------------------------------");
		
		MyArrays.sort(array, new MySortByHeight());
		
		for (Person p : array) {
			System.out.println(p);
		}
		System.out.println("--------------------------------------------");
		
		 */	
		
	}
}
