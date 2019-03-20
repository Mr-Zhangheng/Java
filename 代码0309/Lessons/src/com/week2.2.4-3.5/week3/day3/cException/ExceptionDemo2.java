package com.qianfeng.week3.day3.cException;

import java.util.Random;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		// 对try-catch-finally语句的基本使用。
		
		try {
			Random random = new Random();
			int c = 10 / random.nextInt(3);
			System.out.println(c);
			
			
			int[] array = new int[5];
			array[5] = 10;
			
			System.out.println("数组赋值完成");
		}
		
		/*
		 * 1. 对所有的异常进行分别的处理
		 */
		/*
		catch(ArithmeticException e) {
			System.out.println("既然看到这句话了，说明try中的代码产生ArithmeticException异常了。");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("既然看到这句话了，说明try中的代码产生ArrayIndexOutOfBoundsException异常了。");
		}
		*/
		
		
		/*
		 * 2. 对某一些异常进行相同的处理
		 */
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("既然看到这句话了，说明try中的代码产生算术或者下标越界异常了");
			
			System.out.println("toString: " + e.toString());
			System.out.println("getMessage: " + e.getMessage());
			// 输出异常信息：异常信息的输出和未处理异常看到的输出结果是一样的
			// 但是此时并不会终止程序
			e.printStackTrace();	
		}
		
		/*
		 * 3. 对所有的异常做相同的处理
		catch (RuntimeException e) {
			System.out.println("既然看到这句话了，说明try中的代码产生了异常");
		}
		*/
		
		System.out.println("程序正常停止。");
	}
}
