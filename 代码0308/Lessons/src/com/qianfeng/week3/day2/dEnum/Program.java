package com.qianfeng.week3.day2.dEnum;

public class Program {
	public static void main(String[] args) {
		// 声明一个枚举类型的变量
		Weekday day = Weekday.Tuesday;
		Weekday day2 = Weekday.Sunday;
		
		// System.out.println(day.value);
		System.out.println(day.getValue());
		
		
		Weekday.Monday.show();
		Weekday.Saturday.show();
		
		System.out.println(Weekday.Monday.getValue());		// 0
		System.out.println(Weekday.Saturday.getValue());	// 666
		
		/*
		// 配合switch-case一块使用的
		switch(day) {
		case Monday:
			System.out.println("周一");
			break;
		case Tuesday:
			System.out.println("周二");
			break;
		case Wednesday:
			System.out.println("周三");
			break;
		}
		*/
		
		/*
		// 比较两个枚举对象
		int result = day.compareTo(day2);
		System.out.println(result);
		// 获取枚举常量的名字
		System.out.println(day.name());
		// 获取枚举常量的下标
		System.out.println(day.ordinal());
		
		// 获取枚举中所有的枚举常量
		Weekday[] days = Weekday.values();
		for (Weekday ele : days) {
			System.out.println(ele.name());
		}
		*/
		
		
		
	}
}	
