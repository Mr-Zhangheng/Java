package com.qianfeng.week2.day5.bLambda.lambda;

import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		/*
		calculate(10, 20, new Add());
		calculate(10, 20, new Minus());
		*/
		
		
		/*
		int c = new Add().calculate(10, 20);
		int d = new Minus().calculate(20, 10);
		*/
		
		/*
		Calculate c = new Add();
		int d = c.calculate(10, 20);
		*/
		
		Calculate c = (int a, int b) -> {
			System.out.println("Lambda表达式执行了");
			return a + b;
		};
		int result = c.calculate(10, 20);
		System.out.println(result);
		
		
		Calculate d = (int a, int b) -> {
			return a - b;
		};
		d.calculate(10, 20);
		
		
		Calculate e = (int a, int b) -> {
			return a * b;
		};
		e.calculate(10, 20);
		
		Calculate f = (a, b) -> {return a + b;};
		
		// Demo g = a -> {return a * 2;};
		
		// Demo g = a -> System.out.println(a);
		
		Calculate g = (a, b) -> a + b;
		
		
		Calculate h = (a, b) -> a * b;
		int result2 = h.calculate(10, 20);
		System.out.println(result2);
		
		calculate(10, 20, (a, b) -> a * b);
		
		
		
		System.out.println("-------------------------------");
		
		
		// Lambda:
		Demo dd = a -> System.out.println(a);
		dd.add(10);
		
		// 将参数a带到指定的方法中去调用
		Demo i = System.out::println;
		
		// Demo i = Program::show;		
		i.add(100);
		
		
	}
	
	public static void show(int a) {
		System.out.println(a + "123");
	}
	
	
	public static void calculate(int a, int b, Calculate c) {
		int result = c.calculate(a, b);
		
		System.out.println(result);
	}
}	

