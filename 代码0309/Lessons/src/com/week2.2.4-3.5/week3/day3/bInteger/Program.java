package com.qianfeng.week3.day3.bInteger;

public class Program {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		System.out.println(a == b);			// false
		System.out.println(a.equals(b));	// true
		
		
		Integer c = 10;
		Integer d = 10;
		
		System.out.println(c == d);			// true
		
		
		Integer e = 2000;
		Integer f = 2000;
		System.out.println(e == f);			// false
		
		
		// Integer c = 100;
		// ÏíÔªÔ­Ôò
		Integer g = Integer.valueOf(1000);
		Integer h = Integer.valueOf(1000);
		
		System.out.println(g == h);
		
	}
}
