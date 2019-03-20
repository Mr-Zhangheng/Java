package com.qianfeng.week3.day1.aExercise.exercise1.commonModule;

public class MathUtil {
	//1）定义一个静态的，有一个参数，有返回值的方法，实现求一个数的绝对值。
	public static int abs(int number) {
		return number < 0 ? -number : number;
	}
	
	public static float abs(float number) {
		return number < 0 ? -number : number;
	}

	//2）定义一个静态的，有一个参数，有返回值的方法，实现求一个数的平方。 
	public static int pow(int number) {
		// return number * number;
		return pow(number, 2);
	}
	
	public static float pow(float number) {
		return number * number;
	}
	
	// 返回a和b次方
	public static int pow(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}
	
	//3）定义一个静态的，有两个参数，有返回值的方法，实现求两个数中的较大者。 
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}

	//4）定义一个静态的，有一个参数，有返回值的方法，实现对一个数进行四舍五入。
	// 将一个小数四舍五入到整数
	public static int getRound(float a) {
		
		int rest = (int)(a * 10) % 10;
		
		if (rest >= 5) {
			return (int)a + 1;
		}
		else {
			return (int)a;
		}
	}
}
