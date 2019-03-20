package com.qianfeng.week3.day2.cBox;

public class Program2 {
	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		// 此时，a和b的地址是不同的。所以此时==比较是false
		System.out.println(a == b);
		// 通过看equals的原码，我们发现，这时比较的是value属性的值
		System.out.println(a.equals(b));
		
		
		Integer c = 10;
		Integer d = 10;
		System.out.println(c == d);		// true 
	}
}
