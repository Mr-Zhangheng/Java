package com.qianfeng.week3.day4.aExercise;

public class Program2 {
	public static void main(String[] args) {
		
		String str = getResult("a    c s  sd a w r  f s a s d a sd a s");
		
		System.out.println(str);
	}
	
	// 设计一个方法，去除字符串中所有的空格
	
	public static String getResult(String str) {
		
		StringBuilder builder = new StringBuilder(str);
		
		// 循环判断str中是否还包含空格
		
		int index = -1;
		
		while ((index = builder.indexOf(" ")) != -1) {
			builder.deleteCharAt(index);
		}
		
		return builder.toString();
				
		/*
		String[] parts = str.split(" ");
		
		String ret = "";
		
		
		for (String ele : parts) {
			System.out.println(ele);
			ret += ele;
		}
				
		return ret;
		*/
		
		// return str.replace(" ", "");
	}
	
}
