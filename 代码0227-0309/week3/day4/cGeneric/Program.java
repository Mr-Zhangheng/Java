package com.qianfeng.week3.day4.cGeneric;

public class Program {
	public static void main(String[] args) {
		// test(100);
		
		
		// 实例化一个Person对象：
		Person<String> xiaoming = new Person<>();
		xiaoming.element = "123";
		
		Person<int[]> xiaohong = new Person<>();
		xiaohong.element = new int[]{123};
		
		Person<Integer> laowang = new Person<>();
		laowang.element = 1;
		
		Person xiaoli = new Person();
		// xiaoli.element
		
		
		Man man = new Man();
		
		Woman<String> w = new Woman<>();
		w.element = "";
		
	}
	
	public static void test(int a) {
		test2(a);
	}
	
	public static void test2(int b) {
		test3(b);
	}
	
	public static void test3(int c) {
		System.out.println(c);
	}
}
