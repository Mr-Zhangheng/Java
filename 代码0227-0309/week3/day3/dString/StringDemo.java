package com.qianfeng.week3.day3.dString;

public class StringDemo {
	public static void main(String[] args) {
		String a = "123";
		String b = "123";
		
		System.out.println(a == b);			// true
		System.out.println(a.equals(b));	// 
		
		
		String c = new String("123");
		String d = new String("123");
		
		System.out.println(c == d);			// false
		System.out.println(c == b);
	}
}
