package com.qianfeng.week3.day4.aExercise;

public class Program3 {
	public static void main(String[] args) {
		
	}
	
	
	// 设计一个方法，将一个字符串进行反转。将字符串中指定部分进行反转 
	public static String reverse(String str, int start, int end) {
		// 转成StringBuilder进行运算
		StringBuilder sb = new StringBuilder(str);	   	// 1234567890
														// 1238765490
		// 取出中间部分
		String content = sb.substring(start, end);
		
		sb.replace(start, end, new StringBuilder(content).reverse().toString());
		
		return sb.toString();
	}
}
