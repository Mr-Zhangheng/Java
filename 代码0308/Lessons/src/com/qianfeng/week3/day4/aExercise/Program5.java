package com.qianfeng.week3.day4.aExercise;

public class Program5 {
	public static void main(String[] args) {
		
	}
	
	/**
	 * ��֪�ַ���:"this is a test of java"
		ִ�����²���:
		1.ͳ�Ƴ��ַ�����s���ֵĴ���
		2.ȡ���ַ�����"test"
		3.���ַ���ת����һ���ַ����� .toCharArray()
		4.���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д,���������̨
		5.���ַ����Ǵ˰�������� "java of test a is this"
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
		// 1. ��ȡ��Ҫ���ҵ��±�
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
	
	// ��һ�����ʵ�����ĸ���д
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
