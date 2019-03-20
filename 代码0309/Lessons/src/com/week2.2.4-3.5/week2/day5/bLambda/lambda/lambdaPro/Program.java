package com.qianfeng.week2.day5.bLambda.lambda.lambdaPro;

public class Program {

	public static void main(String[] args) {	
		
		// Demo1 d1 = a -> System.out.println(a);
		Demo1 d1 = Program::show;
		
		// Demo2 d2 = (a, b) -> System.out.println(a + b);
		// Demo2 d2 = System.out::println;
		Demo2 d2 = Program::show;
		d2.show(100, 200);
		
		Demo3 d3 = Program::show3;
		System.out.println(d3.show(100, 200));
	}
	
	public static void show(int a) {
		System.out.println("ProgramµÄshow·½·¨£º" + a);
	}
	
	public static void show(int a, int b) {
		System.out.println(a + b);
	}
	

	public static int show3(int a, int b) {
	 	return a + b;
	}

}
