package com.qianfeng.week3.day4.aExercise;

public class Program5 {
	public static void main(String[] args) {
		
	}
	
	/**
	 * 已知字符串:"this is a test of java"
		执行以下操作:
		1.统计出字符串中s出现的次数
		2.取出字符串中"test"
		3.将字符串转换成一个字符数组 .toCharArray()
		4.将字符串中每个单词的第一个字母变成大写,输出到控制台
		5.将字符串是此案倒叙输出 "java of test a is this"
	 */
	public static int one(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 's') {
				count++;
			}
		}
		return count;
	}
	
	public static String two(String str, String content) {
		// 1. 获取想要查找的下标
		int index = str.indexOf(content);
		if (index != -1) {
			return str.substring(index, index + content.length());
		}
		
		return "";
	}
	
	public static char[] three(String str) {
		// return str.toCharArray();
		
		char[] array = new char[str.length()];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
		}
		
		return array;
	}
	
	public static String four(String str) {
		
		String[] parts = str.split(" ");
		
		str = "";
		
		for (String ele : parts) {
			str += getUpper(ele) + " ";
		}
		
		return str.trim();
	}
	
	// hello, i am 12 years old
	
	// 把一个单词的首字母变大写
	public static String getUpper(String ele) {
		if (ele.length() == 0)
			return ele;
		
		char first = ele.charAt(0);
		
		first = Character.toUpperCase(first);
		
		if (ele.length() == 1)
			return String.valueOf(first);
		
		
		return first + ele.substring(1);
	}
	
	
}
