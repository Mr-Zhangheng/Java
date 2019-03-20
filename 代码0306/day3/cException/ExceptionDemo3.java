package com.qianfeng.week3.day3.cException;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		
		try {
			int[] array = new int[5];
			array[4] = 10;
		}
		finally {
			System.out.println("finally中的代码被执行了");
		}
		
		System.out.println("程序正常停止。");
		
		
		System.out.println(show(10, 0));
	}
	
	public static int show(int a, int b) {
		
		int c = 0;
		
		try {
			c = a / b;
			
			// 能走到这里，说明上面的除没有异常。
			return c;
		}
		catch (ArithmeticException e) {
			System.out.println("出现了一个算术异常");
			return c;
		}
		finally {
			// 在return之前，执行finally中的代码段
			System.out.println("finally中的代码执行了");
			c = -10;
		}
		
	}
	
	
}
